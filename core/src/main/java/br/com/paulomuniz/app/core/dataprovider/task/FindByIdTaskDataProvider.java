package br.com.paulomuniz.app.core.dataprovider.task;

import java.util.Optional;
import java.util.UUID;

import br.com.paulomuniz.app.core.domain.Task;

public interface FindByIdTaskDataProvider {
    Optional<Task> execute(final UUID id);
}
