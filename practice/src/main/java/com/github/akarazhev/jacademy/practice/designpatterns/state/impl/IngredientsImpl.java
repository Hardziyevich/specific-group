package com.github.akarazhev.jacademy.practice.designpatterns.state.impl;

import com.github.akarazhev.jacademy.practice.designpatterns.state.Interpreter;
import com.github.akarazhev.jacademy.practice.designpatterns.state.PropertyFood;

public class IngredientsImpl implements PropertyFood {
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

    @Override
    public void execute(String property, String data) {
        water = Interpreter.of(property).state("water"::equals).isCorrect() ? Interpreter.of(data).isDouble().parseDouble(water) : water;
        sugar = Interpreter.of(property).state("sugar"::equals).isCorrect() ? Interpreter.of(data).isDouble().parseDouble(sugar) : sugar;
        fructose = Interpreter.of(property).state("fructose"::equals).isCorrect() ? Interpreter.of(data).isDouble().parseDouble(fructose) : fructose;
        vanilla = Interpreter.of(property).state("vanilla"::equals).isCorrect() ? Interpreter.of(data).isDouble().parseDouble(vanilla) : vanilla;
    }
}
