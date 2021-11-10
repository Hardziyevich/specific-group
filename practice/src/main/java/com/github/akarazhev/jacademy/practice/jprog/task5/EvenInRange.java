package com.github.akarazhev.jacademy.practice.jprog.task5;

public final class EvenInRange {

    public static boolean evenInRange(final int x) {
        // you write this part (a one-line return statement)
        return x >= 24 && x <= 32;
    }

    public static void main(final String[] args) {
        System.out.println(evenInRange(0));
        System.out.println(evenInRange(24));
        System.out.println(evenInRange(25));
        System.out.println(evenInRange(34));
    }
}
