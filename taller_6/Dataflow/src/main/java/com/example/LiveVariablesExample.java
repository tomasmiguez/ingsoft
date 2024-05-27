package com.example;

public class LiveVariablesExample {
    LiveVariablesExample() {}

    int doSomething(int a, int b) {
        int c = a + b;
        int d = a - b;
        int r;
        if (a < b) {
            r = c;
        } else {
            r = d;
        }
        return r;
    }
}