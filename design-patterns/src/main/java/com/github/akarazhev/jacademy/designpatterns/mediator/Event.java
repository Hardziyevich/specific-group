package com.github.akarazhev.jacademy.designpatterns.mediator;

/**
 * Provides basic methods for an event.
 */
interface Event {
    /**
     * Send a message to a consumer.
     *
     * @param message  a message.
     * @param consumer a consumer.
     */
    void send(final String message, final Consumer consumer);
}
