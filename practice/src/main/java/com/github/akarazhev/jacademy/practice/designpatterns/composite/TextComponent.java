package com.github.akarazhev.jacademy.practice.designpatterns.composite;

import java.util.List;

/**
 * Provides an interface for pattern composite.
 */
public interface TextComponent {

    /**
     * Added text to composite.
     * @param textComponent a component of composite.
     * @return a result of adding element to composite.
     */
    boolean addText(TextComponent textComponent);

    /**
     * Removed text from composite.
     * @param textComponent a component of composite.
     * @return a result of removing element from composite.
     */
    boolean removeText(TextComponent textComponent);

    /**
     * Showing all component from composite.
     * @return a list of TextComponent.
     */
    List<TextComponent> allComponent();

    /**
     * Showing type of composite element.
     * @return a TextType of composite.
     */
    TextType getType();

    @Override
    String toString();
}
