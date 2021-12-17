package com.github.akarazhev.jacademy.practice.designpatterns.mediator.entity;

import com.github.akarazhev.jacademy.practice.designpatterns.mediator.Module;

/**
 * {@inheritDoc}
 */
public class EthernetModuleImpl implements Module {

    private final Module connectionModule;

    public EthernetModuleImpl(Module connectionModule) {
        this.connectionModule = connectionModule;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public void execute() {
        if(connectionModule instanceof HdmiModuleImpl){
            System.out.println("Transmit data to HDMI");
        }
    }

}
