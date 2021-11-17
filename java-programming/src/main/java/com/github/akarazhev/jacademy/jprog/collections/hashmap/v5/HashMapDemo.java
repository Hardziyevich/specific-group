package com.github.akarazhev.jacademy.jprog.collections.hashmap.v5;

import java.util.Collection;
import java.util.HashMap;
import java.util.Map;
import java.util.Set;

public class HashMapDemo {

    public static void main(String[] args) {
        Map<String, Integer> stockPrice = new HashMap<>();
        stockPrice.put("Oracle", 56);
        stockPrice.put("Fiserv", 117);
        stockPrice.put("BMW", 73);
        stockPrice.put("Microsoft", 213);

        System.out.println("HashMap Keys");
        Set<String> keys = stockPrice.keySet();
        for (String key : keys) {
            System.out.println(key);
        }

        System.out.println("HashMap Values");
        Collection<Integer> values = stockPrice.values();
        for (Integer value : values) {
            System.out.println(value);
        }
    }
}

