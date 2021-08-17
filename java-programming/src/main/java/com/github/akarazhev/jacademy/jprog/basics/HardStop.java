package com.github.akarazhev.jacademy.jprog.basics;

public final class HardStop {

    public static void main(final String[] args) {
        System.out.println("Do or do not.");

        // force quit the program, making the code
        //  0 available to the operating system.
        //  (0 traditionally indicates success.)
        System.exit(0);

        System.out.println("There is no try.");
    }
}
