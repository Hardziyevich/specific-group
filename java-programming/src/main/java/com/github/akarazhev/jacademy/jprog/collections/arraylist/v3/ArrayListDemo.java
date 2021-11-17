package com.github.akarazhev.jacademy.jprog.collections.arraylist.v3;

import java.util.ArrayList;
import java.util.List;

public class ArrayListDemo {

    public static void main(String[] args) {
        List<Integer> list = new ArrayList<>();
        list.add(10);
        list.add(20);
        list.add(30);
        list.add(40);
        list.add(10);

        list.set(1, 100);

        System.out.println(list);

        if (list.contains(30)) {
            System.out.println("List contains 30");
        }

        System.out.println("Index of first occurence of 10 is " + list.indexOf(10));
        System.out.println("Index of last occurence of 10 is " + list.lastIndexOf(10));
    }
}

