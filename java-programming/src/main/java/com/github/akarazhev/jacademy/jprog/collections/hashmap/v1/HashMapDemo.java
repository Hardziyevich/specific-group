package com.github.akarazhev.jacademy.jprog.collections.hashmap.v1;

import java.util.HashMap;
import java.util.Map;

public class HashMapDemo {

    public static void main(String[] args) {
        Map<String, Integer> stockPrice = new HashMap<>();

        stockPrice.put("Oracle", 56);
        stockPrice.put("Fiserv", 117);
        stockPrice.put("BMW", 73);
        stockPrice.put("Microsoft", 213);

        System.out.println(stockPrice.get("Oracle"));
        System.out.println(stockPrice.get("Google")); //This will return null.

        //Since Google is not present in our Map, this will insert it with default value of 100.
        System.out.println(stockPrice.getOrDefault("Google", 100));
    }
}

