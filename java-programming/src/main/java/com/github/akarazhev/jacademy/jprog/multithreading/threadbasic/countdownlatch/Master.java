package com.github.akarazhev.jacademy.jprog.multithreading.threadbasic.countdownlatch;

public class Master extends Thread {

    public Master(String name) {
        super(name);
    }

    @Override
    public void run() {
        System.out.println("Master executed " + Thread.currentThread().getName());
        try {
            Thread.sleep(2000);
        } catch (InterruptedException ex) {
            ex.printStackTrace();
        }
    }
}
