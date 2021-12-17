package com.github.akarazhev.jacademy.practice.designpatterns.bridge.entity;

import com.github.akarazhev.jacademy.practice.designpatterns.bridge.impl.ElectricalComponentImpl;

/**
 * {@inheritDoc}
 */
public class Resistor extends ElectricalComponentImpl {

    /**
     * {@inheritDoc}
     */
    public Resistor(String value) {
        super("Resistor", value);
    }

}
