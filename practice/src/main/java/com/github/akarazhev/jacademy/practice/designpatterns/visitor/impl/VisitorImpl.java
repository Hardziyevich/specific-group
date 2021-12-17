package com.github.akarazhev.jacademy.practice.designpatterns.visitor.impl;

import com.github.akarazhev.jacademy.practice.designpatterns.visitor.Visitor;

/**
 * {@inheritDoc}
 */
public class VisitorImpl implements Visitor {

    /**
     * {@inheritDoc}
     */
    @Override
    public void parse(TextImpl component) {
        System.out.println("Parse TextImpl");
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public void parse(WordImpl component) {
        System.out.println("Parse WordImpl");
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public void parse(SentenceImpl component) {
        System.out.println("Parse SentenceImpl");
    }

}
