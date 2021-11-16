package com.github.akarazhev.jacademy.jprog.collections.arraylist.v9;

import java.util.ArrayList;
import java.util.List;
import java.util.ListIterator;

public class ArrayListDemo {

    public static void main(String[] args) {
        List<Integer> list = new ArrayList<>();
        list.add(10);
        list.add(20);
        list.add(30);
        list.add(40);

        // Getting ListIterator
        ListIterator<Integer> listIterator = list.listIterator();

        // Traversing elements
        System.out.println("Forward Direction Iteration:");
        while (listIterator.hasNext()) {
            System.out.println("Next element is " + listIterator.next() +
                    " and next index is " + listIterator.nextIndex());

        }

        // Traversing elements, the iterator is at the end at this point
        System.out.println("Backward Direction Iteration:");
        while (listIterator.hasPrevious()) {
            System.out.println("Previous element is " + listIterator.previous() +
                    " and previous index is " + listIterator.previousIndex());
        }
    }
}

