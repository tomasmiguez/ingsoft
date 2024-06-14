package inge2.dataflow.pointstoanalysis;

import soot.jimple.*;
import soot.jimple.internal.JInstanceFieldRef;
import soot.jimple.internal.JimpleLocal;

import java.util.Collection;
import java.util.Collections;
import java.util.HashSet;
import java.util.Set;
import java.util.stream.Collectors;

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

        Set<String> nodeSet = new HashSet<String>();
        nodeSet.add(nodeName);

        pointsToGraph.setNodesForVariable(leftVariableName, nodeSet);
    }

    private void processAssignLocalToLocal(AssignStmt stmt) {
        String leftVariableName = stmt.getLeftOp().toString();
        String rightVariableName = stmt.getRightOp().toString();

        pointsToGraph.setNodesForVariable(
                leftVariableName,
                pointsToGraph.getNodesForVariable(rightVariableName)
        );
    }

    private void processAssignLocalToField(AssignStmt stmt) {
        JInstanceFieldRef leftFieldRef = (JInstanceFieldRef) stmt.getLeftOp();
        String leftVariableName = leftFieldRef.getBase().toString();
        String fieldName = leftFieldRef.getField().getName();
        String rightVariableName = stmt.getRightOp().toString();

        Set<String> leftNodes = pointsToGraph.getNodesForVariable(leftVariableName);
        Set<String> rightNodes = pointsToGraph.getNodesForVariable(rightVariableName);

        for (String leftNode : leftNodes) {
            for (String rightNode : rightNodes) {
                pointsToGraph.addEdge(leftNode, fieldName, rightNode);
            }
        }
    }

    private void processAssignFieldToLocal(AssignStmt stmt) {
        String leftVariableName = stmt.getLeftOp().toString();
        JInstanceFieldRef rightFieldRef = (JInstanceFieldRef) stmt.getRightOp();
        String rightVariableName = rightFieldRef.getBase().toString();
        String fieldName = rightFieldRef.getField().getName();

        Set<String> nodesReachableFromRightVarField = pointsToGraph.getNodesForVariable(rightVariableName)
                .stream()
                .flatMap((node) -> pointsToGraph.getReachableNodesByField(node, fieldName).stream())
                .collect(Collectors.toSet());

        pointsToGraph.setNodesForVariable(
                leftVariableName,
                nodesReachableFromRightVarField
        );
    }
}
