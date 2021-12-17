package com.github.akarazhev.jacademy.practice.designpatterns.chainofresponsibility.impl;


import com.github.akarazhev.jacademy.practice.designpatterns.chainofresponsibility.BaseParser;
import com.github.akarazhev.jacademy.practice.designpatterns.composite.Symbol;
import com.github.akarazhev.jacademy.practice.designpatterns.composite.TextComponent;
import com.github.akarazhev.jacademy.practice.designpatterns.composite.TextComposite;
import com.github.akarazhev.jacademy.practice.designpatterns.composite.TextType;

import static com.github.akarazhev.jacademy.practice.designpatterns.composite.TextType.PUNCTUATION;

/**
 * {@inheritDoc}
 */
public class SentenceParser implements BaseParser {

    private static final SentenceParser instance = new SentenceParser();

    private SentenceParser() {
    }

    public static SentenceParser getInstance() {
        return instance;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public TextComponent parse(String text) {
        TextComponent sentence = new TextComposite(TextType.SENTENCE);
        BaseParser sentenceBaseParser;
        for (String word : text.split(SENTENCE_DELIMITER_REG)) {
            if (word.matches(LETTER_REG)) {
                sentenceBaseParser = LetterParser.getInstance();
                sentence.addText(sentenceBaseParser.parse(word));
            } else if (word.matches(WORD_REG)) {
                sentenceBaseParser = WordParser.getInstance();
                sentence.addText(sentenceBaseParser.parse(word));
            } else if (word.matches(PUNCTUATION_REG)) {
                sentence.addText(new Symbol(PUNCTUATION, word.charAt(0)));
            } else if (word.matches(EXPRESSION_REG)) {
                sentenceBaseParser = ExpressionParser.getInstance();
                sentence.addText(sentenceBaseParser.parse(word));
            } else {
                sentenceBaseParser = LexemeParser.getInstance();
                sentence.addText(sentenceBaseParser.parse(word));
            }
        }
        return sentence;
    }

}
