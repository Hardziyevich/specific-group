package com.github.akarazhev.jacademy.practice.jprog.task21;

import java.util.*;

public final class TreeSetExercise1 {

    public static void main(final String[] args) {
        int[] numbers = {1, 4, 5, 2, 34, 66, 5, 4, 33, 45, 6, 8, 56, 76, 78, 98, 34, 37, 12, 12, 23, 43, 54, 56};
        // Your code goes here
        Arrays.stream(findAllDigitGreaterThan(numbers, 50)).forEach(System.out::println);
    }

    //Method is working and finding digits in array which greater than input digit
    private static int[] findAllDigitGreaterThan(int[] number, int digit){
        return Arrays.stream(number).filter(x -> x > digit).toArray();
    }
}
