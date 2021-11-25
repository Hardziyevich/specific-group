package com.github.akarazhev.jacademy.practice.designpatterns.chainofresponsibility;

public class ReadTask implements Task{

    private final Stage stageMain;
    private Task nextTask;


    public ReadTask(Stage stageMain) {
        this.stageMain = stageMain;
    }

    public void setNextTask(Task nextTask) {
        this.nextTask = nextTask;
    }

    @Override
    public void toDoSth(String message, Stage stage) {
        if(stageMain.equals(stage)){
            System.out.println("toDoTask" + message);
        } else {
            System.out.println("toDoTask" + message);
            nextTask.toDoSth(message, stage);
        }
    }
}
