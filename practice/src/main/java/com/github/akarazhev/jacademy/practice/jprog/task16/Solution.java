package com.github.akarazhev.jacademy.practice.jprog.task16;

import java.util.Arrays;

public class Solution {

    public static void permutations(char[] array, int length) {
        // Write your code here
        return;
    }

    public static void main(final String[] args) {
        char[] input = {'a', 'b'};
        System.out.println("Permutations of a string: " + Arrays.toString(input));
        permutations(input, input.length);
        input = new char[]{'a', 'b', 'b', 'a'};
        System.out.println("Permutations of a string: " + Arrays.toString(input));
        permutations(input, input.length);
    }
}
