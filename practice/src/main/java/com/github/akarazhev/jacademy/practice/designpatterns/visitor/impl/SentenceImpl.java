package com.github.akarazhev.jacademy.practice.designpatterns.visitor.impl;

import com.github.akarazhev.jacademy.practice.designpatterns.visitor.Component;
import com.github.akarazhev.jacademy.practice.designpatterns.visitor.Visitor;

public class SentenceImpl implements Component {
    @Override
    public void execute(Visitor visitor) {
        System.out.print("SentenceImpl: ");
        visitor.parse(this);
    }
}
