package org.autotest.operators.returns;

import org.autotest.operators.MutationOperator;
import spoon.reflect.code.CtExpression;
import spoon.reflect.code.CtReturn;
import spoon.reflect.declaration.CtElement;

import java.util.Arrays;
import java.util.List;

/**
 * Operador de mutación basado en https://pitest.org/quickstart/mutators/#FALSE_RETURNS
 *
 * Este operador reemplaza los valores de retorno de las funciones que devuelven booleano por false.
 */
public class FalseReturnsMutator extends MutationOperator {
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
