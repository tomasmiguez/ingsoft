package org.autotest;

import java.util.Arrays;
import randoop.CheckRep;

public class StackAr {

	private final static int DEFAULT_CAPACITY = 10;

	private final Object[] elems;

	private int readIndex = -1;

	public StackAr() {
		this(DEFAULT_CAPACITY);
	}

	public StackAr(int capacity) throws IllegalArgumentException {
		if (capacity < 0) {
			throw new IllegalArgumentException();
		}
		this.elems = new Object[capacity];
	}

	/**
	 * El "invariante de representación" de una clase es una propiedad que deben cumplir todas las instancias de la clase.
	 * Al utilizar la anotación @CheckRep, podemos indicarle a Randoop qué métodos en las clases bajo test son métodos de
	 * invariante de representación. Randoop llamará a estos métodos; si el método falla en algún momento, Randoop generará
	 * el test como un test fallido.
	 *
	 * A continuación, utilizamos la anotación @CheckRep sobre un método de instancia público sin argumentos y con tipo de
	 * retorno booleano. En este caso, Randoop interpretará un valor de retorno verdadero como la satisfacción del
	 * invariante de representación, y un valor de retorno falso como la violación del invariante de representación.
	 */
	@CheckRep
	public boolean repOK() {
		try {
			// COMPLETAR

			return true;
		} catch (Exception | Error e) {
			System.err.println("ERROR en el método repOK.");
			e.printStackTrace();
			return false;
		}
	}

	public int size() {
		return readIndex+1;
	}

	public boolean isEmpty() {
		return size() == 0;
	}

	public boolean isFull() {
		return size() == elems.length;
	}

	public void push(Object o) throws IllegalStateException {
		if (isFull()) {
			throw new IllegalStateException();
		}
		this.readIndex++;
		this.elems[readIndex] = o;
	}

	public Object pop() throws IllegalStateException {
		if (isEmpty()) {
			throw new IllegalStateException();
		}
		Object rv = this.top();
		readIndex--;
		return rv;
	}

	public Object top() throws IllegalStateException {
		if (isEmpty()) {
			throw new IllegalStateException();
		}
		Object rv = this.elems[readIndex];
		return rv;
	}

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + Arrays.hashCode(elems);
		result = prime * result + readIndex;
		return result;
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		StackAr other = (StackAr) obj;
		if (!Arrays.equals(elems, other.elems))
			return false;
		if (readIndex != other.readIndex)
			return false;
		return true;
	}

	@Override
	public String toString() {
		StringBuffer b = new StringBuffer();
		b.append("[");
		for (int i = 0; i <= readIndex; i++) {
			if (i > 0) {
				b.append(",");
			}
			Object o = elems[i];
			String s = String.valueOf(o);
			b.append(s);
		}
		b.append("]");
		return b.toString();
	}
}
