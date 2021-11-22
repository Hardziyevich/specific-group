package com.github.akarazhev.jacademy.practice.designpatterns.abstractfactory;

import com.github.akarazhev.jacademy.practice.designpatterns.abstractfactory.Component.ElectricalComponent;

import java.util.List;

public interface Master {
    boolean placeOnBoard(List<ElectricalComponent> components) throws Exception;
}
