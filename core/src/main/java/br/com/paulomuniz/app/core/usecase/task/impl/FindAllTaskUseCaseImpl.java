package br.com.paulomuniz.app.core.usecase.task.impl;

import java.util.List;

import br.com.paulomuniz.app.core.dataprovider.task.FindAllTaskDataProvider;
import br.com.paulomuniz.app.core.domain.Task;
import br.com.paulomuniz.app.core.usecase.task.FindAllTaskUseCase;

public class FindAllTaskUseCaseImpl implements FindAllTaskUseCase {

    private final FindAllTaskDataProvider findAllTaskDataProvider;

    public FindAllTaskUseCaseImpl(final FindAllTaskDataProvider findAllTaskDataProvider) {
        this.findAllTaskDataProvider = findAllTaskDataProvider;
    }

    @Override
    public List<Task> execute() {
        return this.findAllTaskDataProvider.execute();
    }
}
