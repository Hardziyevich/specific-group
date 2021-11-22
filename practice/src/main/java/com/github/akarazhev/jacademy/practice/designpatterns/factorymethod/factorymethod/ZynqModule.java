package com.github.akarazhev.jacademy.practice.designpatterns.factorymethod.factorymethod;

import com.github.akarazhev.jacademy.practice.designpatterns.factorymethod.builder.BoardBuilder;
import com.github.akarazhev.jacademy.practice.designpatterns.factorymethod.builder.BoardBuilderImpl;

public class ZynqModule implements DemoBoard {

    @Override
    public BoardBuilder startWork() {
        return new BoardBuilderImpl().powerSupply().processor();
    }
}
