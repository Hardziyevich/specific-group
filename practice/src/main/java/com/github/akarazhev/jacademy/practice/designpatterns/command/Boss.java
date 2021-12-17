package com.github.akarazhev.jacademy.practice.designpatterns.command;

import java.util.HashMap;
import java.util.Map;
import java.util.Optional;

/**
 * Represent a behaviour boss which get tasks and sharing their to employees.
 */
public class Boss {

    private final Map<String, Task> tasks = new HashMap<>();

    /**
     * Getting tasks and save their in map.
     * @param name a string of taskName.
     * @param task a task of task.
     */
    public void getTask(String name, Task task) {
        tasks.put(Optional.of(name).orElseThrow(NullPointerException::new),
                Optional.of(task).orElseThrow(NullPointerException::new));
    }

    /**
     * Sending task to employee
     * @param name a string name of task.
     * @return a Task for employee.
     */
    public Task sendTaskToEmployee(String name){
        return tasks.get(Optional.of(name).orElseThrow(NullPointerException::new));
    }

}
