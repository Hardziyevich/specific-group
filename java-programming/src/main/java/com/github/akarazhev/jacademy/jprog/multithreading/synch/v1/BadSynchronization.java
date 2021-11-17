package com.github.akarazhev.jacademy.jprog.multithreading.synch.v1;

public class BadSynchronization {

    public static void main(String[] args) throws InterruptedException {
        Object dummyObject = new Object();

        // Attempting to call wait() on the object
        // outside of a synchronized block.
        dummyObject.wait();
    }
}