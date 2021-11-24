package com.github.akarazhev.jacademy.practice.designpatterns.composite.impl;

import com.github.akarazhev.jacademy.practice.designpatterns.composite.Component;
import com.github.akarazhev.jacademy.practice.designpatterns.composite.Composite;
import com.github.akarazhev.jacademy.practice.designpatterns.composite.entity.Capacitor;

import java.util.*;

public class WarehouseComponentImpl implements Composite {
    private Map<WarehouseComponentImpl.Type,Component> compositeMap = new EnumMap(Type.class);

    public enum Type{
        CAPACITOR,
        RESISTOR
    }

    @Override
    public void sort() {

    }

    @Override
    public boolean add(Component component) {
        if(component.getClass().isInstance(Capacitor.class)) {
           compositeMap.put(Type.CAPACITOR,component);
           return true;
        }
        return false;
    }

    @Override
    public List<Component> getAllComponent() {
        return new ArrayList<>(compositeMap.values());
    }
}
