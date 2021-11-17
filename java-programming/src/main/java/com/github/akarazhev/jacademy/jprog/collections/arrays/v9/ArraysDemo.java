package com.github.akarazhev.jacademy.jprog.collections.arrays.v9;

import java.util.Arrays;

public class ArraysDemo {

    public static void main(String[] args) {
        // Creating an Array of Employee objects.
        Employee[] employees = {new Employee(123, "Jay"), new Employee(124, "Ryan")};
        // Creating the copy of Array.
        Employee[] copiedArray = Arrays.copyOf(employees, 2);
        // Changing the name of first employee in original array.
        employees[0] = new Employee(123, "Changed Name");
        // Printing the name of first employee in original array.
        System.out.println(employees[0].empName);
        // Printing the name of first employee in copied array.
        System.out.println(copiedArray[0].empName);
    }
}

