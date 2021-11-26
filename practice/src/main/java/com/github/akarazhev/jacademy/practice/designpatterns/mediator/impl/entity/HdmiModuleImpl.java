package com.github.akarazhev.jacademy.practice.designpatterns.mediator.impl.entity;

import com.github.akarazhev.jacademy.practice.designpatterns.mediator.Module;

public class HdmiModuleImpl implements Module {
    private Module connectionModule;

    public HdmiModuleImpl(Module connectionModule) {
        this.connectionModule = connectionModule;
    }

    @Override
    public void execute() {
        if(connectionModule instanceof HdmiModuleImpl){
            System.out.println("Transmit information to Monitor");
        }
        else if(connectionModule instanceof EthernetModuleImpl){
            System.out.println("Receive data from Ethernet");
        }
    }
}
