package com.example;

public class ReachingDefinitionsExample {
    ReachingDefinitionsExample() {}

    int doSomething(String[] args) {
        int a = 8; int c = 3;
        int len=args.length;
        if(len > 2) {
            a = 5;
        }
        c = 1;
        while (!(c > a)) {
            c = c + 2;
        }
        a = c - a;
        return a;
    }
}
