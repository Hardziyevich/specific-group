package com.github.akarazhev.jacademy.jprog.collections.collections.v6;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class ArrayListDemo {

    public static void main(String[] args) {
        List<Integer> list = new ArrayList<>();
        list.add(34);
        list.add(45);

        Collections.fill(list, 10);

        System.out.println(list);
    }
}

