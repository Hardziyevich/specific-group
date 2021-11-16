package com.github.akarazhev.jacademy.jprog.features.lambdas.v3;

public class WellWisher {

    public static void wish(Greeting greeting) {
        greeting.greet();
    }

    // Passing a lambda expression to wish method.
    public static void main(String[] args) {
        wish(() -> System.out.println("Namaste"));
    }
}

