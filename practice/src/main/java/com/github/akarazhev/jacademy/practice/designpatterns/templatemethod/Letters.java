package com.github.akarazhev.jacademy.practice.designpatterns.templatemethod;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Letters extends Text {
    private final List<Character> letters = new ArrayList<>();

    @Override
    public String converter() {
        StringBuilder sb = new StringBuilder();
        for (Character letter : letters) {
            sb.append("[").append(letter).append("]");
        }
        return sb.toString();
    }

    @Override
    public void add(String s) {
        char[] charsPrim = s.toCharArray();
        Character[] chars = new Character[charsPrim.length];
        for (int i = 0; i < chars.length; i++) {
            chars[i] = charsPrim[i];
        }
        letters.addAll(Arrays.asList(chars));
    }
}
