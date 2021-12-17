package com.github.akarazhev.jacademy.practice.designpatterns.facade;

/**
 * Represent behaviour an employees.
 */
public interface Employee {

    /**
     * Starting work an employee.
     */
    void startWork();

    /**
     * State of employee.
     * @return a boolean of state
     */
    boolean isWorking();

}
