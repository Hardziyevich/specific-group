package com.github.akarazhev.jacademy.jprog.features.lambdas.capturing.v2;

import java.util.function.UnaryOperator;

public class CapturingLambdaDemo {

    public static void main(String[] args) {
        int i = 5;
        i = 7; // Since we have changed the value of i, the below line will not compile.

//        UnaryOperator<Integer> operator = (input) -> input * i;

//        System.out.println(operator.apply(i));
    }
}

