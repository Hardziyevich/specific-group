package com.github.akarazhev.jacademy.jprog.collections.treeset.v1;

import java.util.LinkedList;
import java.util.List;
import java.util.TreeSet;

public class TreeSetDemo {

    public static void main(String[] args) {
        List<Integer> list = new LinkedList<>();
        list.add(21);
        list.add(32);
        list.add(44);
        list.add(11);
        list.add(54);

        TreeSet<Integer> set = new TreeSet<>(list);
        System.out.println("TreeSet elements in ascending order " + set);
    }
}