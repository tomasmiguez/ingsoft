package inge2.dataflow.zeroanalysis;

import soot.Local;
import soot.Unit;
import soot.jimple.DefinitionStmt;
import soot.toolkits.graph.UnitGraph;
import soot.toolkits.scalar.ForwardFlowAnalysis;

import java.util.HashMap;
import java.util.Map;
import java.util.Set;

/**
 * This class implements a may forward dataflow analysis that detects if a division by zero is possible in a given
 * control flow graph.
 */
public class DivisionByZeroAnalysis extends ForwardFlowAnalysis<Unit, ZeroAbstractSet> {

    /**
     * This map contains the units that are possibly offending (i.e., that may contain a division by zero).
     */
    private HashMap<Unit, Boolean> possibleDivisionByZero = new HashMap<>();

    public DivisionByZeroAnalysis(UnitGraph graph) {
        super(graph);
        // Performs the analysis and populates the possibleDivisionByZero map
        doAnalysis();
    }

    /**
     * This method is called for each unit in the control flow graph.
     * @param in the input flow
     * @param unit the current node
     * @param out the returned flow
     */
    @Override
    protected void flowThrough(ZeroAbstractSet in, Unit unit, ZeroAbstractSet out) {
        // Load all values from IN set into OUT set.
        out.clear();
        out.putAll(in);

        // Check if the unit is a definition statement.
        if (unit instanceof DefinitionStmt) {
            DefinitionStmt definition = (DefinitionStmt) unit;

            // Assume just local variables
            Local variable = (Local) definition.getLeftOp();

            // Create a visitor for the right operand of the assignment.
            ZeroValueVisitor visitor = new ZeroValueVisitor(in);
            ZeroAbstractValue resolvedValue = visitor.visit(definition.getRightOp()).done();

            if (visitor.getPossibleDivisionByZero()) {
                possibleDivisionByZero.put(unit, true);
            }

            // Set the ZeroAbstractValue in OUT set for the variable being assigned.
            out.setValue(variable.getName(), resolvedValue);
        }
    }

    @Override
    protected ZeroAbstractSet newInitialFlow() {
        return new ZeroAbstractSet();
    }

    /**
     * This method merges the two input flows into a single output flow.
     * @param input1 the first input flow
     * @param input2 the second input flow
     * @param output the returned flow
     */
    @Override
    protected void merge(ZeroAbstractSet input1, ZeroAbstractSet input2, ZeroAbstractSet output) {
        // TODO: IMPLEMENTAR
        throw new UnsupportedOperationException();
    }

    @Override
    protected void copy(ZeroAbstractSet source, ZeroAbstractSet dest) {
        dest.clear();
        dest.putAll(source);
    }

    /**
     * This method returns true if the given unit is possibly offending (i.e., that may contain a division by zero).
     * @param unit the unit to check.
     * @return true if the given unit is possibly offending (i.e., that may contain a division by zero).
     */
    public boolean unitIsOffending(Unit unit) {
        return possibleDivisionByZero.getOrDefault(unit, false);
    }

    /**
     * This method returns a dictionary with all expressions that have a possible division by zero.
     * The key for each entry is the line number of the expression.
     * @return a dictionary with all expressions that have a possible division by zero.
     */
    public Map<Integer, String> getPossibleDivisionByZeroExpressions() {
        Map<Integer, String> expressions = new HashMap<>();

        for (Unit unit : this.possibleDivisionByZero.keySet()) {
            if (this.possibleDivisionByZero.get(unit)) {
                expressions.put(unit.getJavaSourceStartLineNumber(), unit.toString());
            }
        }

        return expressions;
    }

    /**
     * This method returns the IN set for the given line number.
     * @param lineNumber the line number to check.
     * @return the IN set for the given line number.
     */
    public ZeroAbstractSet getINSetForLineNumber(int lineNumber) {
        for (Unit unit : this.unitToBeforeFlow.keySet()) {
            if (unit.getJavaSourceStartLineNumber() == lineNumber) {
                return this.unitToBeforeFlow.get(unit);
            }
        }

        return null;
    }
}
