package com.github.akarazhev.jacademy.practice.designpatterns.state.impl;

import com.github.akarazhev.jacademy.practice.designpatterns.state.State;
import com.github.akarazhev.jacademy.practice.designpatterns.state.Interpret;

/**
 * Entity class which contains property of particular food.
 */
public class NutritionalValueImpl implements Interpret {

    private int fat;
    private int carb;
    private int protein;

    public int getFat() {
        return fat;
    }

    public int getCarb() {
        return carb;
    }

    public int getProtein() {
        return protein;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public void interpret(String property, String data) {
        fat = State.of(property).validation("fat"::equals).isCorrect() ? State.of(data).isInteger().parseInt(fat) : fat;
        carb = State.of(property).validation("carb"::equals).isCorrect() ? State.of(data).isInteger().parseInt(carb) : carb;
        protein = State.of(property).validation("protein"::equals).isCorrect() ? State.of(data).isInteger().parseInt(protein) : protein;
    }

}
