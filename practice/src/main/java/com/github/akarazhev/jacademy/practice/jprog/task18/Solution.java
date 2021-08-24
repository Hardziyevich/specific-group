package com.github.akarazhev.jacademy.practice.jprog.task18;

import com.github.akarazhev.jacademy.practice.jprog.task14.Node;

public final class Solution {

    public static boolean search(Node head, int num) {
        // Write your code here
        // Do not change the input parameters

        return false;
    }

    public static void main(final String[] args) {
        /* Start with the empty list */
        LinkedList list = new LinkedList();
        list.insertAtHead(0);
        list.insertAtHead(3);
        list.insertAtHead(1);
        list.insertAtHead(6);
        list.insertAtHead(4);

        System.out.println("Linked List: ");
        for (Node i = list.getHead(); i != null; i = i.getNext()) {
            System.out.print(i.getValue() + " ");
        }

        System.out.println(" ");
        int searchFor = 8;
        boolean result = search(list.getHead(), searchFor);
        System.out.println("Is " + searchFor + " present in the list? : " + result);
    }
}
