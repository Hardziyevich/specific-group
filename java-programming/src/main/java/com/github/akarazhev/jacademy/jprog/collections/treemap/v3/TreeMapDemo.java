package com.github.akarazhev.jacademy.jprog.collections.treemap.v3;

import java.util.Map.Entry;
import java.util.TreeMap;

public class TreeMapDemo {

    public static void main(String[] args) {
        TreeMap<String, Integer> map = new TreeMap<>();
        map.put("Oracle", 43);
        map.put("Microsoft", 56);
        map.put("Apple", 76);
        map.put("Novartis", 87);

        //Fetching the first entry in the Map.
        Entry<String, Integer> firstEntry = map.firstEntry();

        System.out.println("Smallest key: " + firstEntry.getKey() + ", Value: " + firstEntry.getValue());

        //Fetching the last entry in the Map.
        Entry<String, Integer> lastEntry = map.lastEntry();
        System.out.println("Largest key: " + lastEntry.getKey() + ", Value: " + lastEntry.getValue());
    }
}

