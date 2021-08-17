package com.github.akarazhev.jacademy.jprog.basics;

public final class ReturnExample {

    public static double square(final double x) {
        return x * x;
    }

    public static boolean isEven(final int x) {
        return x % 2 == 0;
    }

    public static void main(final String[] args) {
        System.out.println(isEven(6));
        System.out.println(square(6));
    }
}
