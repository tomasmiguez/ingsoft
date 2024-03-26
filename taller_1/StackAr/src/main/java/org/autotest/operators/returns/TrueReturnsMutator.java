package org.autotest.operators.returns;

import org.autotest.operators.MutationOperator;
import spoon.reflect.code.CtExpression;
import spoon.reflect.code.CtReturn;
import spoon.reflect.declaration.CtElement;

import java.util.Arrays;
import java.util.List;

/**
 * Operador de mutación basado en https://pitest.org/quickstart/mutators/#TRUE_RETURNS
 * <p>
 * Este operador reemplaza los valores de retorno de las funciones que devuelven booleano por true.
 */
public class TrueReturnsMutator extends MutationOperator {
    @Override
    public boolean isToBeProcessed(CtElement candidate) {
        if (!(candidate instanceof CtReturn)) {
            return false;
        }

        CtReturn op = (CtReturn) candidate;
        return getReturnedExpressionType(op).equals("boolean") && !op.getReturnedExpression().toString().equals("true");
    }


    private static String getReturnedExpressionType(CtReturn op) {
        return op.getReturnedExpression().getType().toString();
    }


    @Override
    public void process(CtElement candidate) {
        CtReturn op = (CtReturn) candidate;
        op.setReturnedExpression(op.getFactory().Code().createLiteral(true));
    }

    @Override
    public String describeMutation(CtElement candidate) {
        CtReturn op = (CtReturn) candidate;
        return this.getClass().getSimpleName() + ": Se reemplazó " +
                op.getReturnedExpression() + " por true en la línea " + op.getPosition().getLine() + ".";
    }
}
