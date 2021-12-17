package com.github.akarazhev.jacademy.practice.designpatterns.interpreter;


/**
 * Provides interface for interpret expression into digit.
 */
@FunctionalInterface
public interface Interpret {

    /**
     *
     * @param text input expression.
     * @return calculating int.
     */
    int interpret(String text);

}
