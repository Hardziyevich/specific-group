package com.github.akarazhev.jacademy.practice.designpatterns.chainofresponsibility.impl;


import com.github.akarazhev.jacademy.practice.designpatterns.chainofresponsibility.BaseParser;
import com.github.akarazhev.jacademy.practice.designpatterns.composite.Symbol;
import com.github.akarazhev.jacademy.practice.designpatterns.composite.TextComponent;
import com.github.akarazhev.jacademy.practice.designpatterns.composite.TextComposite;
import com.github.akarazhev.jacademy.practice.designpatterns.composite.TextType;

import static com.github.akarazhev.jacademy.practice.designpatterns.composite.TextType.*;

/**
 * {@inheritDoc}
 */
public class LetterParser implements BaseParser {

    private static final LetterParser instance = new LetterParser();

    private LetterParser() {
    }

    public static LetterParser getInstance() {
        return instance;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public TextComponent parse(String text) {
        TextComponent textComponent = new TextComposite(LETTER);
        TextType letterType = text.matches(VOWEL_REG) ? VOWEL : CONSONANT;
        textComponent.addText(new Symbol(letterType, text.charAt(0)));
        return textComponent;
    }

}
