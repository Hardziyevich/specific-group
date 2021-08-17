package com.github.akarazhev.jacademy.jprog.basics;

public final class ArrayExample {

    public static void main(final String[] args) {
        // an array of ints
        final int[] myNumbers = {10, 15, 20, 25, 30};

        System.out.println(myNumbers[2]);

        // arrays have an instance variable that stores
        //  the length of the array:
        System.out.println(myNumbers.length);

        // Arrays can be of any type a variable can be:
        final String[] myStrings = {"Narnia", "Oz", "Neverland"};
        System.out.println("The Wizard of " + myStrings[1]);

        // arrays can be modified
        myStrings[2] = "Wonderland";
    }
}
