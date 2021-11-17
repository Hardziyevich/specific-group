package com.github.akarazhev.jacademy.jprog.features.lambdas.capturing.v4;

import java.util.function.Function;

public class CapturingLambdaDemo {

    /*public static void main(String[] args) {
        Function<Integer, Integer> multiplier = getMultiplier();

        System.out.println(multiplier.apply(10));
    }

    public static Function<Integer, Integer> getMultiplier() {
        int i = 5;
        // The below lambda has copied the value of i.
        Function<Integer, Integer> multiplier = t -> t * i;
        // If you change the value of i here, then the lambda will have old value.
        // So this is not allowed and code will not compile.
        i = 7;
        return multiplier;
    }*/
}

