package com.github.akarazhev.jacademy.practice.designpatterns.builder;

import com.github.akarazhev.jacademy.practice.designpatterns.builder.builder.BoardBuilder;
import com.github.akarazhev.jacademy.practice.designpatterns.builder.builder.BoardBuilderImpl;

public class Solution {
    public static void main(String[] args) {
        BoardBuilder builder = new BoardBuilderImpl()
                .powerSupple()
                .processor();
        DemoBoard demoBoard = new DemoBoard(builder);
        demoBoard.info(demoBoard.getClass());
    }
}
