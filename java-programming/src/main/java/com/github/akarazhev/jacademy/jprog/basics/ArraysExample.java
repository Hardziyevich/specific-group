package com.github.akarazhev.jacademy.jprog.basics;

import java.util.Arrays;

public final class ArraysExample {

    public static void main(final String[] args) {
        final int[] myNumbers = {42, 1, 17, 27, 16};
        Arrays.sort(myNumbers);
        System.out.println(Arrays.toString(myNumbers));
    }
}
