package com.github.akarazhev.jacademy.jprog.collections.arraylist.v7;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class ArrayListDemo {

    public static void main(String[] args) {
        List<Integer> list = new ArrayList<>();
        list.add(10);
        list.add(20);
        list.add(30);
        list.add(40);
        list.add(10);

        Iterator<Integer> itr = list.iterator();

        while (itr.hasNext()) {
            int next = itr.next();
            if (next == 30) {
                itr.remove();
            }
        }
        System.out.println(list);
    }
}

