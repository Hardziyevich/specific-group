package com.github.akarazhev.jacademy.jprog.basics;

public final class CharExample {

    public static void main(final String[] args) {
        final char character = 'Z';
        final String magicWord = "XYZZY";

        final char anotherChar = magicWord.charAt(0);
        System.out.println(character + anotherChar);
    }
}
