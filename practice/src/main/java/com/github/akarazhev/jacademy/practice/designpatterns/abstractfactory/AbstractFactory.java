package com.github.akarazhev.jacademy.practice.designpatterns.abstractfactory;

import com.github.akarazhev.jacademy.practice.designpatterns.abstractfactory.Component.Capacitor;
import com.github.akarazhev.jacademy.practice.designpatterns.abstractfactory.Component.Diode;
import com.github.akarazhev.jacademy.practice.designpatterns.abstractfactory.Component.ElectricalComponent;
import com.github.akarazhev.jacademy.practice.designpatterns.abstractfactory.Component.Resistor;

public class AbstractFactory {

    public static final String CAPACITOR = "Capacitor";
    public static final String RESISTOR = "Resistor";
    public static final String DIODE = "Diode";

    public static ElectricalComponent getComponent(String typeElement){
        switch (typeElement) {
            case CAPACITOR: return new Capacitor();
            case RESISTOR: return new Resistor();
            case DIODE: return new Diode();
            default:
                throw new IllegalArgumentException(typeElement + " not contained in Market");
        }
    }
}
