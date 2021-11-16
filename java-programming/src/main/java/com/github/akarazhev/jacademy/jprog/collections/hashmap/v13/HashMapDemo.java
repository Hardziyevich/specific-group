package com.github.akarazhev.jacademy.jprog.collections.hashmap.v13;

import java.util.HashMap;
import java.util.Map;

public class HashMapDemo {

    public static void main(String[] args) {
        Employee emp1 = new Employee(123, "Jane");

        Map<Employee, Integer> employeeMap = new HashMap<>();

        employeeMap.put(emp1, 56000);

        emp1.empName = "Alex";

        System.out.println(employeeMap.get(emp1));
    }
}

