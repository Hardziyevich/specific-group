package com.github.akarazhev.jacademy.practice.designpatterns.factorymethod.factorymethod;

import com.github.akarazhev.jacademy.practice.designpatterns.factorymethod.builder.BoardBuilder;
import com.github.akarazhev.jacademy.practice.designpatterns.factorymethod.builder.BoardBuilderImpl;

public class PowerSupplyModule implements DemoBoard{
    @Override
    public BoardBuilder startWork() {
        return new BoardBuilderImpl().powerSupply().converter5VTo1V().converter12VTo5V().converter5VTo3V();
    }
}
