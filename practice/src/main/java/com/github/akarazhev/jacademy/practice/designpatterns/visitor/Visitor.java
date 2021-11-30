package com.github.akarazhev.jacademy.practice.designpatterns.visitor;

import com.github.akarazhev.jacademy.practice.designpatterns.visitor.impl.SentenceImpl;
import com.github.akarazhev.jacademy.practice.designpatterns.visitor.impl.TextImpl;
import com.github.akarazhev.jacademy.practice.designpatterns.visitor.impl.WordImpl;

public interface Visitor {
    void parse(TextImpl component);
    void parse(WordImpl component);
    void parse(SentenceImpl component);
}
