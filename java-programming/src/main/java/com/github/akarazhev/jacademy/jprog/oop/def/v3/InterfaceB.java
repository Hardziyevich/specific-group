package com.github.akarazhev.jacademy.jprog.oop.def.v3;

public interface InterfaceB {

    default void printSomething() {
        System.out.println("I am inside B interface");
    }
}