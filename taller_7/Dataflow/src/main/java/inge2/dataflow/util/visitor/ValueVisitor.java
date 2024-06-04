package inge2.dataflow.util.visitor;

import soot.Value;

/**
 * Interface for a visitor that recursively visits a Soot's {@link Value} in order to produce an aggregated result.
 * @param <T> The result type.
 */
public interface ValueVisitor<T> {

    /**
     * Visits the given {@link Value}, and recursively visit all nested values in order to produce an aggregated result.
     * @param value the {@link Value} to visit.
     * @return this visitor.
     */
    ValueVisitor<T> visit(Value value);

    /**
     * Gets the result of this visitor. MUST be called after {@link ValueVisitor#visit(Value)}.
     * @return the result produced by this visitor.
     */
    T done();

    /**
     * User-defined clone method, to have a common interface for when a new {@link ValueVisitor} has to be launched against an
     * internal value. For example, in the right operand of a {@link soot.jimple.DefinitionStmt}. Usually used when the visitor
     * needs some collaborators for working.
     * @return a new visitor
     */
    ValueVisitor<T> cloneVisitor();

}
