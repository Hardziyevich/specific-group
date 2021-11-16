package com.github.akarazhev.jacademy.jprog.features.stream.optional.v8;

import java.util.Optional;

public class OptionalDemo {

    public static void main(String[] args) {
        Optional<String> optional = Optional.ofNullable("orange");
        // Since the filter condition is matched, this will return the optional.
        System.out.println(optional.filter(str -> str.equals("orange")));

        // Since the filter condition is not matched, this will return empty optional.
        System.out.println(optional.filter(str -> str.equals("apple")));
    }
}
