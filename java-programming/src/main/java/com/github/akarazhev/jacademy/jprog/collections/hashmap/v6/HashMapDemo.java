package com.github.akarazhev.jacademy.jprog.collections.hashmap.v6;

import java.util.Map;
import java.util.HashMap;

public class HashMapDemo {
    public static void main(String[] args) {
        Map<String, Integer> map = new HashMap<>();
        map.put("abc", 23);
        map.put("def", 34);
        map.put("ghi", 56);

        System.out.println(map.isEmpty());
    }
}

