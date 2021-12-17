package com.github.akarazhev.jacademy.practice.designpatterns.memento;

/**
 * Entity class which store information.
 */
public class Document {

    private final String info;

    public Document(String info) {
        this.info = info;
    }

    public String getInfo() {
        return info;
    }

}
