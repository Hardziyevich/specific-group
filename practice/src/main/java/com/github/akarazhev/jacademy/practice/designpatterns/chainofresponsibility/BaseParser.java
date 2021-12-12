package com.github.akarazhev.jacademy.practice.designpatterns.chainofresponsibility;


import com.github.akarazhev.jacademy.practice.designpatterns.composite.TextComponent;

public interface BaseParser {
    String TEXT_DELIMITER_REG = "\r\n";
    String PARAGRAPH_DELIMITER_REG = ".+?[.?!…](?=\\s|$)";
    String SENTENCE_DELIMITER_REG = " ";
    String WORD_DELIMITER_REG = "";
    String WORD_REG = "\\p{L}+";
    String EXPRESSION_REG = "[^\\p{L}]+";
    String LETTER_REG = "\\p{L}";
    String DIGIT_REG = "\\d";
    String PUNCTUATION_REG = "\\p{Punct}";
    String VOWEL_REG = "[AEIOUaeiouАЕЁОУЫЭЮЯаиеёоуыэюя]";

    TextComponent parse(String text);
}
