package com.github.akarazhev.jacademy.practice.designpatterns.adapter;

import java.util.Objects;

public interface Entrepreneur {
    Component sell();
    void buy(Component objects);
}
