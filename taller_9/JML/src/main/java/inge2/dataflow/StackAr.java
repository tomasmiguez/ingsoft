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

    //@ ensures elems.length == DEFAULT_CAPACITY;
    public StackAr() {
        this(DEFAULT_CAPACITY);
    }

    //@ requires capacity > 0;
    //@ ensures elems.length == capacity;
    public StackAr(int capacity) {
        this.elems = new int[capacity];
    }

    //@ requires -1 <= top < elems.length;
    //@ ensures \result <==> top + 1 == 0;
    public boolean isEmpty() {
        return size() == 0;
    }

    //@ requires -1 <= top < elems.length;
    //@ ensures \result <==> top + 1 == elems.length;
    public boolean isFull() {
        return size() == elems.length;
    }

    //@ requires -1 <= top < elems.length;
    //@ ensures \result == top + 1;
    public int size() {
        return top + 1;
    }

    //@ requires -1 <= top < elems.length - 1;
    //@ ensures \old(top) + 1 == top;
    //@ ensures elems[top] == o;
    public void push(int o) {
        this.top++;
        this.elems[top] = o;
    }

    //@ requires 0 <= top < elems.length;
    //@ ensures \old(top) - 1 == top;
    //@ ensures \result == elems[\old(top)];
    public int pop() {
        //@ assert 0 <= top < elems.length;
        int elem = this.peek();
        top--;
        //@ assert elem == elems[\old(top)];
        //@ assert \old(top) - 1 == top;
        return elem;
    }

    //@ requires 0 <= top < elems.length;
    //@ ensures \result == elems[top];
    public int peek() {
        return this.elems[top];
    }
}

