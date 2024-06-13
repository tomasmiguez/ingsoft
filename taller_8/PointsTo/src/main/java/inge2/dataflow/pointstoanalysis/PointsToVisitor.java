package inge2.dataflow.pointstoanalysis;

import soot.jimple.*;
import soot.jimple.internal.JInstanceFieldRef;
import soot.jimple.internal.JimpleLocal;

public class PointsToVisitor extends AbstractStmtSwitch<Void> {

    private final PointsToGraph pointsToGraph;

    public PointsToVisitor(PointsToGraph pointsToGraph) {
        this.pointsToGraph = pointsToGraph;
    }

    @Override
    public void caseAssignStmt(AssignStmt stmt) {
        boolean isLeftLocal = stmt.getLeftOp() instanceof JimpleLocal;
        boolean isRightLocal = stmt.getRightOp() instanceof JimpleLocal;

        boolean isLeftField = stmt.getLeftOp() instanceof JInstanceFieldRef;
        boolean isRightField = stmt.getRightOp() instanceof JInstanceFieldRef;

        boolean isRightNew = stmt.getRightOp() instanceof AnyNewExpr;

        if (isRightNew) { // x = new A()
            processAssignToNewObject(stmt);
        } else if (isLeftLocal && isRightLocal) { // x = y
            processAssignLocalToLocal(stmt);
        } else if (isLeftField && isRightLocal) { // x.f = y
            processAssignLocalToField(stmt);
        } else if (isLeftLocal && isRightField) { // x = y.f
            processAssignFieldToLocal(stmt);
        }
    }

    private void processAssignToNewObject(AssignStmt stmt) {
        String leftVariableName = stmt.getLeftOp().toString();
        String nodeName = pointsToGraph.getNodeName(stmt);

        // TODO: IMPLEMENTAR
        throw new UnsupportedOperationException("Not implemented yet");
    }

    private void processAssignLocalToLocal(AssignStmt stmt) {
        String leftVariableName = stmt.getLeftOp().toString();
        String rightVariableName = stmt.getRightOp().toString();

        // TODO: IMPLEMENTAR
        throw new UnsupportedOperationException("Not implemented yet");
    }

    private void processAssignLocalToField(AssignStmt stmt) {
        JInstanceFieldRef leftFieldRef = (JInstanceFieldRef) stmt.getLeftOp();
        String leftVariableName = leftFieldRef.getBase().toString();
        String fieldName = leftFieldRef.getField().getName();
        String rightVariableName = stmt.getRightOp().toString();

        // TODO: IMPLEMENTAR
        throw new UnsupportedOperationException("Not implemented yet");
    }

    private void processAssignFieldToLocal(AssignStmt stmt) {
        String leftVariableName = stmt.getLeftOp().toString();
        JInstanceFieldRef rightFieldRef = (JInstanceFieldRef) stmt.getRightOp();
        String rightVariableName = rightFieldRef.getBase().toString();
        String fieldName = rightFieldRef.getField().getName();

        // TODO: IMPLEMENTAR
        throw new UnsupportedOperationException("Not implemented yet");
    }
}
