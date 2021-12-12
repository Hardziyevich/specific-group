package com.github.akarazhev.jacademy.practice.designpatterns.chainofresponsibility.interpreter;

@FunctionalInterface
public interface Interpret {
    int interpret(String text);
}
