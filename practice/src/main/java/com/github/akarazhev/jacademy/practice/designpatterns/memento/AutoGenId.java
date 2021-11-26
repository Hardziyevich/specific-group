package com.github.akarazhev.jacademy.practice.designpatterns.memento;

public class AutoGenId {
    private static int id;

    private AutoGenId(){}

    public static int getId() {
        return id++;
    }
}
