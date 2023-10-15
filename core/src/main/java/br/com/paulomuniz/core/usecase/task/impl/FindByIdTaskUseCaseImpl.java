package br.com.paulomuniz.core.usecase.task.impl;

import java.util.UUID;

import br.com.paulomuniz.core.dataprovider.task.FindByIdTaskDataProvider;
import br.com.paulomuniz.core.domain.Task;
import br.com.paulomuniz.core.exceptions.task.NotFoundTaskException;
import br.com.paulomuniz.core.usecase.task.FindByIdTaskUseCase;

public class FindByIdTaskUseCaseImpl implements FindByIdTaskUseCase {

    private final FindByIdTaskDataProvider findByIdTaskDataProvider;

    public FindByIdTaskUseCaseImpl(final FindByIdTaskDataProvider findByIdTaskDataProvider) {
        this.findByIdTaskDataProvider = findByIdTaskDataProvider;
    }

    @Override
    public Task execute(final UUID id) {
        return this.findByIdTaskDataProvider.execute(id)
                .orElseThrow(() -> new NotFoundTaskException(id));
    }
}
