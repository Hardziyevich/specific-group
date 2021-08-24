package com.github.akarazhev.jacademy.practice.jprog.task14;

public final class Node {
    private final int value;
    private Node next;

    public Node(int value) {
        this.value = value;
    }

    public Node getNext() {
        return next;
    }

    public void setNext(Node next) {
        this.next = next;
    }
}
