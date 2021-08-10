package com.github.akarazhev.jacademy.designpatterns.strategy;

/**
 * The specification of the strategy.
 */
public interface Strategy {
    /**
     * Sorts source indices by a certain algorithm.
     *
     * @param indices source indices.
     * @return sorted indices.
     */
    int[] sort(int[] indices);
}
