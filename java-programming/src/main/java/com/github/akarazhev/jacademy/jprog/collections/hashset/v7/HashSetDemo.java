package com.github.akarazhev.jacademy.jprog.collections.hashset.v7;

import java.util.HashSet;
import java.util.Set;

public class HashSetDemo {

    public static void main(String[] args) {
        Set<Integer> set = new HashSet<>();

        set.add(23);
        set.add(34);
        set.add(56);

        set.forEach(System.out::println);
    }
}

