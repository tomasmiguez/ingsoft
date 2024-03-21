package org.autotest;

import org.junit.jupiter.api.Test;
import org.reflections.Reflections;
import org.reflections.scanners.SubTypesScanner;

import java.io.IOException;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.util.*;
import java.util.stream.Collectors;

/**
 * Clase base para correr el mutation analysis sobre un conjunto de casos de tests para los mutantes de StackAr.
 */
public abstract class MutationAnalysisRunner {

    /**
     * La clase (mutante) que se está testeando actualmente.
     */
    private Class<? extends Stack> classBeingTested;

    /**
     * Conjunto de mutantes disponibles.
     */
    private Set<Class<? extends Stack>> mutants;

    /**
     * Diccionario que asocia el nombre de un mutante con su descripción.
     */
    private final Map<String, String> mutantsDescription = new HashMap<>();

    /**
     * Diccionario que asocia el nombre de un mutante con el resultado de correr los tests sobre él.
     * Es decir, si todos los tests pasaron (el mutante está vivo) o no (el mutante está muerto).
     */
    private final Map<String, Boolean> mutantsResult = new HashMap<>();

    /**
     * Corre el mutation analysis.
     */
    @Test
    public void run() {
        runTestsForOriginalClass();
        findAvailableMutants();
        runTestsForAllMutants();
        printMutantStatistics();
    }

    /**
     * Corre los tests para la clase original (StackAr).
     */
    private void runTestsForOriginalClass() {
        classBeingTested = StackAr.class;
        boolean allTestsPassed = runTestsForCurrentClassBeingTested();
        if (!allTestsPassed) {
            throw new RuntimeException("Los tests no pasaron para la clase original (StackAr). " +
                    "Asegúrese de que los tests pasan para la clase original antes de correr el mutation analysis.");
        }
    }

    /**
     * Método para buscar todos los mutantes disponibles en el paquete org.autotest.mutants.
     * Además, arma el diccionario de descripciones de mutantes.
     */
    private void findAvailableMutants() {
        Reflections reflections = new Reflections("org.autotest.mutants",
                new SubTypesScanner(false));
        mutants = reflections.getSubTypesOf(Stack.class);

        if (mutants.isEmpty()) {
            throw new RuntimeException("No se encontraron mutantes. " +
                    "Asegúrese de que están en el paquete org.autotest.mutants.");
        }

        // Buscamos la descripción de cada mutante.
        for (Class<? extends Stack> mutantClass : mutants) {
            String mutantName = mutantClass.getSimpleName();
            String mutantDescription = getMutantDescription(mutantClass.getSimpleName());
            mutantsDescription.put(mutantName, mutantDescription);
        }
    }

    /**
     * Corre los tests para todos los mutantes disponibles.
     */
    private void runTestsForAllMutants() {
        for (Class<? extends Stack> mutantClass : mutants) {
            classBeingTested = mutantClass;
            boolean allTestsPassed = runTestsForCurrentClassBeingTested();
            mutantsResult.put(mutantClass.getSimpleName(), allTestsPassed);
        }
    }

    /**
     * Corre los tests para la clase actual que está siendo testeada.
     * @return true si todos los tests pasaron, false si alguno falló.
     */
    public boolean runTestsForCurrentClassBeingTested() {
        System.out.println("-> Corriendo tests de " + this.getClass().getSimpleName() +
                " para la clase: " + classBeingTested.getSimpleName() +
                " (" + getMutantDescription(classBeingTested.getSimpleName()) + ")");

        try {
            // Obtenemos todos los métodos que empiezan con "test" y los ejecutamos por reflection.
            List<Method> testMethods = getTestMethods();
            for (Method testMethod : testMethods) {
                testMethod.invoke(this);
            }

            return true;
        } catch (Throwable e) {
            if (e instanceof InvocationTargetException) {
                e = ((InvocationTargetException) e).getTargetException();
            }

            if (useVerboseMode()) {
                System.out.println("   [X] Falló un test:");
                e.printStackTrace(System.out);
            } else {
                for (StackTraceElement stackTraceElement : e.getStackTrace()) {
                    if (stackTraceElement.getClassName().equals(this.getClass().getName())) {
                        System.out.println("   [X] Falló el test " + stackTraceElement.getMethodName()
                                + " en la línea " + stackTraceElement.getLineNumber());
                        break;
                    }
                }
            }

            return false;
        }
    }

