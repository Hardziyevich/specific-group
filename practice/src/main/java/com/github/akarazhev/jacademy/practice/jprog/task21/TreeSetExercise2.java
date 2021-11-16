package com.github.akarazhev.jacademy.practice.jprog.task21;

import java.util.Arrays;

public final class TreeSetExercise2 {

    public static void main(final String[] args) {
        int[] numbers = {1, 4, 5, 2, 34, 66, 5, 4, 33, 45, 6, 8, 56, 76, 78, 98, 34, 37, 12, 12, 23, 43, 54, 56};
        // Your code goes here
        //finding min and max
        int min = Arrays.stream(numbers).min().getAsInt();
        int max = Arrays.stream(numbers).max().getAsInt();
        System.out.printf("Min:%d\nMax:%d%n",min,max);
    }
}
