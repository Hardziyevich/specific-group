package com.github.akarazhev.jacademy.practice.designpatterns.composite.entity;

import com.github.akarazhev.jacademy.practice.designpatterns.composite.impl.ElectricalComponentImpl;

public class Resistor extends ElectricalComponentImpl {

    public Resistor(String value) {
        super("Resistor", value);
    }
}
