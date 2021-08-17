package com.github.akarazhev.jacademy.jprog.basics;

public final class IfExamples {

    public static void main(final String[] args) {
        if(true) {
            System.out.println("This code gets executed.");
        }

        if(false) {
            System.out.println("This code does not.");
        }

        if(5 > 3) {
            System.out.println("This code gets executed, too.");
        }

        if(3 > 5) {
            System.out.println("This code does not.");
        }
    }
}
