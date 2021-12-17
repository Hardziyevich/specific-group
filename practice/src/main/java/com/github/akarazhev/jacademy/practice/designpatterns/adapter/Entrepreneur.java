package com.github.akarazhev.jacademy.practice.designpatterns.adapter;

/**
 * Provides a behaviour for entrepreneur.
 */
public interface Entrepreneur {

    /**
     * Return a component which will be sold.
     *
     * @return a component of the entrepreneur.
     */
    Component sell();

    /**
     * Obtaining a component which will be bought.
     *
     * @param component a component doesn`t belong of the entrepreneur.
     */
    void buy(Component component);
}
