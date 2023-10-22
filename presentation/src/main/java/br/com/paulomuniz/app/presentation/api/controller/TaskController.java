package br.com.paulomuniz.app.presentation.api.controller;

import java.util.List;
import java.util.UUID;

import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import br.com.paulomuniz.app.core.usecase.task.CreateTaskUseCase;
import br.com.paulomuniz.app.core.usecase.task.FindAllTaskUseCase;
import br.com.paulomuniz.app.core.usecase.task.FindByIdTaskUseCase;
import br.com.paulomuniz.app.presentation.api.dto.request.task.CreateTaskRequest;
import br.com.paulomuniz.app.presentation.api.dto.response.task.TaskResponse;
import br.com.paulomuniz.app.presentation.api.mapper.TaskMapper;
import jakarta.validation.Valid;

@RestController
@RequestMapping("/api/v1/tasks")
public class TaskController {

    private final CreateTaskUseCase createTaskUseCase;
    private final FindAllTaskUseCase findAllTaskUseCase;
    private final FindByIdTaskUseCase findByIdTaskUseCase;

    public TaskController(
            final CreateTaskUseCase createTaskUseCase,
            final FindAllTaskUseCase findAllTaskUseCase,
            final FindByIdTaskUseCase findByIdTaskUseCase
    ) {
        this.createTaskUseCase = createTaskUseCase;
        this.findAllTaskUseCase = findAllTaskUseCase;
        this.findByIdTaskUseCase = findByIdTaskUseCase;
    }

    @GetMapping
    public ResponseEntity<List<TaskResponse>> findAll() {
        var tasks = TaskMapper.toResponseList(this.findAllTaskUseCase.execute());

        return tasks.isEmpty()
                ? ResponseEntity.noContent().build()
                : ResponseEntity.ok(tasks);
    }

    @PostMapping
    public ResponseEntity<TaskResponse> create(@RequestBody @Valid CreateTaskRequest request) {
        var taskToCreate = TaskMapper.toDomain(request);
        var createdTask = this.createTaskUseCase.execute(taskToCreate);

        return ResponseEntity.created(null).body(TaskMapper.toResponse(createdTask));
    }

    @GetMapping("/{id}")
    public ResponseEntity<TaskResponse> findById(@PathVariable UUID id) {
        var taskFound = this.findByIdTaskUseCase.execute(id);
        var response = TaskMapper.toResponse(taskFound);

        return ResponseEntity.ok(response);
    }
}
