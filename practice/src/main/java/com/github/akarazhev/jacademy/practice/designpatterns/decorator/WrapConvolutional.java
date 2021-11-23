package com.github.akarazhev.jacademy.practice.designpatterns.decorator;

public class WrapConvolutional extends WrapDecorator {
    public WrapConvolutional(WrapData wrapData) {
        super(wrapData);
    }

    @Override
    public String encodingData(String data) {
        return super.encodingData(data) + getConv();
    }

    public String getConv() {
        return "Conv";
    }
}
