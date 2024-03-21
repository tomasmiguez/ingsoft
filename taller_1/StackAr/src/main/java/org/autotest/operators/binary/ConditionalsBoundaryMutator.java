package org.autotest.operators.binary;

import org.autotest.helpers.BinaryOperatorKindToString;
import org.autotest.operators.MutationOperator;
import spoon.reflect.code.BinaryOperatorKind;
import spoon.reflect.code.CtBinaryOperator;
import spoon.reflect.declaration.CtElement;

import java.util.Arrays;
import java.util.List;

/**
 * Operador de mutación basado en https://pitest.org/quickstart/mutators/#CONDITIONALS_BOUNDARY
 *
 * Este operador de mutación reemplaza los operadores relacionales <, <=, >, >= por su contraparte de límite.
 * Por ejemplo, el operador <= se reemplaza por el operador <.
 */
public class ConditionalsBoundaryMutator extends MutationOperator {
    @Override
    public boolean isToBeProcessed(CtElement candidate) {
        if (!(candidate instanceof CtBinaryOperator)) {
            return false;
        }

        CtBinaryOperator op = (CtBinaryOperator)candidate;
        List<BinaryOperatorKind> targetOperations = Arrays.asList(
            BinaryOperatorKind.GE, // >=
            BinaryOperatorKind.GT, // >
            BinaryOperatorKind.LE, // <=
            BinaryOperatorKind.LT // <
        );
        return targetOperations.contains(op.getKind());
    }

    @Override
    public void process(CtElement candidate) {
        CtBinaryOperator op = (CtBinaryOperator)candidate;
        op.setKind(getReplacement(op.getKind()));
    }

    public BinaryOperatorKind getReplacement(BinaryOperatorKind kind) {
        switch (kind) {
            case GE:
                return BinaryOperatorKind.GT;
            case GT:
                return BinaryOperatorKind.GE;
            case LE:
                return BinaryOperatorKind.LT;
            case LT:
                return BinaryOperatorKind.LE;
        }
        return null;
    }

    @Override
    public String describeMutation(CtElement candidate) {
        CtBinaryOperator op = (CtBinaryOperator)candidate;
        return this.getClass().getSimpleName() + ": Se reemplazó " +
                BinaryOperatorKindToString.get(op.getKind()) + " por " + BinaryOperatorKindToString.get(getReplacement(op.getKind())) +
                " en la línea " + op.getPosition().getLine() + ".";
    }
}
