package com.github.akarazhev.jacademy.designpatterns.bridge;

/**
 * Provides basic transaction methods.
 */
interface Transaction {
    /**
     * Starts the transaction.
     */
    void begin();

    /**
     * Stops the transaction.
     */
    void end();
}
