package com.github.akarazhev.jacademy.practice.designpatterns.abstractfactory;

import com.github.akarazhev.jacademy.practice.designpatterns.abstractfactory.workerimpl.ChipWorker;
import com.github.akarazhev.jacademy.practice.designpatterns.abstractfactory.workerimpl.PassiveElementWorker;

/**
 * Provides an opportunity create particular worker.
 */
public class AbstractFactory {

    /**
     * Return a worker which necessary.
     * @param typeElement a string represent type of worker
     * @return a worker
     */
    public static Worker startWorker(String typeElement){
        switch (typeElement) {
            case "chip": return new ChipWorker();
            case "passive": return new PassiveElementWorker();
            default:
                throw new IllegalArgumentException(typeElement + " not contained in Market");
        }
    }
}
