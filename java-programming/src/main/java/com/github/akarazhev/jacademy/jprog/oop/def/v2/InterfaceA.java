package com.github.akarazhev.jacademy.jprog.oop.def.v2;

public interface InterfaceA {

    default void printSomething() {
        System.out.println("I am inside A interface");
    }
}

