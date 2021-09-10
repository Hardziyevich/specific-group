package com.github.akarazhev.jacademy.jprog.basics;

public final class Temperature {

    public static void main(final String[] args) {
        int temperature = -5;
        if (temperature < 0) {
            System.out.println("It's very, very cold!");
        }

        temperature = 10;
        if (temperature >= 0) {
            System.out.println("It's not so cold!");
        }
    }
}