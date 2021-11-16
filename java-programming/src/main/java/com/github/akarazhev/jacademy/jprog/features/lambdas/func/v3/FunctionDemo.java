package com.github.akarazhev.jacademy.jprog.features.lambdas.func.v3;

import java.util.function.Function;

public class FunctionDemo {

    public static void main(String[] args) {
        Function<Integer,Integer> increment = x -> x + 10;
        Function<Integer,Integer> multiply = y -> y * 2;
        // Since we are using andThen(), increment will be done first and then multiplication will be done.
        System.out.println("andThen result: " + increment.andThen(multiply).apply(3));
    }
}

