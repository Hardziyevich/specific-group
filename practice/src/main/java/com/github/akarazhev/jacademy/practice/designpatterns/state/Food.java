package com.github.akarazhev.jacademy.practice.designpatterns.state;

import java.util.ArrayList;
import java.util.List;
import java.util.function.Predicate;

public class Food {
    private PropertyFood property;

    public void addProperty(PropertyFood property) {
        this.property = property;
    }

    public PropertyFood getProperties(){
        return property;
    }

    public void execute(String property, String data) {
        this.property.execute(property, data);
    }
}
