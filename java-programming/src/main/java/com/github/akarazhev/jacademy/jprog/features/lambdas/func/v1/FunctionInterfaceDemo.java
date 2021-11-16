package com.github.akarazhev.jacademy.jprog.features.lambdas.func.v1;

import java.util.function.Function;

public class FunctionInterfaceDemo {

    public static void main(String[] args) {
        // Created a function which returns the length of string.
        Function<String, Integer> lengthFunction = str -> str.length();

        System.out.println("String length: " + lengthFunction.apply("This is awesome!!"));
    }
}
