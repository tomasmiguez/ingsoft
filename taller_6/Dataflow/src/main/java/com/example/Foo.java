package com.example;

public class Foo {
	public static void main(String[] args) {
		Foo f = new Foo();
		int rv = f.bar(0);
		System.out.println(rv);
	}

	public int bar(int x) {
		int c;
		if (x == 0) {
			c = x;
		} else {
			c = x + 1;
		}
		return c;
	}
}