package com.github.akarazhev.jacademy.practice.designpatterns.abstractfactory.Component;

public class Capacitor implements ElectricalComponent {

    private final String capacitorId = "Capacitor";

    @Override
    public String getElement() {
       return capacitorId;
    }
}
