package com.github.akarazhev.jacademy.practice.designpatterns.bridge.impl;

import com.github.akarazhev.jacademy.practice.designpatterns.bridge.Component;

public abstract class ElectricalComponentImpl implements Component {
    private String type;
    private String value;

    public ElectricalComponentImpl(String type, String value) {
        this.type = type;
        this.value = value;
    }

    @Override
    public String getType() {
        return type;
    }

    @Override
    public String getValue() {
        return value;
    }
}
