package com.github.akarazhev.jacademy.jprog.features.lambdas.func.v4;

import java.util.function.BiFunction;

public class BiFunctionInterfaceDemo {

    public static void main(String[] args) {
        BiFunction<Integer, Integer, Integer> add = (a, b) -> a + b;

        System.out.println("Sum = " + add.apply(2, 3));
    }
}
