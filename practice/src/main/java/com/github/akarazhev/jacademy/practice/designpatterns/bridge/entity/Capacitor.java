package com.github.akarazhev.jacademy.practice.designpatterns.bridge.entity;

import com.github.akarazhev.jacademy.practice.designpatterns.bridge.impl.ElectricalComponentImpl;

/**
 * {@inheritDoc}
 */
public class Capacitor extends ElectricalComponentImpl {

    /**
     * {@inheritDoc}
     */
    public Capacitor(String value) {
        super("Capacitor", value);
    }

}
