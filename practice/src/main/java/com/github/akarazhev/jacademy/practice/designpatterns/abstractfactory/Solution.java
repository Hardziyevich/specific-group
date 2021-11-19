package com.github.akarazhev.jacademy.practice.designpatterns.abstractfactory;

import com.github.akarazhev.jacademy.practice.designpatterns.abstractfactory.Component.ElectricalComponent;

public class Solution {
    public static void main(String[] args) {
        ElectricalComponent component = AbstractFactory.getComponent(AbstractFactory.DIODE);
        component.showElement();
    }
}
