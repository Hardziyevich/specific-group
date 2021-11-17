package com.github.akarazhev.jacademy.practice.jprog.task22;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;

public final class HashMapDemo3 {

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

        removeCompanyWithPriceLess(stockPrice, 50);
        stockPrice.forEach((x, y) -> System.out.printf("Company:%s,Price:%d%n", x, y));
    }

    //Method is working and remove company with price less than input variable
    private static void removeCompanyWithPriceLess(Map<String, Integer> map, int price) {
        Iterator<Map.Entry<String, Integer>> iterator = map.entrySet().iterator();
        iterator.forEachRemaining(x -> {
            if (x.getValue() < price) {
                iterator.remove();
            }
        });
    }
}
