package com.github.akarazhev.jacademy.jprog.multithreading.thread.v1;

public class Demonstration {

    public static void main(String[] args) {
        Thread t = new Thread(new Runnable() {

            public void run() {
                System.out.println("Say Hello");
            }
        });
        t.start();
    }
}