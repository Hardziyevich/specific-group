package com.github.akarazhev.jacademy.practice.jprog.task14.recursion;

import com.github.akarazhev.jacademy.practice.jprog.task14.LinkedList;
import com.github.akarazhev.jacademy.practice.jprog.task14.Node;

import java.util.Objects;

public final class Solution {
    /* Returns count of nodes in linked list */
    public static int lengthOfList(Node head) {
        // Write your code here
        // Modify the return statement according to your code
        //Checking Base case
        if (head != null) {
            //Recursive case
            return lengthOfList(head.getNext()) + 1;
        } else {
            return 0;
        }
    }

    public static void main(final String[] args) {
        /* Start with the empty list */
        LinkedList llist = new LinkedList();
        llist.push(1);
        llist.push(3);
        llist.push(1);
        llist.push(2);
        llist.push(1);
        //lengthOfList is working. That is helping to count of nodes in linked list using recursion.
        System.out.println("Count of nodes is = " + lengthOfList(llist.getHead()));
    }
}
