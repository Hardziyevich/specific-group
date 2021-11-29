package com.github.akarazhev.jacademy.practice.designpatterns.strategy;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

public class User {
    private Strategy strategy;
    private final List<String> warehouse = new ArrayList<>();

    public User(Strategy strategy) {
        this.strategy = strategy;
    }

    public void setStrategy(Strategy strategy) {
        this.strategy = strategy;
    }

    public void addWarehouse(String data) {
        warehouse.add(data);
    }

    public List<String> getWarehouse() {
        return warehouse.stream().filter(x -> strategy.filter(x)).collect(Collectors.toList());
    }
}
