package com.github.akarazhev.jacademy.practice.jprog.task7;

import java.util.Arrays;
import java.util.LinkedList;
import java.util.List;

public final class PrintFactors {

    public static void main(String[] args) {
        printFactors(12);
    }

    public static void printFactors(int number) {
        int possibleFactor = 1;
        List<Integer> factors = new LinkedList<>();
        while (possibleFactor <= number) {
            if (number % possibleFactor == 0) {
                System.out.println(possibleFactor + " is a factor of " + number + ".");
                factors.add(possibleFactor);
            }
            possibleFactor++;
        }
        //I didn`t understand how should be showing output expression, although I wrote two types.
        System.out.println("And that's all the factors of " + Arrays.toString(factors.toArray()) + ".");
        System.out.print("And that's all the factors of ");
        factors.forEach(x -> System.out.print(x + ", "));
        System.out.println("\b\b.");
    }
}
