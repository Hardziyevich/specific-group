package com.github.akarazhev.jacademy.practice.designpatterns.command.impl;

import com.github.akarazhev.jacademy.practice.designpatterns.command.Task;

public class TestTaskImpl implements Task {
    @Override
    public String execute() {
        return "tested";
    }
}
