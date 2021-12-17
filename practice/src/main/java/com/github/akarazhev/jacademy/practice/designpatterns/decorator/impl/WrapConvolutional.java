package com.github.akarazhev.jacademy.practice.designpatterns.decorator.impl;

import com.github.akarazhev.jacademy.practice.designpatterns.decorator.WrapData;

/**
 * {@inheritDoc}
 */
public class WrapConvolutional extends WrapDecorator {

    private final WrapData wrapData;

    public WrapConvolutional(WrapData wrapData) {
        this.wrapData = wrapData;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public String encodingData(String data) {
        return wrapData.encodingData(data) + getConv();
    }

    /**
     * Add a convolutional data encoding.
     * @return a string
     */
    public String getConv() {
        return "Conv";
    }

}
