package com.github.akarazhev.jacademy.jprog.features.stream.optional.v4;

import java.util.Optional;

public class OptionalDemo {

    public static void main(String[] args) {
        Optional<String> optional = Optional.ofNullable(null);
        // This will throw exception because optional contains a null value.
        System.out.println(optional.get());
    }
}
