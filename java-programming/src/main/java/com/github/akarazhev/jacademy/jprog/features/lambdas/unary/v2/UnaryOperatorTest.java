package com.github.akarazhev.jacademy.jprog.features.lambdas.unary.v2;

import java.util.function.IntUnaryOperator;

public class UnaryOperatorTest {

    public static void main(String[] args) {
        IntUnaryOperator operator = num -> num * num;

        System.out.println(operator.applyAsInt(25));
    }
}

