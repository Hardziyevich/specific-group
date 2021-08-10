package com.github.akarazhev.jacademy.designpatterns.proxy;

import com.github.akarazhev.jacademy.designpatterns.adapter.Config;

/**
 * The service config model that contains logic.
 */
final class ServiceConfig implements Config {
    /**
     * {@inheritDoc}
     */
    @Override
    public int getId() {
        return 100;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public String getName() {
        return "Service Name";
    }
}
