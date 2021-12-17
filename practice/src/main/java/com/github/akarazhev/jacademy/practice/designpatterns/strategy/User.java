package com.github.akarazhev.jacademy.practice.designpatterns.strategy;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

/**
 * Warehouse which contains information about user.
 */
public class User {

    private Strategy strategy;
    private final List<String> warehouse = new ArrayList<>();

    /**
     * Initialization default strategy.
     *
     * @param strategy a strategy type.
     */
    public User(Strategy strategy) {
        this.strategy = strategy;
    }

    /**
     * Setting strategy.
     *
     * @param strategy a strategy type.
     */
    public void setStrategy(Strategy strategy) {
        this.strategy = strategy;
    }

    /**
     * Add an information about user to warehouse.
     * @param data a string of data.
     */
    public void addWarehouse(String data) {
        warehouse.add(data);
    }

    /**
     * Showing list of information depends on strategy.
     * @return a list of string.
     */
    public List<String> getWarehouse() {
        return warehouse.stream().filter(x -> strategy.filter(x)).collect(Collectors.toList());
    }

}
