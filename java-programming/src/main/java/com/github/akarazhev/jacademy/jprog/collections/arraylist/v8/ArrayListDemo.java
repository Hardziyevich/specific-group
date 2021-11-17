package com.github.akarazhev.jacademy.jprog.collections.arraylist.v8;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class ArrayListDemo {

    public static void main(String[] args) {
        List<Integer> list = new ArrayList<>();
        list.add(34);
        list.add(45);

        Iterator<Integer> itr = list.iterator();
        list.add(54);

        while (itr.hasNext()) {
            System.out.println(itr.next());
        }
    }
}

