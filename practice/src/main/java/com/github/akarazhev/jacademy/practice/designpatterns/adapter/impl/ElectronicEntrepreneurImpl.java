package com.github.akarazhev.jacademy.practice.designpatterns.adapter.impl;

import com.github.akarazhev.jacademy.practice.designpatterns.adapter.Component;
import com.github.akarazhev.jacademy.practice.designpatterns.adapter.Entrepreneur;

import java.util.Objects;

public class ElectronicEntrepreneurImpl implements Entrepreneur {
    @Override
    public Component sell() {
        return new Component(1,"Resistor");
    }

    @Override
    public void buy(Component objects) {

    }
}
