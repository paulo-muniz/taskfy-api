package br.com.paulomuniz.app.infra.mapper;

import br.com.paulomuniz.app.core.domain.Task;
import br.com.paulomuniz.app.infra.entity.TaskEntity;
import org.springframework.stereotype.Component;

@Component
public class TaskEntityMapper {

    private TaskEntityMapper() {
    }

    public static Task toDomain(final TaskEntity entity) {
        return Task.createTask(
                entity.getId(),
                entity.getTitle(),
                entity.getDescription()
        );
    }

    public static TaskEntity toEntity(final Task domain) {
        return new TaskEntity(
                domain.getId(),
                domain.getTitle(),
                domain.getDescription(),
                domain.getStatus(),
                domain.isActive(),
                domain.getCreatedAt(),
                domain.getUpdatedAt(),
                domain.getDeletedAt()
        );
    }
}
