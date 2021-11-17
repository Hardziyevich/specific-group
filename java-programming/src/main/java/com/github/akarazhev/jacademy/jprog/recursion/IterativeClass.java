package com.github.akarazhev.jacademy.jprog.recursion;

public class IterativeClass {
    public static int countDigits(int num) {
        int count = 0;
        while (num > 0) {
            num = num / 10;
            count++;
        }
        return count;
    }

    public static void main(String[] args) {
        int input = 1435043;
        int numDigits = countDigits(input);
        System.out.println("Number of digits in " + input + " = " + numDigits);
    }
}
