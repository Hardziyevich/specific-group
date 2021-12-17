package com.github.akarazhev.jacademy.practice.designpatterns.observer;

/**
 * Called when somewhere happening changed.
 */
public interface Observer{

    /**
     * Updating ShapeEvent.
     * @param data a ShapeEvent of data.
     */
    void update (final ShapeEvent data);

}
