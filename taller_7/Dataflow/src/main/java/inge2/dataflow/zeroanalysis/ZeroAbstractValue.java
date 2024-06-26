package inge2.dataflow.zeroanalysis;

/**
 * This enum represents the possible values of the zero analysis for a variable.
 */
public enum ZeroAbstractValue {

    /**
     * We don't have information about the variable.
     */
    BOTTOM("bottom"),

    /**
     * The variable is not zero.
     */
    NOT_ZERO("not-zero"),

    /**
     * The variable is zero.
     */
    ZERO("zero"),

    /**
     * The variable may be (or not) zero.
     */
    MAYBE_ZERO("maybe-zero");

    /**
     * The name of the ZeroAbstractValue.
     */
    private final String name;

    @Override
    public String toString() {
        return this.name;
    }

    ZeroAbstractValue(String name) {
        this.name = name;
    }

    /**
     * Returns the result of the addition between this ZeroAbstractValue and another.
     * @param another the other ZeroAbstractValue.
     * @return the result of the addition.
     */
    public ZeroAbstractValue add(ZeroAbstractValue another) {
        // Implmentado en base a la tabla de la parte 1
        switch (this) {
            case BOTTOM:
                return BOTTOM;
            case ZERO:
                return another;
            case NOT_ZERO:
                switch (another) {
                    case BOTTOM:
                        return BOTTOM;
                    case ZERO:
                        return NOT_ZERO;
                    case NOT_ZERO:
                    case MAYBE_ZERO:
                        return MAYBE_ZERO;
                }
            case MAYBE_ZERO:
                switch (another) {
                    case BOTTOM:
                        return BOTTOM;
                    case NOT_ZERO:
                    case ZERO:
                    case MAYBE_ZERO:
                        return MAYBE_ZERO;
                }
        }
        throw new IllegalStateException("Unexpected value: " + this);
    }

    /**
     * Returns the result of the division between this ZeroAbstractValue and another.
     * @param another the other ZeroAbstractValue.
     * @return the result of the division.
     */
    public ZeroAbstractValue divideBy(ZeroAbstractValue another) {
        // Implmentado en base a la tabla de la parte 1
        switch (this) {
            case BOTTOM:
                return BOTTOM;
            case ZERO:
                switch (another) {
                    case BOTTOM:
                    case ZERO:
                        return BOTTOM;
                    case NOT_ZERO:
                    case MAYBE_ZERO:
                        return ZERO;
                }
            case NOT_ZERO:
                switch (another) {
                    case BOTTOM:
                    case ZERO:
                        return BOTTOM;
                    case NOT_ZERO:
                    case MAYBE_ZERO:
                        return NOT_ZERO;
                }
            case MAYBE_ZERO:
                switch (another) {
                    case BOTTOM:
                    case ZERO:
                        return BOTTOM;
                    case NOT_ZERO:
                    case MAYBE_ZERO:
                        return MAYBE_ZERO;
                }
        }
        throw new IllegalStateException("Unexpected value: " + this);
    }

    /**
     * Returns the result of the multiplication between this ZeroAbstractValue and another.
     * @param another the other ZeroAbstractValue.
     * @return the result of the multiplication.
     */
    public ZeroAbstractValue multiplyBy(ZeroAbstractValue another) {
        // Implmentado en base a la tabla de la parte 1
        switch (this) {
            case BOTTOM:
                if (another == ZERO) {
                    return ZERO;
                }
                return BOTTOM;
            case ZERO:
                return ZERO;
            case NOT_ZERO:
                return another;
            case MAYBE_ZERO:
                if (another == NOT_ZERO) {
                    return MAYBE_ZERO;
                }
                return another;
        }
        throw new IllegalStateException("Unexpected value: " + this);
    }

    /**
     * Returns the result of the subtraction between this ZeroAbstractValue and another.
     * @param another the other ZeroAbstractValue.
     * @return the result of the subtraction.
     */
    public ZeroAbstractValue subtract(ZeroAbstractValue another) {
        // Implmentado en base a la tabla de la parte 1 (es igual a la suma)
        return this.add(another);
    }

    /**
     * Returns the result of the merge between this ZeroAbstractValue and another.
     * @param another the other ZeroAbstractValue.
     * @return the result of the merge.
     */
    public ZeroAbstractValue merge(ZeroAbstractValue another) {
        if (this == BOTTOM) {
            return another;
        }

        if (another == BOTTOM) {
            return this;
        }

        if (this == MAYBE_ZERO || another == MAYBE_ZERO) {
            return MAYBE_ZERO;
        }

        if (this == another) {
            return this;
        }

        return MAYBE_ZERO;
    }

}
