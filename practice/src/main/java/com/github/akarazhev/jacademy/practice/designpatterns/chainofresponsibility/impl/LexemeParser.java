package com.github.akarazhev.jacademy.practice.designpatterns.chainofresponsibility.impl;


import com.github.akarazhev.jacademy.practice.designpatterns.chainofresponsibility.BaseParser;
import com.github.akarazhev.jacademy.practice.designpatterns.composite.Symbol;
import com.github.akarazhev.jacademy.practice.designpatterns.composite.TextComponent;
import com.github.akarazhev.jacademy.practice.designpatterns.composite.TextComposite;
import com.github.akarazhev.jacademy.practice.designpatterns.composite.TextType;

import static com.github.akarazhev.jacademy.practice.designpatterns.composite.TextType.LEXEME;

/**
 * {@inheritDoc}
 */
public class LexemeParser implements BaseParser {

    private static final LexemeParser instance = new LexemeParser();
    private final BaseParser baseParser = LetterParser.getInstance();

    private LexemeParser() {
    }

    public static LexemeParser getInstance() {
        return instance;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public TextComponent parse(String text) {
        TextComponent textComponent = new TextComposite(LEXEME);
        for (String lexeme : text.split(WORD_DELIMITER_REG)) {
            if (lexeme.matches(LETTER_REG)) {
                textComponent.addText(baseParser.parse(lexeme));
            } else {
                textComponent.addText(new Symbol(TextType.PUNCTUATION, lexeme.charAt(0)));
            }
        }
        return textComponent;
    }

}
