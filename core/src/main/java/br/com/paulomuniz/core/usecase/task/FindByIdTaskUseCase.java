package br.com.paulomuniz.core.usecase.task;

import java.util.UUID;

import br.com.paulomuniz.core.domain.Task;

public interface FindByIdTaskUseCase {

    Task execute(final UUID id);
}
