package com.github.akarazhev.jacademy.jprog.collections.arraylist.comparator.v1;

import com.github.akarazhev.jacademy.jprog.collections.arraylist.comparator.Vehicle;

import java.util.Comparator;

public class MakeYearComparator implements Comparator<Vehicle> {

    @Override
    public int compare(Vehicle o1, Vehicle o2) {
        return o1.makeYear.compareTo(o2.makeYear);
    }
}

