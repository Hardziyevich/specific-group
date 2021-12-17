package com.github.akarazhev.jacademy.practice.designpatterns.facade;


import com.github.akarazhev.jacademy.practice.designpatterns.proxy.Document;

import java.util.concurrent.TimeUnit;

/**
 * {@inheritDoc}
 */
public class EngineerEmployeeImpl implements Employee{

    private boolean working = false;
    private final Document document;

    public EngineerEmployeeImpl(Document document) {
        this.document = document;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public void startWork() {
        develop();
        try {
            TimeUnit.MILLISECONDS.sleep(1000);
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
        document.addInfo("I finished sth developing");
        working = !document.isLoad();;
    }

    private void develop(){
        document.addInfo("I am starting sth developing");
        working = document.isLoad();
    }

}
