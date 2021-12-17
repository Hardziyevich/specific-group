package com.github.akarazhev.jacademy.practice.designpatterns.decorator.impl;

import com.github.akarazhev.jacademy.practice.designpatterns.decorator.WrapData;

/**
 * Main class for decorator pattern. Provides main behaviour for data encoding.
 */
public class WrapDecorator implements WrapData {

    /**
     * {@inheritDoc}
     */
    @Override
    public String encodingData(String data) {
        return data + "wrapper";
    }

}
