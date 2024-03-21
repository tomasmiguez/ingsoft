package org.autotest;

/**
 * Clase abstracta que representa una pila.
 */
public abstract class Stack {
    /**
     * Devuelve la cantidad de elementos en la pila.
     */
    public abstract int size();

    /**
     * Devuelve true si la pila está vacía, false en caso contrario.
     */
    public abstract boolean isEmpty();

    /**
     * Devuelve true si la pila está llena, false en caso contrario.
     */
    public abstract boolean isFull();

    /**
     * Agrega un elemento a la pila.
     */
    public abstract void push(Object o);

    /**
     * Elimina y devuelve el elemento en el tope de la pila.
     */
    public abstract Object pop() throws IllegalStateException;

    /**
     * Devuelve el elemento en el tope de la pila.
     */
    public abstract Object top() throws IllegalStateException;

    /**
     * Devuelve un entero que representa el hash code de la pila.
     */
    public abstract int hashCode();

    /**
     * Devuelve true si la pila es igual a otro objeto, false en caso contrario.
     */
    public abstract boolean equals(Object obj);

    /**
     * Devuelve una representación en String de la pila.
     */
    public abstract String toString();
}
