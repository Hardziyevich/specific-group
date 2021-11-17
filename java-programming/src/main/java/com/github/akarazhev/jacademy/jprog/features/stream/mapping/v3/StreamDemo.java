package com.github.akarazhev.jacademy.jprog.features.stream.mapping.v3;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Stream;

public class StreamDemo {

    public static void main(String[] args) {
        List<List<String>> list = new ArrayList<>();
        list.add(Arrays.asList("a", "b", "c"));
        list.add(Arrays.asList("d", "e", "f"));
        list.add(Arrays.asList("g", "h", "i"));
        list.add(Arrays.asList("j", "k", "l"));

        Stream<List<String>> stream1 = list.stream();
        // filter() method do not work on stream of collections
        Stream<List<String>> stream2 = stream1.filter(x -> "a".equals(x.toString()));
        //This will not print anything
        stream2.forEach(System.out::println);
    }
}
