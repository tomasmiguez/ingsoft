package inge2.dataflow.zeroanalysis;

import java.util.HashMap;
import java.util.Objects;
import java.util.Set;

/**
 * This class represents a mapping of ZeroAbstractValues (BOTTOM, NZ, Z or MZ) to variable names.
 */
public class ZeroAbstractSet {

    /**
     * This map contains the mapping of variable names to ZeroAbstractValues.
     */
    private final HashMap<String, ZeroAbstractValue> map;

    public ZeroAbstractSet() {
        this.map = new HashMap<>();
    }

    /**
     * This method checks if the given variable has a value in the set.
     * @param variable the variable name.
     * @return true if the variable has a value, false otherwise.
     */
    public Boolean hasValue(String variable) {
        return this.map.containsKey(variable);
    }

    /**
     * This method returns the value of the given variable.
     * @param variable the variable name.
     * @return the value of the variable.
     */
    public ZeroAbstractValue getValue(String variable) {
        return this.map.get(variable);
    }

    /**
     * This method sets the value of the given variable.
     * @param variable the variable name.
     * @param value the value of the variable.
     */
    public void setValue(String variable, ZeroAbstractValue value) {
        if (value != null) {
            this.map.put(variable, value);
        }
    }

    /**
     * This method returns the defined variables in this mapping.
     * @return the defined variables in this mapping.
     */
    public Set<String> getDefinedVariables() {
        return this.map.keySet();
    }

    /**
     * This method returns the union of this set with another set.
     * @param another the other set.
     * @return the union of this set with another set.
     */
    public ZeroAbstractSet union(ZeroAbstractSet another) {
        // TODO: IMPLEMENTAR
        throw new UnsupportedOperationException();
    }

    /**
     * Clears the set.
     */
    public void clear() {
        this.map.clear();
    }

    /**
     * Copies the values of another set into this set.
     * @param another the other set.
     */
    public void putAll(ZeroAbstractSet another) {
        this.map.putAll(another.map);
    }

    @Override
    public String toString() {
        return "ZeroAbstractSet{" + this.map + "}";
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof ZeroAbstractSet)) return false;
        ZeroAbstractSet that = (ZeroAbstractSet) o;
        return Objects.equals(this.map, that.map);
    }

    @Override
    public int hashCode() {
        return Objects.hash(this.map);
    }
}
