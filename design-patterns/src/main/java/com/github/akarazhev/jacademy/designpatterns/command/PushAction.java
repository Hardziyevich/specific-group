package com.github.akarazhev.jacademy.designpatterns.command;

/**
 * Provides a push action.
 */
final class PushAction implements Action {
    private final Storage storage;

    /**
     * Constructs a push action with the storage.
     *
     * @param storage a storage.
     */
    public PushAction(final Storage storage) {
        this.storage = storage;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public int execute() {
        return storage.push();
    }
}
