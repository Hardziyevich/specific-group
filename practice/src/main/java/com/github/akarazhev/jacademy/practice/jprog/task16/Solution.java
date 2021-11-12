package com.github.akarazhev.jacademy.practice.jprog.task16;

import java.util.Arrays;

public class Solution {

    //Method is working and finding all permutations of a given array.
    public static void permutations(char[] array, int length) {
        // Write your code here
        //Base case
        if (length != 0) {
            for (int i = 0; i < array.length - 1; i++) {
                swap(array, i, i + 1);
                System.out.println(Arrays.toString(array));
            }
            //Recursion case
            permutations(array, length - 1);
        }
    }

    //swap two element in massive
    private static void swap(char[] array, int i, int j) {
        char temp = array[i];
        array[i] = array[j];
        array[j] = temp;
    }

    public static void main(final String[] args) {
        char[] input = {'a', 'b'};
        System.out.println("Permutations of a string: " + Arrays.toString(input));
        permutations(input, input.length);
        input = new char[]{'a', 'b', 'b', 'a'};
        System.out.println("Permutations of a string: " + Arrays.toString(input));
        permutations(input, input.length);
        input = new char[]{'b', 'b', 'a'};
        System.out.println("Permutations of a string: " + Arrays.toString(input));
        permutations(input, input.length);
    }
}
