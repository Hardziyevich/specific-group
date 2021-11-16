package com.github.akarazhev.jacademy.jprog.multithreading.threadbasic.cyclicbarrier;

import java.util.concurrent.BrokenBarrierException;
import java.util.concurrent.CyclicBarrier;

/**
 * Runnable task for each thread.
 */
public class Task implements Runnable {
    private CyclicBarrier barrier;

    public Task(CyclicBarrier barrier) {
        this.barrier = barrier;
    }

    //Await is invoked to wait for other threads
    @Override
    public void run() {
        try {
            System.out.println(Thread.currentThread().getName() + " is waiting on barrier");
            barrier.await();
            //printing after crossing the barrier
            System.out.println(Thread.currentThread().getName() + " has crossed the barrier");
        } catch (InterruptedException ex) {
            System.err.println(Task.class.getName() + ex);
        } catch (BrokenBarrierException ex) {
            System.err.println(Task.class.getName() + ex);
        }
    }
}
