package br.com.paulomuniz.infra.repository.impl;

import java.util.Optional;
import java.util.UUID;

import org.springframework.stereotype.Component;

import br.com.paulomuniz.core.dataprovider.task.FindByIdTaskDataProvider;
import br.com.paulomuniz.core.domain.Task;
import br.com.paulomuniz.infra.mapper.TaskEntityMapper;
import br.com.paulomuniz.infra.repository.TaskRepository;

@Component
public class FindByIdTaskDataProviderImpl implements FindByIdTaskDataProvider {

    private final TaskRepository taskRepository;

    public FindByIdTaskDataProviderImpl(final TaskRepository taskRepository) {
        this.taskRepository = taskRepository;
    }

    @Override
    public Optional<Task> execute(final UUID id) {
        var task = this.taskRepository.findById(id);

        return task.map(TaskEntityMapper::toDomain);
    }
}
