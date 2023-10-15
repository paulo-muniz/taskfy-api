package br.com.paulomuniz.core.exceptions.task;

import java.util.UUID;

import br.com.paulomuniz.core.exceptions.DomainDuplicatedException;

public class DuplicatedTaskException extends DomainDuplicatedException {

    public DuplicatedTaskException(final String message) {
        super(message);
    }

    public DuplicatedTaskException(final UUID id) {
        super("Task already exists by id: " + id);
    }
}
