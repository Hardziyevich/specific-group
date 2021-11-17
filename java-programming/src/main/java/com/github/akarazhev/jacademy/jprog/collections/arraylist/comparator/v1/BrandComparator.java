package com.github.akarazhev.jacademy.jprog.collections.arraylist.comparator.v1;

import com.github.akarazhev.jacademy.jprog.collections.arraylist.comparator.Vehicle;

import java.util.Comparator;

public class BrandComparator implements Comparator<Vehicle> {

    @Override
    public int compare(Vehicle o1, Vehicle o2) {
        return o1.brand.compareTo(o2.brand);
    }
}
