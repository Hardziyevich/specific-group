package com.github.akarazhev.jacademy.practice.jprog.task18;

import com.github.akarazhev.jacademy.practice.jprog.task14.Node;

public final class LinkedList {
    private Node head;

    public Node getHead() {
        return head;
    }

    public void insertAtHead(final int value) {
        final Node node = new Node(value);
        node.setNext(head);
        head = node;
    }
}
