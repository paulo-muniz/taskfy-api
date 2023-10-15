package br.com.paulomuniz.infra.mapper;

import org.springframework.stereotype.Component;

import br.com.paulomuniz.core.domain.Task;
import br.com.paulomuniz.infra.entity.TaskEntity;

@Component
public class TaskEntityMapper {

    private TaskEntityMapper() {
    }

    public static Task toDomain(final TaskEntity entity) {
        return new Task(
                entity.getId(),
                entity.getTitle(),
                entity.getDescription(),
                entity.getStatus(),
                entity.getCreatedAt(),
                entity.getUpdatedAt()
        );
    }

    public static TaskEntity toEntity(final Task domain) {
        return new TaskEntity(
                domain.getId(),
                domain.getTitle(),
                domain.getDescription(),
                domain.getStatus(),
                domain.getCreatedAt(),
                domain.getUpdatedAt()
        );
    }
}
