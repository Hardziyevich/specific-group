package com.github.akarazhev.jacademy.jprog.collections.hashmap.v11;

import java.util.HashMap;
import java.util.Map;
import java.util.Map.Entry;

public class HashMapDemo {

    public static void main(String[] args) {
        Employee emp1 = new Employee(123, "Jane");
        Employee emp2 = new Employee(123, "Jane");

        Map<Employee, Integer> employeeMap = new HashMap<>();

        employeeMap.put(emp1, 56000);
        employeeMap.put(emp2, 45000);

        for (Entry<Employee, Integer> entry : employeeMap.entrySet()) {
            System.out.println("Employee Id: " + entry.getKey().empId + " Employee Name: " + entry.getKey().empName);
        }
    }
}
