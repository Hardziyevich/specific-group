package com.github.akarazhev.jacademy.jprog.multithreading.threadbasic.timer.v1;

import java.util.Timer;
import java.util.TimerTask;

public class Demonstration {

    public static void main(String[] args) throws Exception {
        Timer timer = new Timer();
        TimerTask badTask = new TimerTask() {

            @Override
            public void run() {
                // run forever
                while (true)
                    ;
            }
        };

        TimerTask goodTask = new TimerTask() {

            @Override
            public void run() {
                System.out.println("Hello I am a well-behaved task");
            }
        };

        timer.schedule(badTask, 100);
        timer.schedule(goodTask, 500);
        // By three seconds, both tasks are expected to have launched
        Thread.sleep(3000);
    }
}