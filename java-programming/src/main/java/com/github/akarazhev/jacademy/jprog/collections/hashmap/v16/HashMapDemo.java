package com.github.akarazhev.jacademy.jprog.collections.hashmap.v16;

import java.util.HashMap;
import java.util.Map;

public class HashMapDemo {

    public static void main(String[] args) {
        Map<String, Integer> stockPrice = new HashMap<>();
        stockPrice.put("Oracle", 56);
        stockPrice.put("Fiserv", 117);
        stockPrice.put("BMW", 73);
        stockPrice.put("Microsoft", 213);

        stockPrice.forEach((key, value) -> System.out
                .println("Company Name: " + key + " Stock Price: " + value));
    }
}
