package com.github.akarazhev.jacademy.practice.designpatterns.state;

import java.util.ArrayList;
import java.util.List;
import java.util.function.Predicate;


public class Interpreter {

    private boolean stateNull = false;
    private final String object;
    private final List<Boolean> state = new ArrayList<>();
    private static final String REG_INT = "\\d+";
    private static final String REG_DOUBLE = "^\\d+[.]?\\d+";

    public Interpreter(String object) {
        if(object == null) {
            stateNull = true;
            state.add(false);
        }
        this.object = object;
    }

    public static Interpreter of(String object) {
        return new Interpreter(object);
    }

    public Interpreter state(Predicate<String> predicate) {
        if(!stateNull) {
            state.add(predicate.test(object));
        }
        return this;
    }

    public boolean isCorrect() {
        return state.stream().allMatch(x -> x == Boolean.TRUE);
    }

    public Interpreter isInteger() {
        if(!stateNull) {
            state.add(object.matches(REG_INT));
        }
        return this;
    }

    public Interpreter isDouble() {
        if(!stateNull) {
            state.add(object.matches(REG_DOUBLE));
        }
        return this;
    }

    public int parseInt(int data) {
        return isCorrect() ? Integer.parseInt(object) : data;
    }

    public double parseDouble(double data) {
        return isCorrect() ? Double.parseDouble(object) : data;
    }

}
