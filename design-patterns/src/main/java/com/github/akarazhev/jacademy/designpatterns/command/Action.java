package com.github.akarazhev.jacademy.designpatterns.command;

/**
 * Provides specification for an action.
 */
public interface Action {
    /**
     * Executes an action.
     *
     * @return the result.
     */
    int execute();
}