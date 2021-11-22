package com.github.akarazhev.jacademy.practice.designpatterns.abstractfactory.Component;

public class Diode implements ElectricalComponent {
    private final String diodeId = "Diode";

    @Override
    public String getElement() {
        return diodeId;
    }
}
