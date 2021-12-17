package com.github.akarazhev.jacademy.practice.designpatterns.composite;

import java.util.List;

/**
 * Leaf of the composite design patter.
 */
public class Symbol implements TextComponent {

    private final TextType textType;
    private final char symbol;

    public Symbol(TextType textType, char symbol) {
        this.textType = textType;
        this.symbol = symbol;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public boolean addText(TextComponent textComponent) {
        throw new UnsupportedOperationException();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public boolean removeText(TextComponent textComponent) {
        throw new UnsupportedOperationException();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public List<TextComponent> allComponent() {
        throw new UnsupportedOperationException();
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
        return String.valueOf(symbol);
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Symbol symb = (Symbol) o;
        return symbol == symb.symbol && textType == symb.textType;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public int hashCode() {
        final int prime = 31;
        int result = 1;
        result = prime * result + Character.hashCode(symbol);
        result = prime * result + (textType == null ? 0 : textType.hashCode());
        return result;
    }

}
