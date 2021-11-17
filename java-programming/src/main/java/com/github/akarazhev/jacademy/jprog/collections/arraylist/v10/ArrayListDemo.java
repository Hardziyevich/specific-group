package com.github.akarazhev.jacademy.jprog.collections.arraylist.v10;

import java.util.ArrayList;
import java.util.List;

public class ArrayListDemo {

    public static void doSomeWork(List list) {
        list.add("India");
    }

    public static void main(String[] args) {
        List list = new ArrayList();
        list.add(10);
        list.add(20);
        doSomeWork(list);

        Integer i = (Integer) list.get(2);
    }
}

