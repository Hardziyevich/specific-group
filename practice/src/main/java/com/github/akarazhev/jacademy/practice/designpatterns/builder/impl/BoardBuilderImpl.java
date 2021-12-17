package com.github.akarazhev.jacademy.practice.designpatterns.builder.impl;

import com.github.akarazhev.jacademy.practice.designpatterns.builder.BoardBuilder;

/**
 * {@inheritDoc}
 */
public class BoardBuilderImpl implements BoardBuilder {

    private String powerSupple;
    private String processor;
    private String hdmi;
    private String usb;
    private String sdi;
    private String ddr;

    /**
     * {@inheritDoc}
     */
    @Override
    public BoardBuilder powerSupply() {
        this.powerSupple = "THN30";
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public BoardBuilder processor() {
        this.processor = "ZYNQ7000";
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public BoardBuilder hdmi() {
        this.hdmi = "HDMI - YES";
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public BoardBuilder usb() {
        this.usb = "USB - YES";
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public BoardBuilder sdi() {
        this.sdi = "SDI - YES";
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public BoardBuilder ddr() {
        this.ddr = "DDR4";
        return this;
    }

    public BoardBuilderImpl build() {
        return this;
    }

    /**
     * {@inheritDoc}
     */
    public String getPowerSupply() {
        return powerSupple;
    }

    /**
     * {@inheritDoc}
     */
    public String getProcessor() {
        return processor;
    }

    /**
     * {@inheritDoc}
     */
    public String getHdmi() {return hdmi;}

    /**
     * {@inheritDoc}
     */
    public String getUsb() {
        return usb;
    }

    /**
     * {@inheritDoc}
     */
    public String getSdi() {
        return sdi;
    }
    /**
     * {@inheritDoc}
     */
    public String getDdr() {
        return ddr;
    }

}
