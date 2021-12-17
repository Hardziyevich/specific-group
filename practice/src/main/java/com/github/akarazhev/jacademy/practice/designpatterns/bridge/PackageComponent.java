package com.github.akarazhev.jacademy.practice.designpatterns.bridge;


import java.util.List;
import java.util.Optional;

/**
 * Represent a pattern of bridge.
 */
public class PackageComponent {

    private final List<Component> list;

    /**
     * Initialization of a list component.
     * @param list a list of different component.
     */
    public PackageComponent(List<Component> list) {
        this.list = list;
    }

    /**
     * Provides the content of a component list.
     * @return a string content of a list.
     */
    public Optional<String> showPackage(){
        return list.stream().map(x-> x.getValue() + " ").reduce(String::concat);
    }

}
