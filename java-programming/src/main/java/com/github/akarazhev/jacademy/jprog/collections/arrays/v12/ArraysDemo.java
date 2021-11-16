package com.github.akarazhev.jacademy.jprog.collections.arrays.v12;

import java.util.Arrays;

public class ArraysDemo {

    public static void main(String[] args) {
        Integer[] numbers = {1, 2, 3, 4, 5, 6, 7, 8, 9, 10};
        Arrays.fill(numbers, 20);

        for (int i : numbers) {
            System.out.print(i + " ");
        }
    }
}

