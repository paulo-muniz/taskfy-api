package br.com.paulomuniz.app.infra.repository.impl;

import org.springframework.stereotype.Component;

import br.com.paulomuniz.app.core.dataprovider.task.SaveTaskDataProvider;
import br.com.paulomuniz.app.core.domain.Task;
import br.com.paulomuniz.app.infra.mapper.TaskEntityMapper;
import br.com.paulomuniz.app.infra.repository.TaskRepository;

@Component
public class SaveTaskDataProviderImpl implements SaveTaskDataProvider {

    private final TaskRepository taskRepository;

    public SaveTaskDataProviderImpl(final TaskRepository taskRepository) {
        this.taskRepository = taskRepository;
    }

    @Override
    public Task execute(final Task task) {
        var taskEntity = TaskEntityMapper.toEntity(task);
        var createdTask = this.taskRepository.save(taskEntity);

        return TaskEntityMapper.toDomain(createdTask);
    }
}
