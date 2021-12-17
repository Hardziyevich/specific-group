package com.github.akarazhev.jacademy.practice.designpatterns.bridge.impl;

import com.github.akarazhev.jacademy.practice.designpatterns.bridge.Component;

/**
 * Entity class contains property for component and implement behaviour component.
 */
public abstract class ElectricalComponentImpl implements Component {
    private final String type;
    private final String value;

    /**
     * Constructor for initialization electrical component
     *
     * @param type  a type of component
     * @param value a value of component
     */
    public ElectricalComponentImpl(String type, String value) {
        this.type = type;
        this.value = value;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public String getType() {
        return type;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public String getValue() {
        return value;
    }

}
