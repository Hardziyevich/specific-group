package com.github.akarazhev.jacademy.practice.designpatterns.adapter;

import java.util.ArrayList;
import java.util.List;

/**
 * A company that buys components from an entrepreneur.
 */
public class Company {

    private final List<Component> warehouseComponent;
    private final Entrepreneur entrepreneur;

    /**
     * Constructor provides an opportunity conversation with entrepreneur
     *
     * @param entrepreneur an entrepreneur
     */
    public Company(Entrepreneur entrepreneur) {
        this.entrepreneur = entrepreneur;
        warehouseComponent = new ArrayList<>();
    }

    /**
     * Purchase component and add him to warehouse.
     */
    public void purchaseComponent() {
        warehouseComponent.add(entrepreneur.sell());
    }

    /**
     * Makes a device from components
     *
     * @return a string of device
     */
    public String makeDevice() {
        return warehouseComponent.stream().map(Component::getName).reduce(String::concat).get();
    }
}
