package br.com.paulomuniz.app.core.exceptions.task;

import java.util.UUID;

import br.com.paulomuniz.app.core.exceptions.DomainNotFoundException;

public class NotFoundTaskException extends DomainNotFoundException {

    public NotFoundTaskException(final String message) {
        super(message);
    }

    public NotFoundTaskException(final UUID id) {
        super("Task not found with id: " + id);
    }
}
