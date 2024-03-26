package org.autotest.operators.unary;

import org.autotest.helpers.BinaryOperatorKindToString;
import org.autotest.helpers.UnaryOperatorKindToString;
import org.autotest.operators.MutationOperator;
import spoon.reflect.code.*;
import spoon.reflect.declaration.CtElement;

import java.util.Arrays;
import java.util.List;

/**
 * Operador de mutación basado en https://pitest.org/quickstart/mutators/#INCREMENTS
 * <p>
 * Este operador de mutación reemplaza los operadores de incremento y decremento de variables locales (variables de pila).
 */
public class IncrementsMutator extends MutationOperator {
    @Override
    public boolean isToBeProcessed(CtElement candidate) {
        if (!(candidate instanceof CtUnaryOperator)) {
            return false;
        }
        CtUnaryOperator op = (CtUnaryOperator) candidate;
        List<UnaryOperatorKind> targetOperations = Arrays.asList(
                UnaryOperatorKind.POSTINC, // x++
                UnaryOperatorKind.PREINC, // ++x
                UnaryOperatorKind.POSTDEC, // x--
                UnaryOperatorKind.PREDEC // --x
        );
        return targetOperations.contains(op.getKind());
    }

    @Override
    public void process(CtElement candidate) {
        CtUnaryOperator op = (CtUnaryOperator) candidate;
        op.setKind(getReplacement(op.getKind()));
    }

    public UnaryOperatorKind getReplacement(UnaryOperatorKind kind) {
        switch (kind) {
            case POSTINC:
                return UnaryOperatorKind.POSTDEC;
            case PREINC:
                return UnaryOperatorKind.PREDEC;
            case POSTDEC:
                return UnaryOperatorKind.POSTINC;
            case PREDEC:
                return UnaryOperatorKind.PREINC;
        }
        return null;
    }

    @Override
    public String describeMutation(CtElement candidate) {
        CtUnaryOperator op = (CtUnaryOperator) candidate;
        return this.getClass().getSimpleName() + ": Se reemplazó " +
                UnaryOperatorKindToString.get(op.getKind()) + " por " + UnaryOperatorKindToString.get(getReplacement(op.getKind())) +
                " en la línea " + op.getPosition().getLine() + ".";
    }
}
