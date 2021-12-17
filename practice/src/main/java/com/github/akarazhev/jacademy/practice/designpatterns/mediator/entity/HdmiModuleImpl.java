package com.github.akarazhev.jacademy.practice.designpatterns.mediator.entity;

import com.github.akarazhev.jacademy.practice.designpatterns.mediator.Module;

/**
 * {@inheritDoc}
 */
public class HdmiModuleImpl implements Module {

    private final Module connectionModule;

    public HdmiModuleImpl(Module connectionModule) {
        this.connectionModule = connectionModule;
    }

    /**
     * {@inheritDoc}
     */
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
