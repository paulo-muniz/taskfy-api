package br.com.paulomuniz.app.core.usecase.task;

import br.com.paulomuniz.app.core.domain.Task;

public interface CreateTaskUseCase {
    Task execute(final Task task);
}
