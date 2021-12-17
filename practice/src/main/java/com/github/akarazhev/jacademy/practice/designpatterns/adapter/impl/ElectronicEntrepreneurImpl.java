package com.github.akarazhev.jacademy.practice.designpatterns.adapter.impl;

import com.github.akarazhev.jacademy.practice.designpatterns.adapter.Component;
import com.github.akarazhev.jacademy.practice.designpatterns.adapter.Entrepreneur;

/**
 * {@inheritDoc}
 */
public class ElectronicEntrepreneurImpl implements Entrepreneur {

    /**
     * {@inheritDoc}
     */
    @Override
    public Component sell() {
        return new Component(1, "Resistor");
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public void buy(Component objects) {

    }
}
