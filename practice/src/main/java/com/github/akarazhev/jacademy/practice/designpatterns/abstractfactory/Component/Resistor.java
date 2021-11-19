package com.github.akarazhev.jacademy.practice.designpatterns.abstractfactory.Component;

public class Resistor implements ElectricalComponent {

    private final String resistorId = "Resistor";

    @Override
    public void showElement() {
        System.out.println(resistorId);
    }
}
