package com.github.akarazhev.jacademy.practice.designpatterns.templatemethod;

import java.util.ArrayList;
import java.util.List;
import java.util.Objects;

public class Words extends Text {
    private List<String> words = new ArrayList<>();


    @Override
    public String converter() {
        return words.stream()
                .reduce((x, y) -> x + ", " + y).get();
    }

    @Override
    public void add(String s) {
        words.add(s);
    }
}
