package com.github.akarazhev.jacademy.practice.designpatterns.chainofresponsibility.impl;


import com.github.akarazhev.jacademy.practice.designpatterns.chainofresponsibility.BaseParser;
import com.github.akarazhev.jacademy.practice.designpatterns.composite.TextComponent;
import com.github.akarazhev.jacademy.practice.designpatterns.composite.TextComposite;

import static com.github.akarazhev.jacademy.practice.designpatterns.composite.TextType.WORD;

public class WordParser implements BaseParser {

    private static final WordParser instance = new WordParser();
    private final BaseParser letterBaseParser = LetterParser.getInstance();

    private WordParser() {
    }

    public static WordParser getInstance() {
        return instance;
    }

    @Override
    public TextComponent parse(String text) {
        TextComponent word = new TextComposite(WORD);
        for (String letter : text.split(WORD_DELIMITER_REG)) {
            word.addText(letterBaseParser.parse(letter));
        }
        return word;
    }
}
