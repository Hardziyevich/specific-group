package com.github.akarazhev.jacademy.practice.designpatterns.visitor.impl;

import com.github.akarazhev.jacademy.practice.designpatterns.visitor.Component;
import com.github.akarazhev.jacademy.practice.designpatterns.visitor.Visitor;

/**
 * {@inheritDoc}
 */
public class WordImpl implements Component {

    /**
     * {@inheritDoc}
     */
    @Override
    public void execute(Visitor visitor) {
        System.out.print("WordImpl: ");
        visitor.parse(this);
    }
    
}
