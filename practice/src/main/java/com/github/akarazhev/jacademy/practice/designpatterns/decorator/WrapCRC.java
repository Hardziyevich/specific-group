package com.github.akarazhev.jacademy.practice.designpatterns.decorator;

public class WrapCRC extends WrapDecorator {
    public WrapCRC(WrapData wrapData) {
        super(wrapData);
    }

    @Override
    public String encodingData(String data) {
        return super.encodingData(data) + getCRC();
    }

    public String getCRC() {
        return "CRC";
    }
}
