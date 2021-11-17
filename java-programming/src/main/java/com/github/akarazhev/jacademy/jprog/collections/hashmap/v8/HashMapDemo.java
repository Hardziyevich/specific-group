package com.github.akarazhev.jacademy.jprog.collections.hashmap.v8;

import java.util.HashMap;
import java.util.Map;

public class HashMapDemo {

    public static void main(String[] args) {
        Map<String, Integer> map = new HashMap<>();
        map.put("India", 5);
        map.put("USA", 3);
        map.put("China", 5);
        map.put("Russia", 6);

        map.computeIfAbsent("Vietnam", k -> k.length());

        System.out.println(map);
    }
}

