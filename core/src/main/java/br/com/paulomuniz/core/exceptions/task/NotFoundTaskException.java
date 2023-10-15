package br.com.paulomuniz.core.exceptions.task;

import java.util.UUID;

public class NotFoundTaskException extends RuntimeException {

    public NotFoundTaskException(final String message) {
        super(message);
    }

    public NotFoundTaskException(final UUID id) {
        super("Task not found with id: " + id);
    }
}
