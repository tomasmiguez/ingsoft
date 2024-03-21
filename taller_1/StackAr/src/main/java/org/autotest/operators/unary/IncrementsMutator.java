package org.autotest.operators.unary;

import org.autotest.helpers.UnaryOperatorKindToString;
import org.autotest.operators.MutationOperator;
import spoon.reflect.code.CtUnaryOperator;
import spoon.reflect.code.UnaryOperatorKind;
import spoon.reflect.declaration.CtElement;

import java.util.Arrays;
import java.util.List;

/**
 * Operador de mutación basado en https://pitest.org/quickstart/mutators/#INCREMENTS
 *
 * Este operador de mutación reemplaza los operadores de incremento y decremento de variables locales (variables de pila).
 */
public class IncrementsMutator extends MutationOperator {
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
