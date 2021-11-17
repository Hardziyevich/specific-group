package com.github.akarazhev.jacademy.practice.jprog.task22;

import java.util.Collection;
import java.util.HashMap;
import java.util.Map;

public final class HashMapDemo1 {

    public static void main(final String[] args) {
        Map<String, Integer> stockPrice = new HashMap<>();
        stockPrice.put("Oracle", 56);
        stockPrice.put("Fiserv", 117);
        stockPrice.put("BMW", 73);
        stockPrice.put("Microsoft", 213);
        stockPrice.put("Google", 421);
        stockPrice.put("Ford", 456);
        stockPrice.put("Novartis", 43);
        stockPrice.put("TCS", 23);

        System.out.printf("Max price:%d", findMaxPrice(stockPrice));

    }

    //Method is working and finding max value in Map
    public static Integer findMaxPrice(Map<String, Integer> stock) {
        return stock.values().stream().max(Integer::compareTo).orElse(0);
    }
}
