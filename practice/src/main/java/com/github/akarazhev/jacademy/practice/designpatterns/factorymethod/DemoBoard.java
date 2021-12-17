package com.github.akarazhev.jacademy.practice.designpatterns.factorymethod;


import com.github.akarazhev.jacademy.practice.designpatterns.builder.BoardBuilder;

/**
 * Provides an interface for representing factory method.
 */
public interface DemoBoard {

    /**
     * Creating board.
     * @return a type of board.
     */
    BoardBuilder creatBoard();

}
