package com.github.akarazhev.jacademy.practice.designpatterns.adapter;

import java.util.ArrayList;
import java.util.List;

public class Company {
    private final List<Component> warehouseComponent = new ArrayList<>();
    private Entrepreneur entrepreneur;

    public Company(Entrepreneur entrepreneur){
        this.entrepreneur = entrepreneur;
    }

    public void purchaseComponent(){
        warehouseComponent.add(entrepreneur.sell());
    }

    public String makeDevice(){
        return warehouseComponent.stream().map(c -> c.getName()).reduce(String::concat).get();
    }
}
