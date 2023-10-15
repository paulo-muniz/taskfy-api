package br.com.paulomuniz.core.usecase.task.impl;

import java.util.UUID;

import br.com.paulomuniz.core.dataprovider.task.FindByIdTaskDataProvider;
import br.com.paulomuniz.core.exceptions.task.DuplicatedTaskException;
import br.com.paulomuniz.core.usecase.task.ValidateDuplicatedTaskUseCase;

public class ValidateDuplicatedTaskUseCaseImpl implements ValidateDuplicatedTaskUseCase {

    private final FindByIdTaskDataProvider findByIdTaskDataProvider;

    public ValidateDuplicatedTaskUseCaseImpl(final FindByIdTaskDataProvider findByIdTaskDataProvider) {
        this.findByIdTaskDataProvider = findByIdTaskDataProvider;
    }

    @Override
    public void execute(final UUID id) {
        this.findByIdTaskDataProvider.execute(id)
                .ifPresent(t -> {
                    throw new DuplicatedTaskException(id);
                });
    }
}
