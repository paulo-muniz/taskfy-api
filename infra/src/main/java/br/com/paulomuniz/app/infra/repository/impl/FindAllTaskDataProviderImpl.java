package br.com.paulomuniz.app.infra.repository.impl;

import java.util.List;

import org.springframework.stereotype.Component;

import br.com.paulomuniz.app.core.dataprovider.task.FindAllTaskDataProvider;
import br.com.paulomuniz.app.core.domain.Task;
import br.com.paulomuniz.app.infra.mapper.TaskEntityMapper;
import br.com.paulomuniz.app.infra.repository.TaskRepository;

@Component
public class FindAllTaskDataProviderImpl implements FindAllTaskDataProvider {

    private final TaskRepository taskRepository;

    public FindAllTaskDataProviderImpl(final TaskRepository taskRepository) {
        this.taskRepository = taskRepository;
    }

    @Override
    public List<Task> execute() {
        return this.taskRepository.findAll()
                .stream()
                .map(TaskEntityMapper::toDomain)
                .toList();
    }
}
