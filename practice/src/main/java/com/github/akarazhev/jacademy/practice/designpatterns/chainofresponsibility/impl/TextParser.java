package com.github.akarazhev.jacademy.practice.designpatterns.chainofresponsibility.impl;

import com.github.akarazhev.jacademy.practice.designpatterns.chainofresponsibility.BaseParser;
import com.github.akarazhev.jacademy.practice.designpatterns.composite.TextComponent;
import com.github.akarazhev.jacademy.practice.designpatterns.composite.TextComposite;

import static com.github.akarazhev.jacademy.practice.designpatterns.composite.TextType.TEXT;

public class TextParser implements BaseParser {

    private static final TextParser instance = new TextParser();
    private final BaseParser textBaseParser = ParagraphParser.getInstance();

    private TextParser() {
    }

    public static TextParser getInstance() {
        return instance;
    }

    @Override
    public TextComponent parse(String text) {
        TextComponent textComponent = new TextComposite(TEXT);
        for (String paragraph : text.split(TEXT_DELIMITER_REG)) {
            textComponent.addText(textBaseParser.parse(paragraph));
        }
        return textComponent;
    }
}
