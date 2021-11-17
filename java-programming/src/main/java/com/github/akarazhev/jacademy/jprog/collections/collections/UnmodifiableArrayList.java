package com.github.akarazhev.jacademy.jprog.collections.collections;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class UnmodifiableArrayList {

    public static void main(String[] args) {
        List<String> list = new ArrayList<String>();
        list.add("India");
        list.add("USA");
        list.add("Russia");

        List<String> unmodifiableList = Collections.unmodifiableList(list);
        // This will throw exception because element can't be added to unmodifiable list.
        unmodifiableList.add("China");
    }
}

