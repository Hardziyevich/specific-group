package com.github.akarazhev.jacademy.practice.designpatterns.command.impl;

import com.github.akarazhev.jacademy.practice.designpatterns.command.Task;

/**
 * {@inheritDoc}
 */
public class TestTaskImpl implements Task {

    /**
     * {@inheritDoc}
     */
    @Override
    public String execute() {
        return "tested";
    }

}
