package br.com.paulomuniz.core.dataprovider.task;

import java.util.Optional;
import java.util.UUID;

import br.com.paulomuniz.core.domain.Task;

public interface FindByIdTaskDataProvider {
    Optional<Task> execute(final UUID id);
}
