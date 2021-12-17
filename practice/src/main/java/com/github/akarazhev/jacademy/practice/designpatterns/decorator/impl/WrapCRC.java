package com.github.akarazhev.jacademy.practice.designpatterns.decorator.impl;

import com.github.akarazhev.jacademy.practice.designpatterns.decorator.WrapData;

/**
 * {@inheritDoc}
 */
public class WrapCRC extends WrapDecorator {

    private final WrapData wrapData;

    public WrapCRC(WrapData wrapData) {
        this.wrapData = wrapData;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public String encodingData(String data) {
        return wrapData.encodingData(data) + getCRC();
    }

    /**
     * Add a CRC data encoding.
     * @return a string
     */
    public String getCRC() {
        return "CRC";
    }

}
