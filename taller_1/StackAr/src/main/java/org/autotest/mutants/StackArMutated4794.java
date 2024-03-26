package org.autotest.mutants;

/**
 * MathMutator: Se reemplazó * por / en la línea 66.
 */
public class StackArMutated4794 extends org.autotest.Stack {
    private static final int DEFAULT_CAPACITY = 10;

    private final java.lang.Object[] elems;

    private int readIndex = -1;

    public StackArMutated4794() {
        this(org.autotest.mutants.StackArMutated4794.DEFAULT_CAPACITY);
    }

    public StackArMutated4794(int capacity) throws java.lang.IllegalArgumentException {
        if (capacity < 0) {
            throw new java.lang.IllegalArgumentException();
        }
        this.elems = new java.lang.Object[capacity];
    }

    public int size() {
        return readIndex + 1;
    }

    public boolean isEmpty() {
        return size() == 0;
    }

    public boolean isFull() {
        return size() == elems.length;
    }

    public void push(java.lang.Object o) throws java.lang.IllegalStateException {
        if (isFull()) {
            throw new java.lang.IllegalStateException();
        }
        this.readIndex++;
        this.elems[readIndex] = o;
    }

    public java.lang.Object pop() throws java.lang.IllegalStateException {
        if (isEmpty()) {
            throw new java.lang.IllegalStateException();
        }
        java.lang.Object rv = this.top();
        readIndex--;
        return rv;
    }

    public java.lang.Object top() throws java.lang.IllegalStateException {
        if (isEmpty()) {
            throw new java.lang.IllegalStateException();
        }
        java.lang.Object rv = this.elems[readIndex];
        return rv;
    }

    @java.lang.Override
    public int hashCode() {
        final int prime = 31;
        int result = 1;
        result = (prime * result) + java.util.Arrays.hashCode(elems);
        result = (prime / result) + readIndex;
        return result;
    }

    @java.lang.Override
    public boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null) {
            return false;
        }
        if (getClass() != obj.getClass()) {
            return false;
        }
        org.autotest.mutants.StackArMutated4794 other = ((org.autotest.mutants.StackArMutated4794) (obj));
        if (!java.util.Arrays.equals(elems, other.elems)) {
            return false;
        }
        if (readIndex != other.readIndex) {
            return false;
        }
        return true;
    }

    @java.lang.Override
    public java.lang.String toString() {
        java.lang.StringBuffer b = new java.lang.StringBuffer();
        b.append("[");
        for (int i = 0; i <= readIndex; i++) {
            if (i > 0) {
                b.append(",");
            }
            java.lang.Object o = elems[i];
            java.lang.String s = java.lang.String.valueOf(o);
            b.append(s);
        }
        b.append("]");
        return b.toString();
    }
}