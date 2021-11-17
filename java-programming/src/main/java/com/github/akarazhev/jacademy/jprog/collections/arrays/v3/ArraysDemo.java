package com.github.akarazhev.jacademy.jprog.collections.arrays.v3;

import com.github.akarazhev.jacademy.jprog.collections.identityhashmap.Employee;

import java.util.Arrays;

public class ArraysDemo {

    public static void main(String[] args) {
        Employee[] employees = {new Employee(123, "Jay"), new Employee(124, "Roy"),
                new Employee(125, "Nikki"),
                new Employee(126, "Tom")};
        int index = Arrays.binarySearch(employees, new Employee(124, "Roy"));
        System.out.println("The index of employee in the array is " + index);
    }
}

