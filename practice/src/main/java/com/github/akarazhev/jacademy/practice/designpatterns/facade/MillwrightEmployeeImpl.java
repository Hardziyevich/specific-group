package com.github.akarazhev.jacademy.practice.designpatterns.facade;

import com.github.akarazhev.jacademy.practice.designpatterns.facade.proxy.Document;

public class MillwrightEmployeeImpl implements Employee{

    private boolean working = false;

    private final Document document;

    public MillwrightEmployeeImpl(Document document) {
        this.document = document;
    }

    @Override
    public void Work() {
        toDoSth();
        try {
            Thread.sleep(1000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        finishWork();
    }

    private void finishWork() {
        document.addInfo("I finished sth doing");
        working = !document.isLoad();
    }

    @Override
    public boolean isWorking() {
        return working;
    }

    private void toDoSth(){
        document.addInfo("I`m doing sth");
        working = document.isLoad();
    }
}
