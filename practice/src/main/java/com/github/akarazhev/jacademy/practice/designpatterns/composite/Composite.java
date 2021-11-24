package com.github.akarazhev.jacademy.practice.designpatterns.composite;

import java.util.List;
import java.util.Objects;

public interface Composite {
    void sort();
    boolean add(Component component);
    List<Component> getAllComponent();
}
