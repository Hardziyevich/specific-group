package com.github.akarazhev.jacademy.practice.designpatterns.strategy;


/**
 * Represent a different filtering behaviour.
 */
@FunctionalInterface
public interface Strategy {

    /**
     * Filtering data depend on input data.
     * @param data a string of data.
     * @return a boolean of state.
     */
    boolean filter(String data);

}
