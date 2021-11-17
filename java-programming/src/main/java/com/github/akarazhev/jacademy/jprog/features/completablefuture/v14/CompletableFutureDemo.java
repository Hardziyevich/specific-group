package com.github.akarazhev.jacademy.jprog.features.completablefuture.v14;

import java.util.Optional;
import java.util.concurrent.*;
import java.util.stream.Stream;

public class CompletableFutureDemo {

    public static void main(String[] args) {
        CompletableFuture<Integer> future1 = CompletableFuture.supplyAsync(() -> 50);
        CompletableFuture<Integer> future2 = CompletableFuture.supplyAsync(() -> 40);
        CompletableFuture<Integer> future3 = CompletableFuture.supplyAsync(() -> 30);

        Optional<Integer> maxElement = Stream.of(future1, future2, future3)
                .map(CompletableFuture::join) // This will return the stream of results of all futures.
                .max(Integer::compareTo);

        System.out.println("The max element is " + maxElement);
    }
}


