package com.github.akarazhev.jacademy.practice.designpatterns.facade;

import com.github.akarazhev.jacademy.practice.designpatterns.proxy.Document;

/**
 * {@inheritDoc}
 */
public class MillwrightEmployeeImpl implements Employee{

    private boolean working = false;
    private final Document document;

    public MillwrightEmployeeImpl(Document document) {
        this.document = document;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public void startWork() {
        toDoSth();
        try {
            Thread.sleep(1000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        finishWork();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public boolean isWorking() {
        return working;
    }

    private void finishWork() {
        document.addInfo("I finished sth doing");
        working = !document.isLoad();
    }

    private void toDoSth(){
        document.addInfo("I`m doing sth");
        working = document.isLoad();
    }

}
