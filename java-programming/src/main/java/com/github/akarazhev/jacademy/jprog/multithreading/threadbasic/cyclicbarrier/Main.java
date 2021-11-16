package com.github.akarazhev.jacademy.jprog.multithreading.threadbasic.cyclicbarrier;

import java.util.concurrent.CyclicBarrier;

/**
 * Main thread that demonstrates how to use CyclicBarrier.
 */
public class Main {

    public static void main(String[] args) {
        //Creating CyclicBarrier with 3 parties i.e. 3 Threads needs to call await()
        final CyclicBarrier cb = new CyclicBarrier(3, new Runnable() {

            //Action that executes after the last thread arrives
            @Override
            public void run() {
                //This task will be executed once all threads reaches barrier
                System.out.println("All parties have arrived at the barrier, lets continue execution.");
            }
        });

        //starting each thread
        Thread t1 = new Thread(new Task(cb), "Thread 1");
        Thread t2 = new Thread(new Task(cb), "Thread 2");
        Thread t3 = new Thread(new Task(cb), "Thread 3");

        t1.start();
        t2.start();
        t3.start();
    }
}
