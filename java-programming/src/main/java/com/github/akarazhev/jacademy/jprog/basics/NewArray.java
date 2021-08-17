package com.github.akarazhev.jacademy.jprog.basics;

public final class NewArray {

    public static void main(final String[] args) {
        final int[] myNumbers = new int[5];

        myNumbers[0] = 10;
        myNumbers[1] = 10;
        myNumbers[2] = 10;
        myNumbers[3] = 10;
        myNumbers[4] = 10;

        System.out.println("The array myNumbers has length " + myNumbers.length);
    }
}
