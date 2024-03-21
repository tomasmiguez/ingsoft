package org.autotest.operators;

import org.autotest.Mutant;
import spoon.Launcher;
import spoon.processing.AbstractProcessor;
import spoon.reflect.code.CtComment;
import spoon.reflect.declaration.CtClass;
import spoon.reflect.declaration.CtElement;

import java.util.ArrayList;
import java.util.List;

/**
 * Clase base para todos los operadores de mutación.
 */
public abstract class MutationOperator  extends AbstractProcessor<CtElement> {

    /**
     * Produce un String que describe la mutación realizada por este operador para un nodo del AST.
     * @param candidate Nodo del AST.
     */
    public abstract String describeMutation(CtElement candidate);

    /**
     * Produce todos los mutantes posibles por este operador para una clase.
     * @param spoonLauncher Instancia de Spoon.
     * @param originalSpoonClass Clase original a ser mutada.
     */
    public List<Mutant> createMutants(Launcher spoonLauncher, CtClass originalSpoonClass) {
        List<Mutant> mutants = new ArrayList<>();

        // Buscamos todos los elementos de la clase original que pueden ser mutados por este operador.
        List<CtElement> elementsToBeMutated = originalSpoonClass.getElements(this::isToBeProcessed);

        // Para cada elemento que puede ser mutado, creamos un mutante.
        for (CtElement astElement : elementsToBeMutated) {
            Mutant mutant = createMutant(spoonLauncher, originalSpoonClass, astElement);
            mutants.add(mutant);
        }

        return mutants;
    }

    /**
     * Crea un mutante a partir de un elemento del AST.
     * @param spoonLauncher Instancia de Spoon.
     * @param originalSpoonClass Clase original a ser mutada.
     * @param astElement Elemento del AST a ser mutado.
     */
    private Mutant createMutant(Launcher spoonLauncher, CtClass originalSpoonClass, CtElement astElement) {
        // Clonamos el elemento del AST a mutar.
        CtElement clonedAstElement = spoonLauncher.getFactory().Core().clone(astElement);

        // Mutamos el elemento clonado.
        process(clonedAstElement);

        // Reemplazamos temporariamente el elemento original por el mutado.
        astElement.replace(clonedAstElement);

        // Creamos una nueva clase de Spoon que contiene el código mutado.
        CtClass mutatedSpoonClass = spoonLauncher.getFactory().Core().clone(clonedAstElement.getParent(CtClass.class));

        // Le asignamos a la nueva clase el mismo paquete que la clase original.
        mutatedSpoonClass.setParent(originalSpoonClass.getParent());

        // Agregamos un comentario JavaDoc con la descripción del mutante.
        String mutantDescription = describeMutation(astElement);
        mutatedSpoonClass.addComment(spoonLauncher.getFactory().Code().createComment(mutantDescription,
                        CtComment.CommentType.JAVADOC));

        // Cramos la instancia del mutante.
        Mutant mutant = new Mutant(mutatedSpoonClass, mutantDescription);

        // Restauramos el elemento original.
        clonedAstElement.replace(astElement);

        return mutant;
    }
}
