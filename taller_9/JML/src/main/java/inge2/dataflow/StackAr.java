package inge2.dataflow;

public class StackAr {

    /**
     * Capacidad por defecto de la pila.
     */
    private final static int DEFAULT_CAPACITY = 10;

    /**
     * Arreglo que contiene los elementos de la pila.
     */
    private final int[] elems;

    /**
     * Indice del tope de la pila.
     */
    private int top = -1;

    //@ TODO: ESPECIFICAR
    public StackAr() {
        this(DEFAULT_CAPACITY);
    }

    //@ TODO: ESPECIFICAR
    public StackAr(int capacity) {
        if (capacity < 0) {
            throw new IllegalArgumentException();
        }
        this.elems = new int[capacity];
    }

    //@ TODO: ESPECIFICAR
    public boolean isEmpty() {
        return size() == 0;
    }

    //@ TODO: ESPECIFICAR
    public boolean isFull() {
        return size() == elems.length;
    }

    //@ TODO: ESPECIFICAR
    public int size() {
        return top + 1;
    }

    //@ TODO: ESPECIFICAR
    public void push(int o) {
        if (isFull()) {
            throw new IllegalStateException();
        }
        this.top++;
        this.elems[top] = o;
    }

    //@ TODO: ESPECIFICAR
    public int pop() {
        if (isEmpty()) {
            throw new IllegalStateException();
        }
        top--;
        return this.peek();
    }

    //@ TODO: ESPECIFICAR
    public int peek() {
        if (isEmpty()) {
            throw new IllegalStateException();
        }
        return this.elems[top];
    }
}

