package com.github.akarazhev.jacademy.practice.designpatterns.builder.builder;

import com.github.akarazhev.jacademy.practice.designpatterns.builder.DemoBoard;

/*Main interface which provide a combination of element configuration on the board*/
public interface BoardBuilder {
    BoardBuilder powerSupple();
    BoardBuilder processor();
    BoardBuilder hdmi();
    BoardBuilder usb();
    BoardBuilder sdi();
    BoardBuilder ddr();
    DemoBoard build();

    String getPowerSupple();
    String getProcessor();
    String getHdmi();
    String getUsb();
    String getSdi();
    String getDdr();
}
