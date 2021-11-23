package com.github.akarazhev.jacademy.practice.designpatterns.decorator;

public class WrapDecorator implements WrapData {

    private WrapData wrapData;

    public WrapDecorator(WrapData wrapData) {
        this.wrapData = wrapData;
    }

    @Override
    public String encodingData(String data) {
        return wrapData.encodingData(data);
    }
}
