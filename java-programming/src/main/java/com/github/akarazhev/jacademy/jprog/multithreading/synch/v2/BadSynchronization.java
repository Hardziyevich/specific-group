package com.github.akarazhev.jacademy.jprog.multithreading.synch.v2;

public class BadSynchronization {

    public static void main(String[] args) {
        Object dummyObject = new Object();
        Object lock = new Object();

        synchronized (lock) {
            lock.notify();

            // Attempting to call notify() on the object
            // in synchronized block of another object
            dummyObject.notify();
        }
    }
}