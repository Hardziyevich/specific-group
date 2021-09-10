package com.github.akarazhev.jacademy.practice.jprog.task19;

public final class Employee {
    private final String name;
    private final int age;
    private final String country;

    public Employee(String name, int age, String country) {
        this.name = name;
        this.age = age;
        this.country = country;
    }

    public String getName() {
        return name;
    }

    public int getAge() {
        return age;
    }

    public String getCountry() {
        return country;
    }
}