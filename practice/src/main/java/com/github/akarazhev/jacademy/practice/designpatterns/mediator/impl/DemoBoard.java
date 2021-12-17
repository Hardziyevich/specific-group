package com.github.akarazhev.jacademy.practice.designpatterns.mediator.impl;

import com.github.akarazhev.jacademy.practice.designpatterns.mediator.Board;
import com.github.akarazhev.jacademy.practice.designpatterns.mediator.Module;

import java.util.ArrayList;
import java.util.List;

/**
 * {@inheritDoc}
 */
public class DemoBoard implements Board {

    private final List<Module> modules;

    public DemoBoard(List<Module> modules) {
        this.modules = modules;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public void startWork() {
        System.out.println("Start working");
        modules.forEach(Module::execute);
        finishWork();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public void finishWork() {
        System.out.println("Stop working");
    }

}
