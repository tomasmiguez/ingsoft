package inge2.dataflow;

public class StackAr {

    /**
     * Capacidad por defecto de la pila.
     */
    //@ spec_public
    private final static int DEFAULT_CAPACITY = 10;

    /**
     * Arreglo que contiene los elementos de la pila.
     */
    //@ spec_public
    private final int[] elems;

    /**
     * Indice del tope de la pila.
     */
    //@ spec_public
    private int top = -1;

    //@ public invariant top < elems.length;
    //@ public invariant top >= -1;

    //@ ensures elems.length == DEFAULT_CAPACITY;
    public StackAr() {
        this(DEFAULT_CAPACITY);
    }

    //@ requires capacity > 0;
    //@ requires capacity < Integer.MAX_VALUE;
    //@ ensures elems.length == capacity;
    public StackAr(int capacity) {
        this.elems = new int[capacity];
    }

    //@ ensures \result <==> (size() == 0);
    //@ pure
    public boolean isEmpty() {
        return size() == 0;
    }

    //@ ensures \result <==> (size() == elems.length);
    //@ pure
    public boolean isFull() {
        return size() == elems.length;
    }

    //@ ensures \result == (top + 1);
    //@ pure
    public int size() {
        return top + 1;
    }

    //@ requires top < elems.length - 1;
    //@ ensures top == \old(top) + 1;
    //@ ensures peek() == o;
    public void push(int o) {
        this.top++;
        this.elems[top] = o;
    }

    //@ requires top >= 0;
    //@ ensures top == \old(top) - 1;
    //@ ensures \result == \old(peek());
    public int pop() {
        int topValue = this.peek();
        top--;
        return topValue;
    }

    //@ requires top >= 0;
    //@ ensures \result == elems[top];
    //@ pure
    public int peek() {
        return this.elems[top];
    }
}

