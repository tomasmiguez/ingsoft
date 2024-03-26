package org.autotest.operators.conditionals;

import org.autotest.helpers.BinaryOperatorKindToString;
import org.autotest.operators.MutationOperator;
import spoon.reflect.code.CtBinaryOperator;
import spoon.reflect.code.CtIf;
import spoon.reflect.declaration.CtElement;

/**
 * Operador de mutación basado en https://pitest.org/quickstart/mutators/#REMOVE_CONDITIONALS
 * <p>
 * Este operador reemplaza los valores en las condiciones de guardas por true.
 */
public class TrueConditionalsMutator extends MutationOperator {
    @Override
    public boolean isToBeProcessed(CtElement candidate) {
        if (!(candidate instanceof CtIf)) {
            return false;
        }
        CtIf anIf = (CtIf) candidate;
        return !anIf.getCondition().toString().equals("true");
    }

    @Override
    public void process(CtElement candidate) {
        CtIf anIf = (CtIf) candidate;
        anIf.setCondition(anIf.getFactory().createLiteral(true));
    }

    @Override
    public String describeMutation(CtElement candidate) {
        CtIf anIf = (CtIf) candidate;
        return this.getClass().getSimpleName() + ": Se reemplazó " +
                anIf.getCondition().toString() + " por true en la línea " + anIf.getCondition().getPosition().getLine() + ".";
    }
}
