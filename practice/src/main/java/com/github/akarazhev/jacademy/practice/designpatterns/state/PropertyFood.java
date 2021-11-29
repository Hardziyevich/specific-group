package com.github.akarazhev.jacademy.practice.designpatterns.state;

@FunctionalInterface
public interface PropertyFood {
    void execute(String property, String data);
}
