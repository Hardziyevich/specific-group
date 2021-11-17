package com.github.akarazhev.jacademy.jprog.collections.treeset.v4;

import java.util.TreeSet;

public class TreeSetDemo {

    public static void main(String[] args) {
        TreeSet<Integer> set = new TreeSet<>();
        set.add(21);
        set.add(32);
        set.add(44);
        set.add(11);
        set.add(54);
        set.add(3);
        set.add(9);
        set.add(41);

        System.out.println("Removing 44 from TreeSet " + set.remove(new Integer(44)));
        System.out.println("Removing 100 from TreeSet " + set.remove(new Integer(100)));
    }
}

