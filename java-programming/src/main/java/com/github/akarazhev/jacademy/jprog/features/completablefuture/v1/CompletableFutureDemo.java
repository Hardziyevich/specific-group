package com.github.akarazhev.jacademy.jprog.features.completablefuture.v1;

import java.util.concurrent.CompletableFuture;

public class CompletableFutureDemo {

    public static void main(String[] args) {
        CompletableFuture<String> completableFuture = CompletableFuture.completedFuture("Hello World");
        try {
            System.out.println(completableFuture.get());
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}

