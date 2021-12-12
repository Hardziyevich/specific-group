package com.github.akarazhev.jacademy.practice.designpatterns.chainofresponsibility.interpreter;

import java.util.LinkedList;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class InterpreterExpression implements Interpret {

    private static final String REG_NOT = "(~\\d++)";
    private static final String REG_EXPRESSION = "(-?\\d+\\p{Punct}-?\\d+)";
    private static final String REG_SHIFT_LEFT = "(\\d+<<\\d+)";
    private static final String REG_SHIFT_RIGHT = "(\\d+>>\\d+)";
    private static final String REG_SHIFT = REG_SHIFT_LEFT + "|" + REG_SHIFT_RIGHT;
    private static final String REG_DIGIT = "-?\\d";
    private static final String SHIFT_LEFT = "<<";
    private static final String SHIFT_RIGHT = ">>";
    private static final String NOT = "~";
    private static final String EXPRESSION = "[^-?\\d+]";
    private static final String SPACE = "";

    @Override
    public int interpret(String text) {
        int result = 0;
        String innerBracket = findInnerBrackets(text);
        //First expression will execute bit shift operators
        String withoutShift = findShift(innerBracket);
        if (!innerBracket.equals(text)) {
            String substring = withoutShift.substring(1, withoutShift.length() - 1);
            String replaceText = findOperation(substring);
            String recursion = text.replace(innerBracket, replaceText);
            result = interpret(recursion);

        } else {
            String replaceText = findOperation(withoutShift);
            String recursion = text.replace(innerBracket, replaceText);
            result = Integer.parseInt(recursion);
        }

        return result;
    }

    private Interpret interpretDigit() {
        return Integer::parseInt;
    }

    private Interpret interpretNot() {
        return context -> ~Integer.parseInt(context);
    }

    public Interpret interpretOperation(String left, String right) {
        return context -> {
            switch (context) {
                case ">>":
                    return interpretDigit().interpret(left) >> interpretDigit().interpret(right);
                case "<<":
                    return interpretDigit().interpret(left) << interpretDigit().interpret(right);
                case "&":
                    return interpretDigit().interpret(left) & interpretDigit().interpret(right);
                case "^":
                    return interpretDigit().interpret(left) ^ interpretDigit().interpret(right);
                case "|":
                    return interpretDigit().interpret(left) | interpretDigit().interpret(right);
                default:
                    throw new UnsupportedOperationException();
            }
        };
    }

    private String findOperation(String substring) {
        String find;
        String[] stringDigits;
        int interpret;
        Pattern pattern = Pattern.compile(REG_NOT + "|" + REG_EXPRESSION);
        Matcher matcher = pattern.matcher(substring);
        while (matcher.find()) {
            find = matcher.group();
            if (matcher.start(1) != -1) {
                stringDigits = find.split(NOT);
                interpret = interpretNot().interpret(stringDigits[1]);
                substring = substring.replaceFirst(REG_NOT, String.valueOf(interpret));
            } else if (matcher.start(2) != -1) {
                stringDigits = find.split(EXPRESSION);
                String operation = find.replaceAll(REG_DIGIT, SPACE);
                interpret = interpretOperation(stringDigits[0], stringDigits[1]).interpret(operation);
                substring = substring.replaceFirst(REG_EXPRESSION, String.valueOf(interpret));
            }
            matcher.reset(substring);
        }
        return substring;
    }

    public String findShift(String expression) {
        String find;
        String[] stringDigits;
        int interpret;
        Pattern pattern = Pattern.compile(REG_SHIFT);
        Matcher matcher = pattern.matcher(expression);
        while (matcher.find()) {
            find = matcher.group();
            if (matcher.start(1) != -1) {
                //find digit
                stringDigits = find.split(SHIFT_LEFT);

                //interpret expression into digit
                interpret = interpretOperation(stringDigits[0], stringDigits[1]).interpret(SHIFT_LEFT);

                //replace expression with new interpret digit
                expression = expression.replaceFirst(REG_SHIFT_LEFT, String.valueOf(interpret));

            } else if (matcher.start(2) != -1) {
                stringDigits = find.split(SHIFT_RIGHT);
                interpret = interpretOperation(stringDigits[0], stringDigits[1]).interpret(SHIFT_RIGHT); //interpret expression into digit
                expression = expression.replaceFirst(REG_SHIFT_RIGHT, String.valueOf(interpret));
            }
            matcher.reset(expression);
        }
        return expression;
    }
    //That function is allow to us find inner bracket in expression.
    //She finds open bracket index and put in stack, before look for close bracket and creat substring.

    private String findInnerBrackets(String expression) {
        Stack<Integer> stack = new Stack<>();
        Pattern pattern = Pattern.compile("([(])|([)])");
        Matcher matcher = pattern.matcher(expression);
        while (matcher.find()) {
            if (matcher.start(1) != -1) {
                stack.push(matcher.start());
            } else if (matcher.start(2) != -1) {
                return expression.substring(stack.pop(), matcher.start() + 1);
            }
        }
        return expression;
    }

    private static class Stack<T> {

        private final LinkedList<T> stack;

        public Stack() {
            stack = new LinkedList<>();
        }

        public void push(final T digit) {
            stack.push(digit);
        }

        public T pop() {
            return stack.pop();
        }

        public T peek() {
            return stack.peek();
        }

        boolean isEmpty() {
            return stack.isEmpty();
        }
    }
}
