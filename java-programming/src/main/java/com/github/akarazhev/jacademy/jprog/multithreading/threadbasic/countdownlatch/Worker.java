package com.github.akarazhev.jacademy.jprog.multithreading.threadbasic.countdownlatch;

import java.util.concurrent.CountDownLatch;

/**
 * The manufacturer thread that has to complete its tasks first
 */
public class Worker extends Thread {
    private CountDownLatch countDownLatch;

    public Worker(CountDownLatch countDownLatch, String name) {
        super(name);
        this.countDownLatch = countDownLatch;
    }

    @Override
    public void run() {
        System.out.println("Worker " + Thread.currentThread().getName() + " started");
        try {
            Thread.sleep(3000);
        } catch (InterruptedException ex) {
            ex.printStackTrace();
        }
        System.out.println("Worker  " + Thread.currentThread().getName() + " finished");

        //Each thread calls countDown() method on task completion.
        countDownLatch.countDown();
    }
}



