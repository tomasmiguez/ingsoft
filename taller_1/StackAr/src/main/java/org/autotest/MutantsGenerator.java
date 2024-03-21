package org.autotest;

import org.autotest.operators.MutationOperator;
import spoon.Launcher;
import spoon.reflect.declaration.CtClass;
import spoon.reflect.visitor.filter.TypeFilter;

import java.util.ArrayList;
import java.util.List;

/**
 * Clase que se encarga de generar los mutantes para un archivo de código fuente.
 */
public class MutantsGenerator {

    /**
     * La ruta del archivo con el código fuente que se va a mutar.
     */
    private final String pathToSourceCodeToBeMutated;

    /**
     * Los operadores de mutación que se van a aplicar.
     */
    private final List<MutationOperator> mutators;

    public MutantsGenerator(String pathToSourceCodeToBeMutated,
                            List<MutationOperator> mutationOperators) {

        this.pathToSourceCodeToBeMutated = pathToSourceCodeToBeMutated;
        this.mutators = mutationOperators;
    }

    /**
     * Genera los mutantes para el archivo de código fuente.
     */
    public List<Mutant> run() {
        List<Mutant> mutants = new ArrayList<>();

        // Obtenemos la representación de Spoon para la clase que queremos mutar.
        Launcher spoonLauncher = new Launcher();
        CtClass originalSpoonClass = getSpoonClassToBeMutated(spoonLauncher);

        // Generamos todos los mutantes posibles para cada operador.
        for (MutationOperator mutator : mutators) {
            mutants.addAll(mutator.createMutants(spoonLauncher, originalSpoonClass));
        }

        return mutants;
    }

    /**
     * Devuelve la representación de Spoon para la clase que queremos mutar.
     * @param spoonLauncher El launcher de Spoon.
     */
    private CtClass getSpoonClassToBeMutated(Launcher spoonLauncher) {
        spoonLauncher.addInputResource(pathToSourceCodeToBeMutated);
        spoonLauncher.buildModel();
        CtClass originalSpoonClass = (CtClass) spoonLauncher.getFactory().Package().getRootPackage()
                .getElements(new TypeFilter(CtClass.class)).get(0);
        return originalSpoonClass;
    }
}
