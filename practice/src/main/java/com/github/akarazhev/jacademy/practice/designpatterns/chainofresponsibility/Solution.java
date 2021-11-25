package com.github.akarazhev.jacademy.practice.designpatterns.chainofresponsibility;

public class Solution {
    public static void main(String[] args) {
        ReadTask read1 = new ReadTask(Task.Stage.IMPORTANT);
        ReadTask read2 = new ReadTask(Task.Stage.NOT_IMPORTANT);

        read1.setNextTask(read2);

        read1.toDoSth("Read book 1", Task.Stage.IMPORTANT);

        read1.toDoSth("Read chapter 1", Task.Stage.NOT_IMPORTANT);
    }
}
