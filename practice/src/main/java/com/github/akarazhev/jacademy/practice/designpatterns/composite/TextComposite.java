package com.github.akarazhev.jacademy.practice.designpatterns.composite;

import java.util.ArrayList;
import java.util.List;

/**
 * {@inheritDoc}
 */
public class TextComposite implements TextComponent {

    private final TextType textType;
    private final List<TextComponent> textComposites = new ArrayList<>();

    /**
     * Initialization of type a component.
     *
     * @param textType a type of component.
     */
    public TextComposite(TextType textType) {
        this.textType = textType;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public boolean addText(TextComponent textComponent) {
        return textComposites.add(textComponent);
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public boolean removeText(TextComponent textComponent) {
        return textComposites.remove(textComponent);
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public List<TextComponent> allComponent() {
        return List.copyOf(textComposites);
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public TextType getType() {
        return textType;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public String toString() {
        StringBuilder stringBuilder = new StringBuilder();
        textComposites.forEach(x -> stringBuilder
                .append(x.toString())
                .append(textType.getPostfix()));
        if (textType == TextType.PARAGRAPH) {
            stringBuilder.delete(stringBuilder.length() - 1, stringBuilder.length());
        } else if (textType == TextType.TEXT) {
            stringBuilder.delete(stringBuilder.length() - 2, stringBuilder.length());
        }
        return stringBuilder.toString();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        TextComposite that = (TextComposite) o;
        return textType == that.textType && textComposites.equals(that.textComposites);
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public int hashCode() {
        final int prime = 31;
        int result = 1;
        result = prime * result + (textComposites == null ? 0 : textComposites.hashCode());
        result = prime * result + (textType == null ? 0 : textType.hashCode());
        return result;
    }
}
