package inge2.dataflow.util.visitor;

/**
 * Exception thrown when a {@link soot.Value} sub-type is not implemented in {@link inge2.dataflow.util.visitor.AbstractValueVisitor}.
 */
public class VisitorNotImplementedForType extends RuntimeException {
    public VisitorNotImplementedForType(String name) {
        super(name);
    }
}
