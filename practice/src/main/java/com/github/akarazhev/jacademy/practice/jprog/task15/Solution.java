package com.github.akarazhev.jacademy.practice.jprog.task15;

public final class Solution {

    //Method is working and finding the Greatest Common Divisor.
    public static int gcd(int num1, int num2) {
        // Write your code here
        //Base case
        if (num1 == num2) {
            return num1;
        } else if (num1 > num2) {
            //Recursive case
            return gcd(num1 - num2, num2);
        } else {
            //Recursive case
            return gcd(num2 - num1, num1);
        }
    }

    public static void main(final String[] args) {
        int x = 56;
        int y = 42;
        int result = gcd(x, y);
        System.out.println("The GCD of " + x + " and " + y + " is:");
        System.out.println(result);
    }
}
