package org.autotest;

import org.autotest.operators.MutationOperator;
import org.reflections.Reflections;

import java.util.ArrayList;
import java.util.List;
import java.util.Set;

/**
 * Clase principal del programa.
 */
public class Main {

    /**
     * Punto de entrada del programa.
     */
    public static void main(String[] args) {
        try {
            // Ruta del archivo Java a mutar.
            String targetJavaFile = "src/main/java/org/autotest/StackAr.java";

            // Buscamos todos los operadores de mutación que están disponibles.
            List<MutationOperator> operators = getOperators();

            // Corremos el generador de mutantes.
            MutantsGenerator generator = new MutantsGenerator(targetJavaFile, operators);
            List<Mutant> mutants = generator.run();

            // Escribimos los mutantes generados a disco.
            Mutant.cleanMutantsInFolder("src/main/java/");
            for (Mutant mutant : mutants) {
                mutant.writeToFolder("src/main/java/");
            }
        } catch (Exception e) {
            System.out.println("Ocurrió una excepción en Main: " + e.getMessage());
            e.printStackTrace();
        }
    }

    /**
     * Busca todos los operadores de mutación disponibles en el paquete org.autotest.operators.
     */
    public static List<MutationOperator> getOperators() {
        Reflections reflections = new Reflections("org.autotest.operators");
        Set<Class<? extends MutationOperator>> mutationOperatorClasses = reflections.getSubTypesOf(MutationOperator.class);

        List<MutationOperator> mutators = new ArrayList<>();
        for (Class<? extends MutationOperator> op : mutationOperatorClasses) {
            try {
                mutators.add(op.newInstance());
            } catch (InstantiationException | IllegalAccessException e) {
                System.out.println("No se pudo instanciar el operador de mutación con clase: " + op.getName());
                e.printStackTrace();
            }
        }
        return mutators;
    }
}
