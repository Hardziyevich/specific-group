package com.github.akarazhev.jacademy.jprog.collections.arraylist.comparable.v1;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class ArrayListDemo {

    public static void main(String[] args) {
        List<Employee> list = new ArrayList<>();
        list.add(new Employee("Jane", 29));
        list.add(new Employee("Alex", 54));
        list.add(new Employee("Matt", 19));
        list.add(new Employee("Roy", 72));

        Collections.sort(list);
        for (Employee emp : list) {
            System.out.println("Employee Name: " + emp.name + ", Employee Age: " + emp.age);
        }
    }
}

