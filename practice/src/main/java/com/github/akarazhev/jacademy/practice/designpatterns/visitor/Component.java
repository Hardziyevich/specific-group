package com.github.akarazhev.jacademy.practice.designpatterns.visitor;

/**
 * Provides behaviour for class which implement that interface.
 */
public interface Component {

    /**
     * Visitor changes a behaviour depend on class where that method execute.
     * @param visitor a visitor of component
     */
    void execute(Visitor visitor);

}
