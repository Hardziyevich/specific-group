package com.github.akarazhev.jacademy.jprog.collections.arrays.v5;

import java.util.Arrays;

public class ArraysDemo {

    public static void main(String[] args) {
        Integer[] numbers = {10, 2, 32, 12, 15, 76, 17, 48, 79, 9};
        Arrays.sort(numbers);

        for (int i : numbers) {
            System.out.print(i + " ");
        }
    }
}

