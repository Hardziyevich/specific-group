package com.github.akarazhev.jacademy.jprog.collections.collections.v5;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class CollectionsDemo {

    public static void main(String[] args) {
        List<Integer> list1 = new ArrayList<>();
        list1.add(9);
        list1.add(12);
        list1.add(34);
        list1.add(54);
        list1.add(66);
        list1.add(76);

        List<Integer> list2 = new ArrayList<>();
        list2.add(90);
        list2.add(12);
        list2.add(98);
        list2.add(43);

        Collections.copy(list1, list2);

        System.out.println(list1);
    }
}

