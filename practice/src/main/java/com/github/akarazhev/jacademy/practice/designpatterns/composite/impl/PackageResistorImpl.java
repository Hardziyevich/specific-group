package com.github.akarazhev.jacademy.practice.designpatterns.composite.impl;

import com.github.akarazhev.jacademy.practice.designpatterns.composite.Component;
import com.github.akarazhev.jacademy.practice.designpatterns.composite.Composite;
import com.github.akarazhev.jacademy.practice.designpatterns.composite.entity.Resistor;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;
import java.util.stream.Collectors;

public class PackageResistorImpl implements Composite {
    private List<Component> list = new ArrayList<>();

    @Override
    public void sort() {
        list = list.stream().sorted(Comparator.comparing(Component::getValue)).collect(Collectors.toList());
    }

    @Override
    public boolean add(Component component) {
        if (component instanceof Resistor) {
            return list.add(component);
        } else {
            return false;
        }
    }

    @Override
    public List<Component> getAllComponent() {
        return List.copyOf(list);
    }
}
