package com.github.akarazhev.jacademy.jprog.features.stream.collectors.v14;

import java.util.stream.Collectors;
import java.util.stream.Stream;

public class CollectorsDemo {

    public static void main(String[] args) {
        // Joining all the strings.
        String joinedString = Stream.of("hello", "how", "are", "you")
                .collect(Collectors.joining());
        System.out.println(joinedString);

        // Joining all the strings with space in between.
        joinedString = Stream.of("hello", "how", "are", "you")
                .collect(Collectors.joining(" "));
        System.out.println(joinedString);

        // Joining all the strings with space in between and a prefix and suffix.
        joinedString = Stream.of("hello", "how", "are", "you")
                .collect(Collectors.joining(" ", "prefix", "suffix"));
        System.out.println(joinedString);
    }
}

