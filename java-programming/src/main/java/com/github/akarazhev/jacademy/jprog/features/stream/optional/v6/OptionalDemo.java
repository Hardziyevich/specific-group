package com.github.akarazhev.jacademy.jprog.features.stream.optional.v6;

import java.util.Optional;

public class OptionalDemo {

    public static String getDefaultValue() {
        return "default";
    }

    public static void main(String[] args) {
        Optional<String> optional = Optional.ofNullable(null);
        // This will return the default value.
        System.out.println(optional.orElseGet(OptionalDemo::getDefaultValue));
    }
}
