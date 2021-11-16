package com.github.akarazhev.jacademy.jprog.collections.linkedhashmap.v1;

import java.util.LinkedHashMap;
import java.util.Map;

public class LinkedHashMapDemo {

    public static void main(String[] args) {
        Map<String, Integer> stocks = new LinkedHashMap<>();
        stocks.put("Apple", 123);
        stocks.put("BMW", 54);
        stocks.put("Google", 87);
        stocks.put("Microsoft", 232);
        stocks.put("Oracle", 76);

        System.out.println(stocks);
    }
}
