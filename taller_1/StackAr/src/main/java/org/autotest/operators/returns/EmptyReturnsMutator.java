package org.autotest.operators.returns;

import org.autotest.operators.MutationOperator;
import spoon.reflect.code.CtExpression;
import spoon.reflect.code.CtReturn;
import spoon.reflect.declaration.CtElement;

import java.util.Arrays;
import java.util.List;

/**
 * Operador de mutación basado en https://pitest.org/quickstart/mutators/#EMPTY_RETURNS
 *
 * Este operador reemplaza los valores de retorno de las funciones que devuelven String o int por valores "vacíos".
 * Por ejemplo, si la función tiene que devolver un String se reemplaza por "".
 * Si tiene que devolver un int se reemplaza por 0.
 */
public class EmptyReturnsMutator extends MutationOperator {
    @Override
    public boolean isToBeProcessed(CtElement candidate) {
        if (!(candidate instanceof CtReturn)) {
            return false;
        }

        CtReturn op = (CtReturn)candidate;
        String type = getReturnedExpressionType(op);
        List<String> targetTypes = Arrays.asList(
            "java.lang.String",
            "int"
        );
        return targetTypes.contains(type);
    }

    @Override
    public void process(CtElement candidate) {
        CtReturn op = (CtReturn)candidate;
        op.setReturnedExpression(getEmptyValueForReturnExpression(op));
    }

    private static String getReturnedExpressionType(CtReturn op) {
        return op.getReturnedExpression().getType().toString();
    }

    private CtExpression getEmptyValueForReturnExpression(CtReturn op) {
        String returnType = getReturnedExpressionType(op);
        switch (returnType) {
            case "java.lang.String":
                return op.getFactory().Code().createLiteral("");
            case "int":
                return op.getFactory().Code().createLiteral(0);
        }
        return null;
    }

    @Override
    public String describeMutation(CtElement candidate) {
        CtReturn op = (CtReturn)candidate;
        return this.getClass().getSimpleName() + ": Se reemplazó " +
                op.getReturnedExpression().toString() + " por " + getEmptyValueForReturnExpression(op).toString() +
                " en la línea " + op.getPosition().getLine() + ".";
    }
}
