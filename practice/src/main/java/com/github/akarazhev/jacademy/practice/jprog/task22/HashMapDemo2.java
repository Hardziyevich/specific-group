package com.github.akarazhev.jacademy.practice.jprog.task22;

import java.util.Collection;
import java.util.HashMap;
import java.util.Map;

public final class HashMapDemo2 {

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

        System.out.println("Average price:"+ averagePrice(stockPrice));
    }
    //Method is working and calculate average price value in Map
    public static Double averagePrice(Map<String, Integer> map) {
        Collection<Integer> values = map.values();
        return values.stream().mapToDouble(Integer::doubleValue).sum() / values.size();
    }
}
