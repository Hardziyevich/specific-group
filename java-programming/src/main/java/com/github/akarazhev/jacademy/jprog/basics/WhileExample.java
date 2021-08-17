package com.github.akarazhev.jacademy.jprog.basics;

public final class WhileExample {

    public static void main(final String[] args) {
        int number = 0;
        while (number < 100) {
            System.out.println(number);
            number += 2;
        }
    }
}
