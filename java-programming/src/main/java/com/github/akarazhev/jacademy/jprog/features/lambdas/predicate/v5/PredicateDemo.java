package com.github.akarazhev.jacademy.jprog.features.lambdas.predicate.v5;

import java.util.function.Predicate;

public class PredicateDemo {

    public static void main(String[] args) {
        Predicate<String> predicate = Predicate.isEqual("Hello");

        // The same thing can be achieved by below lambda.
        // Predicate<String> predicate  = p -> p.equals("Hello");

        System.out.println(predicate.test("Welcome"));
    }
}
