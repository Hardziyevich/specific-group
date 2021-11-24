package com.github.akarazhev.jacademy.practice.designpatterns.composite.entity;

import com.github.akarazhev.jacademy.practice.designpatterns.composite.impl.ElectricalComponentImpl;

public class Capacitor extends ElectricalComponentImpl {
    public Capacitor(String value) {
        super("Capacitor", value);
    }
}
