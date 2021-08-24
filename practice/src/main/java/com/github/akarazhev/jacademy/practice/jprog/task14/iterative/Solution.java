package com.github.akarazhev.jacademy.practice.jprog.task14.iterative;

import com.github.akarazhev.jacademy.practice.jprog.task14.LinkedList;
import com.github.akarazhev.jacademy.practice.jprog.task14.Node;

public final class Solution {
    /* Returns count of nodes in linked list */
    public static int lengthOfList(Node head) {
        int count = 0;
        Node temp = head;
        while (temp != null) {
            count++;
            temp = temp.getNext();
        }

        return count;
    }

    public static void main(final String[] args) {
        /* Start with the empty list */
        LinkedList llist = new LinkedList();
        llist.push(1);
        llist.push(3);
        llist.push(1);
        llist.push(2);
        llist.push(1);

        System.out.println("Count of nodes is = " + lengthOfList(llist.getHead()));
    }
}
