package com.github.akarazhev.jacademy.practice.designpatterns.abstractfactory;

import java.util.List;

/**
 * Provides method for a worker.
 */
public interface Worker {

    /**
     * Placing component on the board.
     * @param components a list of electronic component
     * @return result of work
     * @throws Exception throw exception if worker doesn`t know how work with current component.
     */
    boolean placeOnBoard(List<ElectricalComponent> components) throws Exception;

}
