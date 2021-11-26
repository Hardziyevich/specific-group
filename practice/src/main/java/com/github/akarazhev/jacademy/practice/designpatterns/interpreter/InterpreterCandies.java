package com.github.akarazhev.jacademy.practice.designpatterns.interpreter;

import java.util.EnumMap;
import java.util.Map;

@FunctionalInterface
public interface InterpreterCandies {
    boolean interpret(String param);

    enum TypeCandies {
        CARAMEL("caramel"),
        CHOCOLATE("chocolate"),
        SOUFFLE("souffle");
        private final String name;

        TypeCandies(String name) {
            this.name = name;
        }

        public String getName() {
            return name;
        }
    }

    enum ValueCandies {
        PROTEIN("protein"),
        FAT("fat"),
        CARB("carb");

        private final String value;

        ValueCandies(String value){
            this.value = value;
        }

        public String getValue() {
            return value;
        }
    }

    static InterpreterCandies typeCandy(TypeCandies type) {
        return x -> x.equals(type.getName());
    }

    static InterpreterCandies valueCandy(ValueCandies value) {
        return x -> x.equals(value.getValue());
    }

    static boolean isCandies(String name){
        InterpreterCandies caramel = InterpreterCandies.typeCandy(InterpreterCandies.TypeCandies.CARAMEL);
        InterpreterCandies chocolate = InterpreterCandies.typeCandy(InterpreterCandies.TypeCandies.CHOCOLATE);
        InterpreterCandies souffle = InterpreterCandies.typeCandy(InterpreterCandies.TypeCandies.SOUFFLE);
        return caramel.interpret(name) || chocolate.interpret(name) || souffle.interpret(name);
    }
}
