package com.github.akarazhev.jacademy.jprog.features.stream.v2;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Stream;

public class StreamDemo {

    public static void main(String[] args) {
        List<String> list = new ArrayList<>();
        list.add("a");
        list.add("b");
        list.add("c");
        list.add("d");

        Stream<String> stream = list.stream();
        stream.forEach(p -> System.out.println(p));
    }
}

