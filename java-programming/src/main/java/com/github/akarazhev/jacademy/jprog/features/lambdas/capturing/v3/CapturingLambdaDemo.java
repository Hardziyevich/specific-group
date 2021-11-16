package com.github.akarazhev.jacademy.jprog.features.lambdas.capturing.v3;

import java.util.function.UnaryOperator;

public class CapturingLambdaDemo {

    static int i = 0;

    public static void main(String[] args) {
        i = 7;
        UnaryOperator<Integer> operator = (input) -> input * i;

        System.out.println(operator.apply(i));
    }
}

