package com.github.akarazhev.jacademy.practice.designpatterns.visitor.impl;

import com.github.akarazhev.jacademy.practice.designpatterns.visitor.Component;
import com.github.akarazhev.jacademy.practice.designpatterns.visitor.Visitor;

import java.util.ArrayList;
import java.util.List;

/**
 * {@inheritDoc}
 */
public class TextImpl implements Component {

    private final List<Component> components = new ArrayList<>();

    public void addComponent(Component component){
        components.add(component);
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public void execute(Visitor visitor) {
        for (Component component : components) {
            component.execute(visitor);
        }
    }

}
