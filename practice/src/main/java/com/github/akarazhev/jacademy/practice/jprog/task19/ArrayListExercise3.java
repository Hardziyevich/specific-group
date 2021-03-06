package com.github.akarazhev.jacademy.practice.jprog.task19;

import java.util.*;

public class ArrayListExercise3 {

    public static void main(final String[] args) {
        final List<Employee> list = new ArrayList<>();
        list.add(new Employee("Alex", 23, "USA"));
        list.add(new Employee("Dave", 34, "India"));
        list.add(new Employee("Carl", 21, "USA"));
        list.add(new Employee("Joe", 56, "Russia"));
        list.add(new Employee("Amit", 64, "China"));
        list.add(new Employee("Ryan", 19, "Brazil"));

        sortListEmployeeByCountry(list);

        list.forEach(x -> System.out.println(x.getCountry()));
    }

    //Method is working and helping sort List Employee by Country using interface Comparator.
    public static void sortListEmployeeByCountry(List<Employee> employees) {
        employees.sort(Comparator.comparing(Employee::getCountry));
    }
}
