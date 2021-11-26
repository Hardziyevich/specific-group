package com.github.akarazhev.jacademy.practice.designpatterns.mediator.impl.entity;

import com.github.akarazhev.jacademy.practice.designpatterns.mediator.Module;

public class EthernetModuleImpl implements Module {
    private Module connectionModule;

    public EthernetModuleImpl(Module connectionModule) {
        this.connectionModule = connectionModule;
    }

    @Override
    public void execute() {
        if(connectionModule instanceof HdmiModuleImpl){
            System.out.println("Transmit data to HDMI");
        }
    }
}
