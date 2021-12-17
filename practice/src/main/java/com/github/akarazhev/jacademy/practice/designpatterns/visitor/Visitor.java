package com.github.akarazhev.jacademy.practice.designpatterns.visitor;

import com.github.akarazhev.jacademy.practice.designpatterns.visitor.impl.SentenceImpl;
import com.github.akarazhev.jacademy.practice.designpatterns.visitor.impl.TextImpl;
import com.github.akarazhev.jacademy.practice.designpatterns.visitor.impl.WordImpl;

/**
 * Provides method for parsing text depends on type text.
 */
public interface Visitor {

    /**
     * Parsing text.
     * @param component a component is text.
     */
    void parse(TextImpl component);

    /**
     * Parsing word.
     * @param component a component is word.
     */
    void parse(WordImpl component);

    /**
     * Parsing sentence.
     * @param component a component is sentence.
     */
    void parse(SentenceImpl component);

}
