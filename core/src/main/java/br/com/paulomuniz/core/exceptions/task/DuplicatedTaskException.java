package br.com.paulomuniz.core.exceptions.task;

import java.util.UUID;

public class DuplicatedTaskException extends RuntimeException {

    public DuplicatedTaskException(final String message) {
        super(message);
    }

    public DuplicatedTaskException(final UUID id) {
        super("Task already exists by id: " + id);
    }
}
