package com.github.akarazhev.jacademy.jprog.collections.arraylist.comparable.v3;

public class Vehicle implements Comparable<Vehicle> {

    String brand;
    Integer makeYear;

    public Vehicle(String brand, Integer makeYear) {
        super();
        this.brand = brand;
        this.makeYear = makeYear;
    }

    @Override
    public int compareTo(Vehicle o) {
        //Using the compareTo() method of String class.
        return this.brand.compareTo(o.brand);
    }
}

