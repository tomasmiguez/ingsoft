package org.autotest.operators.binary;

import org.autotest.helpers.BinaryOperatorKindToString;
import org.autotest.operators.MutationOperator;
import spoon.reflect.code.BinaryOperatorKind;
import spoon.reflect.code.CtBinaryOperator;
import spoon.reflect.declaration.CtElement;

import java.util.Arrays;
import java.util.List;

/**
 * Operador de mutación basado en https://pitest.org/quickstart/mutators/#MATH
 *
 * Este operador de mutación reemplaza las operaciones aritméticas binarias para enteros o punto flotante con otra operación.
 */
public class MathMutator extends MutationOperator {
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
