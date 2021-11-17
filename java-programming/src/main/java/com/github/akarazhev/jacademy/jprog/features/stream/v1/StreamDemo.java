package com.github.akarazhev.jacademy.jprog.features.stream.v1;

import java.util.stream.Stream;

public class StreamDemo {

    public static void main(String[] args) {
        Stream<Integer> stream = Stream.of(1, 2, 3, 4, 5, 6, 7, 8, 9);
        stream.forEach(p -> System.out.println(p));
    }
}

