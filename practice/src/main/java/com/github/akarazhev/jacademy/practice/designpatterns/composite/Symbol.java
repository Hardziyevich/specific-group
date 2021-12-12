package com.github.akarazhev.jacademy.practice.designpatterns.composite;

import java.util.List;

public class Symbol implements TextComponent {
    private final TextType textType;
    private final char symbol;

    public Symbol(TextType textType, char symbol) {
        this.textType = textType;
        this.symbol = symbol;
    }

    @Override
    public boolean addText(TextComponent textComponent) {
        throw new UnsupportedOperationException();
    }

    @Override
    public boolean removeText(TextComponent textComponent) {
        throw new UnsupportedOperationException();
    }

    @Override
    public List<TextComponent> allComponent() {
        throw new UnsupportedOperationException();
    }

    @Override
    public TextType getType() {
        return textType;
    }

    @Override
    public String toString() {
        return String.valueOf(symbol);
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Symbol symb = (Symbol) o;
        return symbol == symb.symbol && textType == symb.textType;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int result = 1;
        result = prime * result + Character.hashCode(symbol);
        result = prime * result + (textType == null ? 0 : textType.hashCode());
        return result;
    }
}
