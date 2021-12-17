package com.github.akarazhev.jacademy.practice.designpatterns.observer.impl;

import com.github.akarazhev.jacademy.practice.designpatterns.observer.DBShape;
import com.github.akarazhev.jacademy.practice.designpatterns.observer.Observer;
import com.github.akarazhev.jacademy.practice.designpatterns.observer.ShapeEvent;
import com.github.akarazhev.jacademy.practice.designpatterns.observer.entity.Shape;

/**
 * {@inheritDoc}
 */
public class ShapeObserver implements Observer {

    /**
     * {@inheritDoc}
     */
    @Override
    public void update(ShapeEvent data) {
        Shape shape = data.getSource();
        DBShape dbShape = DBShape.getInstance();
        dbShape.setBd(shape.getId(),shape);
    }

}
