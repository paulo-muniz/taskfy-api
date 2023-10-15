package br.com.paulomuniz.presentation.api.mapper;

import java.util.List;

import org.springframework.stereotype.Component;

import br.com.paulomuniz.core.domain.Task;
import br.com.paulomuniz.presentation.api.dto.request.task.CreateTaskRequest;
import br.com.paulomuniz.presentation.api.dto.response.task.TaskResponse;

@Component
public class TaskMapper {

    private TaskMapper() {
    }

    public static Task toDomain(CreateTaskRequest request) {
        return new Task(request.title(), request.description());
    }

    public static TaskResponse toResponse(Task task) {
        return new TaskResponse(
                task.getId(),
                task.getTitle(),
                task.getDescription(),
                task.getStatus(),
                task.getCreatedAt(),
                task.getUpdatedAt());
    }

    public static List<TaskResponse> toResponseList(List<Task> tasks) {
        return tasks.stream()
                .map(t -> new TaskResponse(
                        t.getId(),
                        t.getTitle(),
                        t.getDescription(),
                        t.getStatus(),
                        t.getCreatedAt(),
                        t.getUpdatedAt()
                )).toList();
    }
}
