package inge2.dataflow.util.visitor;

import soot.Local;
import soot.Value;
import soot.jimple.*;

/**
 * Abstract visitor implementations. Each new covered {@link Value} sub-type has to be added here.
 *
 * @param <T>
 */
public abstract class AbstractValueVisitor<T> implements ValueVisitor<T> {

    @Override
    public final ValueVisitor<T> visit(Value value) {
        if (value instanceof IntConstant) {
            visitIntegerConstant(((IntConstant) value).value);
        } else if (value instanceof BinopExpr) {
            doVisitBinaryExpression((BinopExpr) value);
        } else if (value instanceof Local) {
            visitLocal((Local) value);
        } else if (value instanceof ParameterRef) {
            visitParameterRef((ParameterRef) value);
        } else if (value instanceof ThisRef) {
            // do nothing
        } else {
            throw new VisitorNotImplementedForType(value.getClass().getName());
        }
        return this;
    }

    public final void doVisitBinaryExpression(BinopExpr value) {
        // Visit the left and right operands of the binary expression recursively.
        T leftVisitorResult = cloneVisitor().visit(value.getOp1()).done();
        T rightVisitorResult = cloneVisitor().visit(value.getOp2()).done();

        if (value instanceof AddExpr) {
            visitAddExpression(leftVisitorResult, rightVisitorResult);
        } else if (value instanceof SubExpr) {
            visitSubExpression(leftVisitorResult, rightVisitorResult);
        } else if (value instanceof MulExpr) {
            visitMulExpression(leftVisitorResult, rightVisitorResult);
        } else if (value instanceof DivExpr) {
            visitDivExpression(leftVisitorResult, rightVisitorResult);
        } else {
            throw new VisitorNotImplementedForType(value.getClass().getName());
        }
    }

    protected abstract void visitLocal(Local variable);

    protected abstract void visitDivExpression(T leftOperand, T rightOperand);

    protected abstract void visitMulExpression(T leftOperand, T rightOperand);

    protected abstract void visitSubExpression(T leftOperand, T rightOperand);

    protected abstract void visitAddExpression(T leftOperand, T rightOperand);

    protected abstract void visitIntegerConstant(int value);

    protected abstract void visitParameterRef(ParameterRef parameter);
}
