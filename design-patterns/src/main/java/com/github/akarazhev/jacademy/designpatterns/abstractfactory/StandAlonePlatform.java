package com.github.akarazhev.jacademy.designpatterns.abstractfactory;

import com.github.akarazhev.jacademy.designpatterns.factorymethod.DbServer;
import com.github.akarazhev.jacademy.designpatterns.factorymethod.DbServers;
import com.github.akarazhev.jacademy.designpatterns.factorymethod.WebServer;
import com.github.akarazhev.jacademy.designpatterns.factorymethod.WebServers;

/**
 * Provides basic methods for a Stand alone platform.
 */
final class StandAlonePlatform implements Platform {
    /**
     * {@inheritDoc}
     */
    @Override
    public DbServer newDbServer() throws Exception {
        return DbServers.newH2dbServer();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public WebServer newWebServer() throws Exception {
        return WebServers.newHttpServer();
    }
}
