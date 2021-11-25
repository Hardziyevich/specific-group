package com.github.akarazhev.jacademy.practice.designpatterns.command;

import java.util.HashMap;
import java.util.Map;
import java.util.Optional;

public class Boss {
    private Map<String, Task> tasks = new HashMap<>();

    public void getTask(String taskName, Task task) {
        tasks.put(Optional.of(taskName).orElseThrow(NullPointerException::new),
                Optional.of(task).orElseThrow(NullPointerException::new));
    }
    public Task sendTaskToEmployee(String string){
        return tasks.get(Optional.of(string).orElseThrow(NullPointerException::new));
    }
}
