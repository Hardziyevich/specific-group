package com.github.akarazhev.jacademy.practice.designpatterns.adapter;


public class Component {
    private int componentId;
    private String name;

    public Component(int componentId, String name) {
        this.componentId = componentId;
        this.name = name;
    }

    public int getComponentId() {
        return componentId;
    }

    public String getName() {
        return name;
    }
}
