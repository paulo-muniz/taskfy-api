package br.com.paulomuniz.core.usecase.task;

import br.com.paulomuniz.core.domain.Task;

public interface CreateTaskUseCase {
    Task execute(final Task task);
}
