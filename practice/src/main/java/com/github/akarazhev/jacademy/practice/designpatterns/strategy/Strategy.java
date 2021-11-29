package com.github.akarazhev.jacademy.practice.designpatterns.strategy;

@FunctionalInterface
public interface Strategy {
    boolean filter(String data);
}
