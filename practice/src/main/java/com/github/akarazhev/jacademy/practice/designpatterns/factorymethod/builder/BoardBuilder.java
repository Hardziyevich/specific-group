package com.github.akarazhev.jacademy.practice.designpatterns.factorymethod.builder;

import com.github.akarazhev.jacademy.practice.designpatterns.builder.DemoBoard;

import java.util.List;

/*Main interface which provide a combination of element configuration on the board*/
public interface BoardBuilder {
    BoardBuilder powerSupply();
    BoardBuilder processor();
    BoardBuilder hdmi();
    BoardBuilder usb();
    BoardBuilder sdi();
    BoardBuilder ddr();
    BoardBuilder ethernet();
    BoardBuilder converter12VTo5V();
    BoardBuilder converter5VTo1V();
    BoardBuilder converter5VTo3V();

    String getPowerSupply();
    String getProcessor();
    String getHdmi();
    String getUsb();
    String getSdi();
    String getDdr();
    String getEthernet();
    List<String> getSupply();
}
