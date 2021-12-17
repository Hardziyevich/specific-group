package com.github.akarazhev.jacademy.practice.designpatterns.templatemethod;

/**
 * Represent a Template method patter.
 */
public abstract class Text {


    /**
     * Converting element from warehouse.
     * @return a string of converting element.
     */
    public abstract String converter();

    /**
     * Add element to warehouse.
     * @param s a string of element
     */
    public abstract void add(String s);

    /**
     * Common behavior of all classes. Showing all convert element from warehouse.
     */
    public void show() {
        System.out.println(converter());
    }
}
