package com.github.akarazhev.jacademy.designpatterns.state;

/**
 * Provides the implementation for a paused state.
 */
public class Paused implements State {
    /**
     * {@inheritDoc}
     */
    @Override
    public void execute(final Context context, final String command) {
        if ("start".equals(command)) {
            context.setState(new Online());
        } else if ("stop".equals(command)) {
            context.setState(new Offline());
        }
    }
}
