package com.github.akarazhev.jacademy.practice.jprog.task19;

import java.util.ArrayList;
import java.util.List;

public class ArrayListExercise2 {

    public static void main(final String[] args) {
        final List<Employee> list = new ArrayList<>();
        list.add(new Employee("Alex", 23, "USA"));
        list.add(new Employee("Dave", 34, "India"));
        list.add(new Employee("Carl", 21, "USA"));
        list.add(new Employee("Joe", 56, "Russia"));
        list.add(new Employee("Amit", 64, "China"));
        list.add(new Employee("Ryan", 19, "Brazil"));
    }
}
