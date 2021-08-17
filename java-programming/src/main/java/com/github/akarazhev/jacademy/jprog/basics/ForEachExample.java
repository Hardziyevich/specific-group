package com.github.akarazhev.jacademy.jprog.basics;

public final class ForEachExample {

    public static void main(final String[] args) {
        final int[] primes = {2, 3, 5, 7, 11, 13};
        for (final int p : primes) {
            System.out.println(p);
        }
    }
}
