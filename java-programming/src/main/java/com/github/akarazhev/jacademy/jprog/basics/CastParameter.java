package com.github.akarazhev.jacademy.jprog.basics;

public final class CastParameter {

    public static void main(final String[] args) {
        // This works, since the int 42 can be cast
        //  implicitly into a double:
        final double x = Math.sqrt(42);

        System.out.println(x);
    }
}
