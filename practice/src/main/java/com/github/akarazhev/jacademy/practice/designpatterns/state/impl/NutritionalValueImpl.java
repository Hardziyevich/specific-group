package com.github.akarazhev.jacademy.practice.designpatterns.state.impl;

import com.github.akarazhev.jacademy.practice.designpatterns.state.Interpreter;
import com.github.akarazhev.jacademy.practice.designpatterns.state.PropertyFood;

public class NutritionalValueImpl implements PropertyFood {
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

    @Override
    public void execute(String property, String data) {
        fat = Interpreter.of(property).state("fat"::equals).isCorrect() ? Interpreter.of(data).isInteger().parseInt(fat) : fat;
        carb = Interpreter.of(property).state("carb"::equals).isCorrect() ? Interpreter.of(data).isInteger().parseInt(carb) : carb;
        protein = Interpreter.of(property).state("protein"::equals).isCorrect() ? Interpreter.of(data).isInteger().parseInt(protein) : protein;
    }
}
