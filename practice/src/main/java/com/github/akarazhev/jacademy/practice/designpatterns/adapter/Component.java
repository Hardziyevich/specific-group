package com.github.akarazhev.jacademy.practice.designpatterns.adapter;


/**
 * Entity class which represent a component.
 */
public class Component {

    private final int componentId;
    private final String name;

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
