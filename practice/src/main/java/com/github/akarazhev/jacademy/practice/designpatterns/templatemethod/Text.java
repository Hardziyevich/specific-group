package com.github.akarazhev.jacademy.practice.designpatterns.templatemethod;

import java.util.Arrays;
import java.util.Collection;
import java.util.List;

public abstract class Text {

    public abstract String converter();
    public abstract void add(String s);

    public void show() {
        System.out.println(converter());
    }
}
