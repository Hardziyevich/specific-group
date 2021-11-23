package com.github.akarazhev.jacademy.practice.designpatterns.observer;

import com.github.akarazhev.jacademy.practice.designpatterns.observer.entity.Shape;

import java.util.EventObject;

public class ShapeEvent extends EventObject {
    /**
     * Constructs a prototypical Event.
     *
     * @param shape the object on which the Event initially occurred
     * @throws IllegalArgumentException if source is null
     */
    public ShapeEvent(Shape shape) {
        super(shape);
    }

    @Override
    public Shape getSource() {
        return (Shape) super.getSource();
    }

}
