package com.github.akarazhev.jacademy.practice.designpatterns.iterator;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Optional;

public class ElectricalComponent implements Iterator {

    private final List<String> components = new ArrayList<>();
    private int position;

    public boolean addComponent(String component) {
        return components.add(component);
    }

    public boolean removeComponent(String component) {
        boolean result = Optional.ofNullable(component).isPresent();
        if (result) {
            result = components.remove(component);
        }
        return result;
    }

    @Override
    public boolean hasNext() {
        return position < components.size() - 1;
    }

    @Override
    public String next() {
        return components.get(position++);
    }
}
