package com.github.akarazhev.jacademy.practice.designpatterns.bridge.entity;

import com.github.akarazhev.jacademy.practice.designpatterns.bridge.impl.ElectricalComponentImpl;

public class Resistor extends ElectricalComponentImpl {

    public Resistor(String value) {
        super("Resistor", value);
    }
}
