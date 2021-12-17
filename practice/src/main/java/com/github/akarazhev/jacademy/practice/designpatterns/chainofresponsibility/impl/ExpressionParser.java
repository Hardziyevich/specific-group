package com.github.akarazhev.jacademy.practice.designpatterns.chainofresponsibility.impl;


import com.github.akarazhev.jacademy.practice.designpatterns.chainofresponsibility.BaseParser;
import com.github.akarazhev.jacademy.practice.designpatterns.interpreter.InterpreterExpression;
import com.github.akarazhev.jacademy.practice.designpatterns.composite.Symbol;
import com.github.akarazhev.jacademy.practice.designpatterns.composite.TextComponent;
import com.github.akarazhev.jacademy.practice.designpatterns.composite.TextComposite;

import static com.github.akarazhev.jacademy.practice.designpatterns.composite.TextType.DIGIT;
import static com.github.akarazhev.jacademy.practice.designpatterns.composite.TextType.EXPRESSION;

/**
 * {@inheritDoc}
 */
public class ExpressionParser implements BaseParser {

    private static final ExpressionParser instance = new ExpressionParser();

    private ExpressionParser() {
    }

    public static ExpressionParser getInstance() {
        return instance;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public TextComponent parse(String text) {

        TextComponent expressionComponent = new TextComposite(EXPRESSION);
        TextComponent parse;
        int digit = new InterpreterExpression().interpret(text);
        for (String expression : Integer.toString(digit).split(WORD_DELIMITER_REG)) {
            parse = new Symbol(DIGIT, expression.charAt(0));
            expressionComponent.addText(parse);
        }
        return expressionComponent;
    }

}
