package com.github.akarazhev.jacademy.practice.designpatterns.composite.impl;
import com.github.akarazhev.jacademy.practice.designpatterns.composite.Component;
import com.github.akarazhev.jacademy.practice.designpatterns.composite.Composite;
import com.github.akarazhev.jacademy.practice.designpatterns.composite.entity.Capacitor;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;
import java.util.stream.Collectors;

public class PackageCapacitorImpl implements Composite {
    private List<Component> list = new ArrayList<>();

    @Override
    public void sort() {
        list = list.stream().sorted(Comparator.comparing(Component::getValue)).collect(Collectors.toList());
    }

    @Override
    public boolean add(Component component) {
        if(component instanceof Capacitor) {
            return list.add(component);
        }
        return false;
    }

    @Override
    public List<Component> getAllComponent() {
        return List.copyOf(list);
    }
}
