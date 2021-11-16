package com.github.akarazhev.jacademy.jprog.collections.arrays.v1;

import java.util.Arrays;

public class ArraysDemo {

    public static void main(String[] args) {
        int[] numbers = {1, 2, 3, 4, 5, 6, 7, 8, 9, 10};
        int index = Arrays.binarySearch(numbers, 4);
        System.out.println("The index of element 4 in the array is " + index);
    }
}
