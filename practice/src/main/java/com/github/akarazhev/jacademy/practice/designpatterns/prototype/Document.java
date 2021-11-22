package com.github.akarazhev.jacademy.practice.designpatterns.prototype;

public class Document implements Cloneable {
    private String text;

    public Document(String text) {
        this.text = text;
    }

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
