package com.github.akarazhev.jacademy.jprog.basics;

public final class MethodParameters {

    public static void printMyNumber(final int x) {
        System.out.println("My favorite number is " + x + ".");
    }

    public static void main(final String[] args) {
        printMyNumber(42);
    }
}
