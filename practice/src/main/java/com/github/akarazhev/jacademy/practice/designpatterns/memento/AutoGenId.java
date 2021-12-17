package com.github.akarazhev.jacademy.practice.designpatterns.memento;

/**
 * Util class for generation id.
 */
public class AutoGenId {
    private static int id;

    private AutoGenId(){}

    public static int getId() {
        return id++;
    }
}
