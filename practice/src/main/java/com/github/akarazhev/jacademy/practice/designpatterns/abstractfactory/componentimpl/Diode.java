package com.github.akarazhev.jacademy.practice.designpatterns.abstractfactory.componentimpl;

import com.github.akarazhev.jacademy.practice.designpatterns.abstractfactory.ElectricalComponent;

/**
 * {@inheritDoc}
 */
public class Diode implements ElectricalComponent {

    /**
     * {@inheritDoc}
     */
    @Override
    public String getElement() {
        return "Diode";
    }

}
