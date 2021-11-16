package com.github.akarazhev.jacademy.jprog.collections.arraylist.v4;

import java.util.ArrayList;
import java.util.List;

public class ArrayListDemo {

    public static void main(String[] args) {
        List<Integer> list = new ArrayList<>();
        list.add(10);
        list.add(20);
        list.add(30);
        list.add(40);

        for (int i = 0; i < list.size(); i++) { //Simple for loop
            System.out.println(list.get(i));
        }

        for (Integer i : list) {   //Enhanced for loop
            System.out.println(i);
        }
    }
}

