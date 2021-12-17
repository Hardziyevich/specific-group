package com.github.akarazhev.jacademy.practice.designpatterns.prototype;

/**
 * Provides a copy of document.
 */
public class Document implements Cloneable {

    private final String text;

    public Document(String text) {
        this.text = text;
    }

    /**
     * Getting text.
     * @return a string of text.
     */
    public String getText() {
        return text;
    }

    @Override
    public Document clone(){
        try {
            return (Document) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new RuntimeException(e);
        }
    }

}
