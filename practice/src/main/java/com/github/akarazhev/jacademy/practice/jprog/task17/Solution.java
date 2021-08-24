package com.github.akarazhev.jacademy.practice.jprog.task17;

public final class Solution {

    public static void sortArray(int[] array, int n) {
        // Write your code here
    }

    public static void main(final String[] args) {
        System.out.println("Unsorted Array: ");
        int[] array = {40, 24, 60, 15, 10, 45, 93};
        System.out.print("{ ");
        for (int j : array) {
            System.out.print(j + " ");
        }
        System.out.println("} ");

        System.out.println("Sorted Array: ");
        sortArray(array, array.length);
        System.out.print("{ ");
        for (int j : array) {
            System.out.print(j + " ");
        }

        System.out.println("} ");
    }
}