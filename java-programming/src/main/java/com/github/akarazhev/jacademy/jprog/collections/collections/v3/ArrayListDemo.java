package com.github.akarazhev.jacademy.jprog.collections.collections.v3;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class ArrayListDemo {

    public static void main(String[] args) {
        List<Integer> list = new ArrayList<>();
        list.add(9);
        list.add(12);
        list.add(9);
        list.add(76);
        list.add(9);
        list.add(75);

        System.out.println("Total number of times,9 is present in the List is: " + Collections.frequency(list, 9));
    }
}

