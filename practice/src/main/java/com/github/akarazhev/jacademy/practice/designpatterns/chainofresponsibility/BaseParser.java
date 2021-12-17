package com.github.akarazhev.jacademy.practice.designpatterns.chainofresponsibility;


import com.github.akarazhev.jacademy.practice.designpatterns.composite.TextComponent;

/**
 * Provides a pattern chain of responsibility which divide input text into paragraph, sentence, etc.
 */
public interface BaseParser {

    String TEXT_DELIMITER_REG = "\r\n";
    String PARAGRAPH_DELIMITER_REG = ".+?[.?!…](?=\\s|$)";
    String SENTENCE_DELIMITER_REG = " ";
    String WORD_DELIMITER_REG = "";
    String WORD_REG = "\\p{L}+";
    String EXPRESSION_REG = "[^\\p{L}]+";
    String LETTER_REG = "\\p{L}";
    String PUNCTUATION_REG = "\\p{Punct}";
    String VOWEL_REG = "[AEIOUaeiouАЕЁОУЫЭЮЯаиеёоуыэюя]";

    /**
     *
     * @param text input text
     * @return a part of text component
     */
    TextComponent parse(String text);
}
