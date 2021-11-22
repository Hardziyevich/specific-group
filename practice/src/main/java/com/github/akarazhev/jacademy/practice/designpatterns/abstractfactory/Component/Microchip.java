package com.github.akarazhev.jacademy.practice.designpatterns.abstractfactory.Component;

public class Microchip implements ElectricalComponent{
    @Override
    public String getElement() {
        return "Microchip";
    }
}
