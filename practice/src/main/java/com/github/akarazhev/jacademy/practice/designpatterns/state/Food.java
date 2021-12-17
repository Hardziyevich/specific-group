package com.github.akarazhev.jacademy.practice.designpatterns.state;

/**
 * Entity class which contains property of particular food.
 */
public class Food {

    private Interpret property;

    public void addProperty(Interpret property) {
        this.property = property;
    }

    public Interpret getProperties(){
        return property;
    }

    public void execute(String property, String data) {
        this.property.interpret(property, data);
    }
}
