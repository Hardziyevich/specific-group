package com.github.akarazhev.jacademy.practice.designpatterns.chainofresponsibility;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class Worker {
    private final Map<Task.Stage,Task> tasks = new HashMap<>();

    public void addTask(Task task,Task.Stage stage){
        if(tasks.size() < 3){
            tasks.put(stage,task);
        }else {
            completeAllTask();
            tasks.put(stage,task);
        }
    }

    public void completeAllTask(){
        tasks.entrySet().iterator().forEachRemaining(e ->{
           // System.out.println("i`m reading " + e.getValue().toDoSth(););
        });
    }
}
