package com.github.akarazhev.jacademy.jprog.collections.arrays.v8;

import java.util.Arrays;

public class ArraysDemo {

    public static void main(String[] args) {
        int[] numbers = {1, 2, 3, 4, 5, 6, 7, 8, 9, 10};
        int[] newArray = Arrays.copyOfRange(numbers, 0, 5);

        System.out.println("The copied array is: ");

        for (int i : newArray) {
            System.out.println(i);
        }
    }
}

