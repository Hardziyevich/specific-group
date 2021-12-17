package com.github.akarazhev.jacademy.practice.designpatterns.factorymethod.factorymethod;

import com.github.akarazhev.jacademy.practice.designpatterns.builder.BoardBuilder;
import com.github.akarazhev.jacademy.practice.designpatterns.builder.impl.BoardBuilderImpl;
import com.github.akarazhev.jacademy.practice.designpatterns.factorymethod.DemoBoard;

/**
 * {@inheritDoc}
 */
public class EthernetToSDITranslator implements DemoBoard {

    /**
     * {@inheritDoc}
     */
    @Override
    public BoardBuilder creatBoard() {
        return new BoardBuilderImpl().sdi();
    }

}
