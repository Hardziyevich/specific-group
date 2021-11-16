package com.github.akarazhev.jacademy.jprog.collections.arraylist.v2;

import java.util.ArrayList;
import java.util.List;

public class ArrayListDemo {

    public static void main(String[] args) {
        List<String> list = new ArrayList<>();
        list.add("apple");
        list.add("banana");

        list.replaceAll((element) -> element.toUpperCase());

        System.out.println(list);
    }
}