    /**
     * Devuelve los métodos disponibles en esta clase que empiezan con "test".
     * @return una lista de métodos.
     */
    private List<Method> getTestMethods() {
        Method[] declaredMethods = this.getClass().getDeclaredMethods();
        return Arrays.stream(declaredMethods).filter(method ->
                method.getName().startsWith("test")).collect(Collectors.toList());
    }

    /**
     * Método auxiliar que crea un Stack usando el constructor por defecto (sin parámetros) de la clase mutante que
     * estamos testeando en este momento.
     * @return una instancia de Stack.
     */
    protected Stack createStack() throws Exception {
        try {
            return classBeingTested.newInstance();
        } catch (Throwable e) {
            // Un-wrappeamos la excepción que lanzó la invocación del constructor.
            if (e instanceof InvocationTargetException) {
                e = ((InvocationTargetException) e).getTargetException();
            }

            throw (Exception) e;
        }
    }

    /**
     * Método auxiliar que crea un Stack usando el constructor con un parámetro de la clase mutante que estamos
     * testeando en este momento.
     * @param capacity la capacidad del Stack a crear.
     * @return una instancia de Stack.
     */
    protected Stack createStack(int capacity) throws Exception {
        try {
            return classBeingTested.getConstructor(int.class).newInstance(capacity);
        } catch (Throwable e) {
            // Un-wrappeamos la excepción que lanzó la invocación del constructor.
            if (e instanceof InvocationTargetException) {
                e = ((InvocationTargetException) e).getTargetException();
            }
            throw (Exception) e;
        }
    }

    /**
     * Imprime estadísticas sobre las corridas de los tests para los mutantes.
     */
    private void printMutantStatistics() {
        System.out.println("-> Mutantes generados: " + mutantsResult.size());

        long aliveMutants = mutantsResult.values().stream().filter(alive -> alive).count();
        long killedMutants = mutantsResult.size() - aliveMutants;

        System.out.println("-> Mutantes eliminados: " + killedMutants);
        mutantsResult.entrySet().stream().filter(mutant -> !mutant.getValue()).forEach(mutant ->
                System.out.println("    - " + mutant.getKey() + " (" + getMutantDescription(mutant.getKey()) + ")"));

        System.out.println("-> Mutantes vivos: " + aliveMutants);
        mutantsResult.entrySet().stream().filter(mutant -> mutant.getValue()).forEach(mutant ->
                System.out.println("    - " + mutant.getKey() + " (" + getMutantDescription(mutant.getKey()) + ")"));

        long mutationScore = (killedMutants * 100) / mutantsResult.size();
        System.out.println("-> Mutation score: " + mutationScore + "%");
    }

    /**
     * Devuelve la descripción del mutante con el nombre pasado por parámetro.
     * Si no se encuentra la descripción, se busca en el archivo correspondiente al mutante.
     * @param mutantSimpleClassName el nombre del mutante.
     * @return la descripción del mutante.
     */
    private String getMutantDescription(String mutantSimpleClassName) {
        if (mutantsDescription.containsKey(mutantSimpleClassName)) {
            return mutantsDescription.get(mutantSimpleClassName);
        }

        if (mutantSimpleClassName.equals("StackAr")) {
            return "Stack original";
        }

        // Buscamos el archivo correspondiente a este mutante en el directorio de mutantes.
        String mutantFileName = mutantSimpleClassName + ".java";
        String mutantFilePath = "src/main/java/org/autotest/mutants/" + mutantFileName;

        // Leemos la cuarta línea del archivo
        String mutantDescription = "";
        try {
            mutantDescription = Files.readAllLines(Paths.get(mutantFilePath)).get(3).substring(3);
        } catch (IOException e) {
            e.printStackTrace();
        }

        return mutantDescription;
    }

    /**
     * Devuelve true si se debe mostrar el stack trace completo de los errores, o false si se debe mostrar sólo el
     * nombre del test que falló.
     */
    protected boolean useVerboseMode() {
        return true;
    }
}
