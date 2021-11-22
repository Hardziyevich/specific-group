package com.github.akarazhev.jacademy.practice.designpatterns.abstractfactory;

import com.github.akarazhev.jacademy.practice.designpatterns.abstractfactory.Component.Capacitor;
import com.github.akarazhev.jacademy.practice.designpatterns.abstractfactory.Component.Diode;
import com.github.akarazhev.jacademy.practice.designpatterns.abstractfactory.Component.ElectricalComponent;
import com.github.akarazhev.jacademy.practice.designpatterns.abstractfactory.Component.Microchip;

import java.util.Iterator;
import java.util.List;

public class WorkerPE implements Master{

    @Override
    public boolean placeOnBoard(List<ElectricalComponent> components) throws Exception {
        for (ElectricalComponent component : components) {
            if(component instanceof Microchip){
                throw new Exception("I`m working with passive element");
            }
        }
        for (Iterator<ElectricalComponent> it = components.iterator(); it.hasNext(); ) {
            it.next();
            it.remove();
        }
        return components.isEmpty();
    }
}
