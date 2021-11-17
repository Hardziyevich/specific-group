package com.github.akarazhev.jacademy.jprog.collections.hashmap.v15;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Set;

public class HashMapDemo {

    public static void main(String[] args) {
        Map<String, Integer> stockPrice = new HashMap<>();
        stockPrice.put("Oracle", 56);
        stockPrice.put("Fiserv", 117);
        stockPrice.put("BMW", 73);
        stockPrice.put("Microsoft", 213);

        Set<Entry<String, Integer>> entrySet = stockPrice.entrySet(); // Returns a Set of Entries

        Iterator<Entry<String, Integer>> itr = entrySet.iterator(); //Getting the iterator

        while (itr.hasNext()) {
            Entry<String, Integer> entry = itr.next();
            System.out.println("Company Name: " + entry.getKey() + " Stock Price: " + entry.getValue());

            if (entry.getKey().equals("Oracle")) {
                itr.remove();
            }
        }

        System.out.println(stockPrice);
    }
}

