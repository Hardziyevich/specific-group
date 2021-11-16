package com.github.akarazhev.jacademy.jprog.features.stream.reduction.v3;

import java.util.ArrayList;
import java.util.List;

public class StreamDemo {

    public static void main(String[] args) {
        List<Integer> list = new ArrayList<>();
        list.add(1);
        list.add(2);
        list.add(3);
        list.add(4);
        list.add(5);
        list.add(6);

        int totalSum = list.stream()
                .reduce(5, (partialSum, num) -> partialSum + num);

        System.out.println("Total Sum is " + totalSum);
    }
}


