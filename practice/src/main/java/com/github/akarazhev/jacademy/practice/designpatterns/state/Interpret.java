package com.github.akarazhev.jacademy.practice.designpatterns.state;

/**
 * Interpret property with value into field of class.
 */
@FunctionalInterface
public interface Interpret {

    /**
     * Interpret property with value into field of class.
     */
    void interpret(String property, String value);

}
