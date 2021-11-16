package com.github.akarazhev.jacademy.jprog.collections.treemap.v5;

import java.util.TreeMap;

public class TreeMapDemo {

    public static void main(String[] args) {
        TreeMap<String, Integer> map = new TreeMap<>();
        map.put("Oracle", 43);
        map.put("Microsoft", 56);
        map.put("Apple", 76);
        map.put("Novartis", 87);

        System.out.println("Replacing the value of Oracle : " + map.replace("Oracle", 67));
        System.out.println("Latest value of Oracle : " + map.get("Oracle"));

        System.out.println("Replacing the value of Apple only if current value is 50 : " +
                map.replace("Apple", 50, 90));
        System.out.println("Latest value of Oracle : " + map.get("Apple"));

        System.out.println("Replacing the value of Apple only if current value is 76 : " +
                map.replace("Apple", 76, 90));
        System.out.println("Latest value of Oracle : " + map.get("Apple"));
    }
}

