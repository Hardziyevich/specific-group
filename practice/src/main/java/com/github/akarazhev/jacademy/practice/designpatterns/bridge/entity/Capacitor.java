package com.github.akarazhev.jacademy.practice.designpatterns.bridge.entity;

import com.github.akarazhev.jacademy.practice.designpatterns.bridge.impl.ElectricalComponentImpl;

public class Capacitor extends ElectricalComponentImpl {
    public Capacitor(String value) {
        super("Capacitor", value);
    }
}
