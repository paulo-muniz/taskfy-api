package br.com.paulomuniz.app.core.usecase.task;

import java.util.UUID;

import br.com.paulomuniz.app.core.domain.Task;

public interface FindByIdTaskUseCase {

    Task execute(final UUID id);
}
