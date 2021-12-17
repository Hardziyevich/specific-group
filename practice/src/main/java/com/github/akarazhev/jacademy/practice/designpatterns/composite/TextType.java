package com.github.akarazhev.jacademy.practice.designpatterns.composite;

/**
 * Represent a type of composite component.
 */
public enum TextType {

    TEXT("\r\n"),
    PARAGRAPH(""),
    SENTENCE(" "),
    LEXEME(""),
    WORD(""),
    EXPRESSION(""),
    LETTER(""),
    PUNCTUATION(""),
    DIGIT(""),
    CONSONANT(""),
    VOWEL("");

    private final String postfix;

    /**
     * Initialization postfix for further collection of elements.
     * @param postfix regular expression for collection.
     */
    TextType(String postfix) {
        this.postfix = postfix;
    }

    /**
     * Getting postfix for collection of element.
     * @return a string of a postfix.
     */
    public String getPostfix() {
        return postfix;
    }

}
