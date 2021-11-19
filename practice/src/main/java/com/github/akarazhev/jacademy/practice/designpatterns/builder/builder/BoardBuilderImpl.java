package com.github.akarazhev.jacademy.practice.designpatterns.builder.builder;

import com.github.akarazhev.jacademy.practice.designpatterns.builder.DemoBoard;
import com.github.akarazhev.jacademy.practice.designpatterns.builder.builder.BoardBuilder;

/*Class build particular realization of DemoBoard if we want to creat different realization
* we should creat new Builder or use Director*/
public class BoardBuilderImpl implements BoardBuilder {

    private String powerSupple;
    private String processor;
    private String hdmi;
    private String usb;
    private String sdi;
    private String ddr;

    @Override
    public BoardBuilder powerSupple() {
        this.powerSupple = "THN30";
        return this;
    }

    @Override
    public BoardBuilder processor() {
        this.processor = "ZYNQ7000";
        return this;
    }

    @Override
    public BoardBuilder hdmi() {
        this.hdmi = "HDMI - YES";
        return this;
    }

    @Override
    public BoardBuilder usb() {
        this.usb = "USB - YES";
        return this;
    }

    @Override
    public BoardBuilder sdi() {
        this.sdi = "SDI - YES";
        return this;
    }

    @Override
    public BoardBuilder ddr() {
        this.ddr = "DDR4";
        return this;
    }

    @Override
    public DemoBoard build() {
        DemoBoard demoBoard = new DemoBoard(this);
        return null;
    }

    public String getPowerSupple() {
        return powerSupple;
    }

    public String getProcessor() {
        return processor;
    }

    public String getHdmi() {
        return hdmi;
    }

    public String getUsb() {
        return usb;
    }

    public String getSdi() {
        return sdi;
    }

    public String getDdr() {
        return ddr;
    }
}
