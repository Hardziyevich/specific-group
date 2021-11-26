package com.github.akarazhev.jacademy.practice.designpatterns.mediator.impl.entity;

import com.github.akarazhev.jacademy.practice.designpatterns.mediator.Module;

public class DisplayModuleImpl implements Module {

    private Module connectionModule;

    public DisplayModuleImpl(Module connectionModule){
        this.connectionModule = connectionModule;
    }
    @Override
    public void execute() {
        if(connectionModule instanceof HdmiModuleImpl)
            System.out.println("Transfer data into picture");
    }
}
