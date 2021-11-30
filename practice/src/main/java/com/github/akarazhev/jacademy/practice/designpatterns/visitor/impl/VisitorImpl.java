package com.github.akarazhev.jacademy.practice.designpatterns.visitor.impl;

import com.github.akarazhev.jacademy.practice.designpatterns.visitor.Component;
import com.github.akarazhev.jacademy.practice.designpatterns.visitor.Visitor;

public class VisitorImpl implements Visitor {

    @Override
    public void parse(TextImpl component) {
        System.out.println("Parse TextImpl");
    }

    @Override
    public void parse(WordImpl component) {
        System.out.println("Parse WordImpl");
    }

    @Override
    public void parse(SentenceImpl component) {
        System.out.println("Parse SentenceImpl");
    }
}
