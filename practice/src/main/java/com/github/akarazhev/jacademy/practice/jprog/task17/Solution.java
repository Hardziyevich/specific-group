package com.github.akarazhev.jacademy.practice.jprog.task17;

public final class Solution {

    //Method is working and sorting input array using recursion.
    public static void sortArray(int[] array, int n) {
        // Write your code here
        //Base case
        if (n >= 0) {
            for (int i = n; i < array.length - 1; i++) {
                if (array[i] > array[i + 1])
                    swap(array, i, i + 1);
            }
            //Recursion case
            sortArray(array, n - 1);
        }
    }

    //swap two element in massive
    private static void swap(int[] array, int i, int j) {
        int temp = array[i];
        array[i] = array[j];
        array[j] = temp;
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