package com.github.akarazhev.jacademy.practice.designpatterns.abstractfactory;

import com.github.akarazhev.jacademy.practice.designpatterns.abstractfactory.Component.Capacitor;
import com.github.akarazhev.jacademy.practice.designpatterns.abstractfactory.Component.Diode;
import com.github.akarazhev.jacademy.practice.designpatterns.abstractfactory.Component.ElectricalComponent;
import com.github.akarazhev.jacademy.practice.designpatterns.abstractfactory.Component.Resistor;

public class AbstractFactory {

    public static Master startWorker(String typeElement){
        switch (typeElement) {
            case "chip": return new WorkerChip();
            case "passive": return new WorkerPE();
            default:
                throw new IllegalArgumentException(typeElement + " not contained in Market");
        }
    }
}
