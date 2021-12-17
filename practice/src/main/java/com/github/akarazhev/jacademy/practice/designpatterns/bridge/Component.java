package com.github.akarazhev.jacademy.practice.designpatterns.bridge;

/**
 * Provides a behaviour for all component.
 */
public interface Component {
    /**
     * Showing a type of component.
     *
     * @return a string of type.
     */
    String getType();

    /**
     * Showing a value of component.
     *
     * @return a string of value.
     */
    String getValue();

}
