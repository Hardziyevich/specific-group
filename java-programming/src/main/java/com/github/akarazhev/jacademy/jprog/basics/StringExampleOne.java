package com.github.akarazhev.jacademy.jprog.basics;

public final class StringExampleOne {

    public static void main(final String[] args) {
        String myFavoriteNumber;
        final int x = 42;

        myFavoriteNumber = String.valueOf(x);
        System.out.println("My favorite number is " + myFavoriteNumber + ".");
    }
}
