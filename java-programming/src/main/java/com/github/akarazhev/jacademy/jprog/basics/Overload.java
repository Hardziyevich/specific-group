package com.github.akarazhev.jacademy.jprog.basics;

public final class Overload {

    public static void printMyFavoriteNumber(final int x) {
        System.out.println("My favorite number is the integer " + x);
    }

    public static void printMyFavoriteNumber(final double x) {
        System.out.println("My favorite number is the double " + x);
    }

    public static void main(final String[] args) {
        printMyFavoriteNumber(42);
        printMyFavoriteNumber(3.1415);
    }
}
