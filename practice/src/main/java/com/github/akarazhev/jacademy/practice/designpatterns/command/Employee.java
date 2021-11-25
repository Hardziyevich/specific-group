package com.github.akarazhev.jacademy.practice.designpatterns.command;

public class Employee {
    private Task task;

    public Employee(Task task) {
        this.task = task;
    }

    public void doSth(){
        System.out.println("I have " + task.execute());
    }
}
