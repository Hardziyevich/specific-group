package com.github.akarazhev.jacademy.jprog.collections.arraylist.comparable;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

class Employee {

    String name;
    int age;

    public Employee(String name, int age) {
        super();
        this.name = name;
        this.age = age;
    }

}

public class ArrayListDemo {

    public static void main(String[] args) {
        List<Employee> list = new ArrayList<>();
        list.add(new Employee("Jane", 29));
        list.add(new Employee("Alex", 54));

//        Collections.sort(list);
        System.out.println("ArrayList in asc order: " + list);
    }
}
