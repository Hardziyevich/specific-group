package com.github.akarazhev.jacademy.jprog.features.lambdas.capturing.v1;

import java.util.function.UnaryOperator;

public class CapturingLambdaDemo {

    public static void main(String[] args) {
        int i = 5;
        UnaryOperator<Integer> operator = (input) -> input * i;

        System.out.println(operator.apply(i));
    }
}

