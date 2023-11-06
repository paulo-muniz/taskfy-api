package br.com.paulomuniz.app.presentation.api.mapper;

import br.com.paulomuniz.app.core.domain.Task;
import br.com.paulomuniz.app.presentation.api.dto.request.task.CreateTaskRequest;
import br.com.paulomuniz.app.presentation.api.dto.response.task.TaskResponse;
import org.springframework.stereotype.Component;

import java.util.List;
import java.util.UUID;

@Component
public class TaskMapper {

    private TaskMapper() {
    }

    public static Task toDomain(CreateTaskRequest request) {
        return Task.createTask(UUID.randomUUID(), request.title(), request.description());
    }

    public static TaskResponse toResponse(Task task) {
        return new TaskResponse(
                task.getId(),
                task.getTitle(),
                task.getDescription(),
                task.getStatus(),
                task.isActive(),
                task.getCreatedAt(),
                task.getUpdatedAt(),
                task.getDeletedAt());
    }

    public static List<TaskResponse> toResponseList(List<Task> tasks) {
        return tasks.stream()
                .map(t -> new TaskResponse(
                        t.getId(),
                        t.getTitle(),
                        t.getDescription(),
                        t.getStatus(),
                        t.isActive(),
                        t.getCreatedAt(),
                        t.getUpdatedAt(),
                        t.getDeletedAt()
                )).toList();
    }
}
