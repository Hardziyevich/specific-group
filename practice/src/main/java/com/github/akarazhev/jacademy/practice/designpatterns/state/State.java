package com.github.akarazhev.jacademy.practice.designpatterns.state;

import java.util.ArrayList;
import java.util.List;
import java.util.function.Predicate;

/**
 * Collects object states.
 */
public class State {

    private boolean stateNull = false;
    private final String object;
    private final List<Boolean> state = new ArrayList<>();
    private static final String REG_INT = "\\d+";
    private static final String REG_DOUBLE = "^\\d+[.]?\\d+";

    private State(String object) {
        if(object == null) {
            stateNull = true;
            state.add(false);
        }
        this.object = object;
    }

    /**
     * Initialization of state.
     * @param object a string of object
     * @return a state.
     */
    public static State of(String object) {
        return new State(object);
    }

    /**
     * Validation object depends on predicate.
     * @param predicate a predicate of object.
     * @return a state.
     */
    public State validation(Predicate<String> predicate) {
        if(!stateNull) {
            state.add(predicate.test(object));
        }
        return this;
    }

    /**
     * Checks if the object is valid
     * @return a boolean state.
     */
    public boolean isCorrect() {
        return state.stream().allMatch(x -> x == Boolean.TRUE);
    }

    /**
     * Checks if the object is integer
     * @return a boolean state.
     */
    public State isInteger() {
        if(!stateNull) {
            state.add(object.matches(REG_INT));
        }
        return this;
    }

    /**
     * Checks if the object is valid
     * @return a boolean state.
     */
    public State isDouble() {
        if(!stateNull) {
            state.add(object.matches(REG_DOUBLE));
        }
        return this;
    }

    /**
     * Parsing string into int
     * @param data used if object validation failed.
     * @return a int of data.
     */
    public int parseInt(int data) {
        return isCorrect() ? Integer.parseInt(object) : data;
    }

    /**
     * Parsing string into double
     * @param data used if object validation failed.
     * @return a double of data.
     */
    public double parseDouble(double data) {
        return isCorrect() ? Double.parseDouble(object) : data;
    }

}
