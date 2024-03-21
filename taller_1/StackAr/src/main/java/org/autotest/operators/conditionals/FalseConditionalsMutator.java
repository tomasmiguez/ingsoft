package org.autotest.operators.conditionals;

import org.autotest.operators.MutationOperator;
import spoon.reflect.code.CtIf;
import spoon.reflect.declaration.CtElement;

/**
 * Operador de mutación basado en https://pitest.org/quickstart/mutators/#REMOVE_CONDITIONALS
 *
 * Este operador reemplaza los valores en las condiciones de guardas por false.
 */
public class FalseConditionalsMutator extends MutationOperator {
    @Override
    public boolean isToBeProcessed(CtElement candidate) {
        // COMPLETAR
        return false;
    }

    @Override
    public void process(CtElement candidate) {
        // COMPLETAR
    }

    @Override
    public String describeMutation(CtElement candidate) {
        // COMPLETAR
        return null;
    }
}
