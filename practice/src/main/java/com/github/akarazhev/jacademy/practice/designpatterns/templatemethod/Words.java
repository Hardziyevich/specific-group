package com.github.akarazhev.jacademy.practice.designpatterns.templatemethod;

import java.util.ArrayList;
import java.util.List;
import java.util.Objects;

/**
 * {@inheritDoc}
 */
public class Words extends Text {

    private final List<String> words = new ArrayList<>();

    /**
     * {@inheritDoc}
     */
    @Override
    public String converter() {
        return words.stream()
                .reduce((x, y) -> x + ", " + y).get();
    }
    /**
     * {@inheritDoc}
     */
    @Override
    public void add(String s) {
        words.add(s);
    }

}
