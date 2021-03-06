package com.github.akarazhev.jacademy.designpatterns.visitor;

/**
 * Provides the implementation for a db service.
 */
final class DbService implements Service {
    /**
     * {@inheritDoc}
     */
    @Override
    public void accept(final ServiceVisitor visitor) {
        visitor.visit(this, "Database service");
    }
}
