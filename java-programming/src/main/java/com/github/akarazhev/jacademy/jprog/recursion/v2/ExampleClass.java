package com.github.akarazhev.jacademy.jprog.recursion.v2;

public class ExampleClass {

    private static void printNum(int n) {
        // Base case
        if (n == 0) {
            return;
        }
        // Recursive case
        printNum(n - 1);
        System.out.print(n + " ");
    }

    public static void main(String[] args) {
        // Recursive method called here
        printNum(6);
    }
}
