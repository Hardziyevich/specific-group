package com.github.akarazhev.jacademy.jprog.collections.hashmap.v10;

import java.util.HashMap;
import java.util.Map;

public class HashMapDemo {

    public static void main(String[] args) {
        Map<String, Integer> map1 = new HashMap<>();
        map1.put("Jay", 5000);
        map1.put("Rahul", 3000);
        map1.put("Nidhi", 4500);
        map1.put("Amol", 60000);

        Map<String, Integer> map2 = new HashMap<>();
        map2.put("Jay", 7000);
        map2.put("Rahul", 4500);
        map2.put("Nidhi", 1200);
        map2.put("Saurav", 25000);

        map1.forEach((key, value) -> map2.merge(key, value, (v1, v2) -> v1 + v2));

        System.out.println(map2);
    }
}

