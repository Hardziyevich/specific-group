package com.github.akarazhev.jacademy.practice.designpatterns.builder;

import com.github.akarazhev.jacademy.practice.designpatterns.builder.builder.BoardBuilder;
import com.github.akarazhev.jacademy.practice.designpatterns.builder.builder.BoardBuilderImpl;

import java.lang.reflect.Field;
import java.util.Optional;

/*It looks like motherboard in PC or specific board which needs to us*/
/*It is able to have different behavior depend on which module we involve*/
public class DemoBoard {

    private String powerSupple;
    private String processor;
    private String hdmi;
    private String usb;
    private String sdi;
    private String ddr;

    public DemoBoard(BoardBuilder boardBuilder) {
        this.powerSupple = boardBuilder.getPowerSupple();
        this.processor = boardBuilder.getProcessor();
        this.hdmi = boardBuilder.getHdmi();
        this.usb = boardBuilder.getUsb();
        this.sdi = boardBuilder.getSdi();
        this.ddr = boardBuilder.getDdr();
    }
    /*I use that method, just looking how builder works*/
    public void info(Class<? extends DemoBoard> dem){
        for (Field field : dem.getDeclaredFields()) {
            try {
                field.setAccessible(true);
                Object o = field.get(this);
                System.out.println(Optional.ofNullable(o).orElse(""));
            } catch (IllegalAccessException e) {
                e.printStackTrace();
            }
        }
    }
}

