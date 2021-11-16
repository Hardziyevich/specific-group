package com.github.akarazhev.jacademy.jprog.recursion.iterative;

public class MainClass {

    private static int factorialRecursive(int n) {
        if (n == 1) {
            return 1;
        } else {
            return (n * factorialRecursive(n - 1));
        }
    }

    public static void main(String[] args) {
        int result = factorialRecursive(5);
        System.out.println("The factorial is: " + result);
    }
}
