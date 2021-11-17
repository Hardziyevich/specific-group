package com.github.akarazhev.jacademy.jprog.collections.enummap;

import java.util.EnumMap;
import java.time.DayOfWeek;

public class EnumMapDemo {

    public static void main(String[] args) {
        EnumMap<DayOfWeek, Integer> enumMap = new EnumMap<>(DayOfWeek.class);
        // Putting records in EnumMap
        enumMap.put(DayOfWeek.MONDAY, 5);
        enumMap.put(DayOfWeek.WEDNESDAY, 23);

        // Fetching the value from MONDAY
        System.out.println(enumMap.get(DayOfWeek.MONDAY));

        // Removing MONDAY from the Map
        enumMap.remove(DayOfWeek.MONDAY);
    }
}

