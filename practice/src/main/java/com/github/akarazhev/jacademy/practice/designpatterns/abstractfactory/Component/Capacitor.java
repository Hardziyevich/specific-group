package com.github.akarazhev.jacademy.practice.designpatterns.abstractfactory.Component;

public class Capacitor implements ElectricalComponent {

    private final String capacitorId = "Capacitor";

    @Override
    public void showElement() {
        System.out.println(capacitorId);
    }
}
