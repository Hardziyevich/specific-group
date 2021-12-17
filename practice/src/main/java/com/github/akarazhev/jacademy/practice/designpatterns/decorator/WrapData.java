package com.github.akarazhev.jacademy.practice.designpatterns.decorator;

/**
 * Provides an interface for realization behaviour different data encoding.
 */
public interface WrapData {

    /**
     * Encoding data.
     * @param data a string of input data
     * @return a string of data encoding.
     */
    String encodingData(String data);

}