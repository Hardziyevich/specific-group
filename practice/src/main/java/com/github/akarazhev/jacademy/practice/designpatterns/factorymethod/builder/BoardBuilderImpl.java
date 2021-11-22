package com.github.akarazhev.jacademy.practice.designpatterns.factorymethod.builder;

import java.util.ArrayList;
import java.util.List;

/*Class build particular realization of DemoBoard if we want to creat different realization
* we should creat new Builder or use Director*/
public class BoardBuilderImpl implements BoardBuilder {

    private String powerSupply;
    private String processor;
    private String hdmi;
    private String usb;
    private String sdi;
    private String ddr;
    private String ethernet;
    private List<String> supply = new ArrayList<>();

    @Override
    public BoardBuilder powerSupply() {
        this.powerSupply = "THN30";
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
    public BoardBuilder ethernet() {
        this.ethernet = "Ethernet - YES";
        return this;
    }

    @Override
    public BoardBuilder converter12VTo5V() {
        supply.add("Converter 12V to 5V");
        return this;
    }

    @Override
    public BoardBuilder converter5VTo1V() {
        supply.add("Converter 5V to 1V");
        return this;
    }

    @Override
    public BoardBuilder converter5VTo3V() {
        supply.add("Converter 5V to 3V");
        return this;
    }

    public String getPowerSupply() {
        return powerSupply;
    }

    public String getProcessor() {
        return processor;
    }

    public String getHdmi() {return hdmi;}

    public String getUsb() {
        return usb;
    }

    public String getSdi() {
        return sdi;
    }

    public String getDdr() {
        return ddr;
    }

    public String getEthernet() { return ethernet; }

    public List<String> getSupply() { return supply; }
}
