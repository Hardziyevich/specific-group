package com.github.akarazhev.jacademy.jprog.multithreading.thread.v2;

public class Demonstration {

    public static void main(String[] args) {
        ExecuteMe executeMe = new ExecuteMe();
        Thread t = new Thread(executeMe);
        t.start();
    }
}

class ExecuteMe implements Runnable {

    public void run() {
        System.out.println("Say Hello");
    }
}
