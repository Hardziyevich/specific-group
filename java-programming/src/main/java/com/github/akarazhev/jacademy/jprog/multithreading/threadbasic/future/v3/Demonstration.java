package com.github.akarazhev.jacademy.jprog.multithreading.threadbasic.future.v3;

import java.util.concurrent.Callable;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.Future;

public class Demonstration {

    static ExecutorService threadPool = Executors.newSingleThreadExecutor();

    public static void main(String[] args) throws Exception {
        System.out.println(pollingStatusAndCancelTask(10));
        threadPool.shutdown();
    }

    static int pollingStatusAndCancelTask(final int n) throws Exception {
        int result = -1;
        Callable<Integer> sumTask1 = new Callable<Integer>() {

            public Integer call() throws Exception {
                // wait for 10 milliseconds
                Thread.sleep(10);
                int sum = 0;
                for (int i = 1; i <= n; i++)
                    sum += i;

                return sum;
            }
        };

        Callable<Void> randomTask = new Callable<Void>() {

            public Void call() throws Exception {
                // go to sleep for an hours
                Thread.sleep(3600 * 1000);
                return null;
            }
        };

        Future<Integer> f1 = threadPool.submit(sumTask1);
        Future<Void> f2 = threadPool.submit(randomTask);

        // Poll for completion of first task
        try {
            // Before we poll for completion of second task,
            // cancel the second one
            f2.cancel(true);
            // Polling the future to check the status of the
            // first submitted task
            while (!f1.isDone()) {
                System.out.println("Waiting for first task to complete.");
            }

            result = f1.get();
        } catch (ExecutionException ee) {
            System.out.println("Something went wrong.");
        }

        System.out.println("\nIs second task cancelled : " + f2.isCancelled());
        return result;
    }
}
