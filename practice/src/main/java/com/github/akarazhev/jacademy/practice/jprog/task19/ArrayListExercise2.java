package com.github.akarazhev.jacademy.practice.jprog.task19;

import java.util.ArrayList;
import java.util.Collection;
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

        removeResideInTheUSA(list);

        list.forEach(e -> System.out.println(e.getCountry()));
    }

    //Methode is working and remove all Employee who is resided in the USA.
    public static void removeResideInTheUSA(Collection<Employee> employees) {
        employees.removeIf(employee -> employee.getCountry().equals("USA"));
    }
}
