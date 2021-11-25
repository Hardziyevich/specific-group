package com.github.akarazhev.jacademy.practice.designpatterns.chainofresponsibility;

@FunctionalInterface
public interface Task {
    enum Stage {
        IMPORTANT,
        NOT_IMPORTANT
    }

    void toDoSth(String message, Stage stage);

    default Task next(final Task task) {
        return (mes, stage) -> {
            toDoSth(mes,stage);
            task.toDoSth(mes, stage);
        };
    }
}
