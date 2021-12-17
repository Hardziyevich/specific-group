package com.github.akarazhev.jacademy.practice.designpatterns.abstractfactory.workerimpl;

import com.github.akarazhev.jacademy.practice.designpatterns.abstractfactory.ElectricalComponent;
import com.github.akarazhev.jacademy.practice.designpatterns.abstractfactory.Worker;
import com.github.akarazhev.jacademy.practice.designpatterns.abstractfactory.componentimpl.Microchip;

import java.util.Iterator;
import java.util.List;

/**
 * {@inheritDoc}
 */
public class PassiveElementWorker implements Worker {

    /**
     * {@inheritDoc}
     */
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
