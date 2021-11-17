package com.github.akarazhev.jacademy.jprog.features.completablefuture.v5;

import java.util.concurrent.*;

public class CompletableFutureDemo {

    public static void main(String[] args) {
        Executor executor = Executors.newFixedThreadPool(5);
        CompletableFuture<String> future = CompletableFuture.supplyAsync(() -> {
            try {
                TimeUnit.SECONDS.sleep(5);
            } catch (InterruptedException e) {
                throw new IllegalStateException(e);
            }
            return "Hello World";
        }, executor);

        System.out.println("This will print immediately");

        try {
            System.out.println(future.get());
        } catch (InterruptedException e) {
            e.printStackTrace();
        } catch (ExecutionException e) {
            e.printStackTrace();
        }

        System.out.println("This will print after 5 seconds");
    }
}

