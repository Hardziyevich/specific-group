package com.github.akarazhev.jacademy.jprog.collections.arraylist.v11;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class ArrayListDemo {

    public static void main(String[] args) {
        List<Integer> list = new ArrayList<>();
        list.add(34);
        list.add(12);
        list.add(9);
        list.add(76);
        list.add(29);
        list.add(75);

        Collections.sort(list);
        System.out.println("ArrayList in asc order: " + list);
    }
}

