package br.com.paulomuniz.core.usecase.task.impl;

import br.com.paulomuniz.core.dataprovider.task.SaveTaskDataProvider;
import br.com.paulomuniz.core.domain.Task;
import br.com.paulomuniz.core.usecase.task.CreateTaskUseCase;
import br.com.paulomuniz.core.usecase.task.ValidateDuplicatedTaskUseCase;

public class CreateTaskUseCaseImpl implements CreateTaskUseCase {

    private final SaveTaskDataProvider saveTaskDataProvider;
    private final ValidateDuplicatedTaskUseCase validateDuplicatedTaskUseCase;

    public CreateTaskUseCaseImpl(
            final SaveTaskDataProvider saveTaskDataProvider,
            final ValidateDuplicatedTaskUseCase validateDuplicatedTaskUseCase
    ) {
        this.saveTaskDataProvider = saveTaskDataProvider;
        this.validateDuplicatedTaskUseCase = validateDuplicatedTaskUseCase;
    }

    @Override
    public Task execute(final Task task) {
        this.validateDuplicatedTaskUseCase.execute(task.getId());

        return this.saveTaskDataProvider.execute(task);
    }
}
