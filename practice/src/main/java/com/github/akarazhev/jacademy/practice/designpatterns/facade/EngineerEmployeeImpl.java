package com.github.akarazhev.jacademy.practice.designpatterns.facade;

import com.github.akarazhev.jacademy.practice.designpatterns.facade.proxy.Document;

public class EngineerEmployeeImpl implements Employee{

    private boolean working = false;

    private final Document document;

    public EngineerEmployeeImpl(Document document) {
        this.document = document;
    }

    @Override
    public void Work() {
        develop();
        try {
            Thread.sleep(1000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        finishWork();
    }

    private void finishWork() {
        document.addInfo("I finished sth developing");
        working = !document.isLoad();;
    }

    @Override
    public boolean isWorking() {
        return working;
    }

    private void develop(){
        document.addInfo("I am starting sth developing");
        working = document.isLoad();
    }
}
