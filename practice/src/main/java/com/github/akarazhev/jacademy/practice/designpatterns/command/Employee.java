package com.github.akarazhev.jacademy.practice.designpatterns.command;

/**
 * Represent a behaviour of employee which execute a task.
 */
public class Employee {

    private final Task task;

    /**
     * Constructor initialization a task
     *
     * @param task a Task of type
     */
    public Employee(Task task) {
        this.task = task;
    }

    /**
     * Execute task.
     */
    public void executeTask() {
        System.out.println("I have " + task.execute());
    }

}
