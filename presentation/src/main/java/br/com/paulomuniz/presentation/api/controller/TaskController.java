package br.com.paulomuniz.presentation.api.controller;

import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import br.com.paulomuniz.core.usecase.task.CreateTaskUseCase;
import br.com.paulomuniz.presentation.api.dto.request.task.CreateTaskRequest;
import br.com.paulomuniz.presentation.api.dto.response.task.TaskResponse;
import br.com.paulomuniz.presentation.api.mapper.TaskMapper;
import jakarta.validation.Valid;

@RestController
@RequestMapping("/api/v1/tasks")
public class TaskController {

    private final CreateTaskUseCase createTaskUseCase;

    public TaskController(CreateTaskUseCase createTaskUseCase) {
        this.createTaskUseCase = createTaskUseCase;
    }

    @PostMapping
    public ResponseEntity<TaskResponse> create(@RequestBody @Valid CreateTaskRequest request) {
        var taskToCreate = TaskMapper.toDomain(request);
        var createdTask = this.createTaskUseCase.execute(taskToCreate);

        return ResponseEntity.created(null).body(TaskMapper.toResponse(createdTask));
    }
}
