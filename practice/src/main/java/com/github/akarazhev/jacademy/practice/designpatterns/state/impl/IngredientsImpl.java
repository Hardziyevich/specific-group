package com.github.akarazhev.jacademy.practice.designpatterns.state.impl;

import com.github.akarazhev.jacademy.practice.designpatterns.state.State;
import com.github.akarazhev.jacademy.practice.designpatterns.state.Interpret;

/**
 * Entity class which contains property of particular food.
 */
public class IngredientsImpl implements Interpret {

    private double water;
    private double sugar;
    private double fructose;
    private double vanilla;

    public double getWater() {
        return water;
    }

    public double getSugar() {
        return sugar;
    }

    public double getFructose() {
        return fructose;
    }

    public double getVanilla() {
        return vanilla;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public void interpret(String property, String data) {
        water = State.of(property).validation("water"::equals).isCorrect() ? State.of(data).isDouble().parseDouble(water) : water;
        sugar = State.of(property).validation("sugar"::equals).isCorrect() ? State.of(data).isDouble().parseDouble(sugar) : sugar;
        fructose = State.of(property).validation("fructose"::equals).isCorrect() ? State.of(data).isDouble().parseDouble(fructose) : fructose;
        vanilla = State.of(property).validation("vanilla"::equals).isCorrect() ? State.of(data).isDouble().parseDouble(vanilla) : vanilla;
    }

}
