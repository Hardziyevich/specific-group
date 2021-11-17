package com.github.akarazhev.jacademy.jprog.features.completablefuture.v9;

import java.util.concurrent.*;

public class CompletableFutureDemo {

    public static void main(String[] args) {
        // Create a future which returns an integer.
        CompletableFuture<Integer> future = CompletableFuture.supplyAsync(() -> {
            try {
                TimeUnit.SECONDS.sleep(1);
                System.out.println(Thread.currentThread().getName());
            } catch (InterruptedException e) {
                throw new IllegalStateException(e);
            }
            return 50;
        });

        // Calling thenApply() which takes a Function as parameter.
        // It takes a number as input and returns double of number.
        future.thenAccept(num -> {
            System.out.println(Thread.currentThread().getName());
            System.out.println("The value is " + num);
        });
    }
}

