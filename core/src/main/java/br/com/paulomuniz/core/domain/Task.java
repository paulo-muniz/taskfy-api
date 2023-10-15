package br.com.paulomuniz.core.domain;

import java.time.OffsetDateTime;
import java.util.UUID;

import br.com.paulomuniz.core.domain.enums.TaskStatusEnum;

public class Task {

    private UUID id;
    private String title;
    private String description;
    private TaskStatusEnum status;
    private OffsetDateTime createdAt;
    private OffsetDateTime updatedAt;

    public Task() {
    }

    public Task(
            final String title,
            final String description
    ) {
        this.id = UUID.randomUUID();
        this.title = title;
        this.description = description;
        this.status = TaskStatusEnum.BACKLOG;
        this.createdAt = OffsetDateTime.now();
    }

    public Task(
            final UUID id,
            final String title,
            final String description,
            final TaskStatusEnum status,
            final OffsetDateTime createdAt,
            final OffsetDateTime updatedAt
    ) {
        this.id = id;
        this.title = title;
        this.description = description;
        this.status = status;
        this.createdAt = createdAt;
        this.updatedAt = updatedAt;
    }

    public UUID getId() {
        return id;
    }

    public String getTitle() {
        return title;
    }

    public String getDescription() {
        return description;
    }

    public TaskStatusEnum getStatus() {
        return status;
    }

    public OffsetDateTime getCreatedAt() {
        return createdAt;
    }

    public OffsetDateTime getUpdatedAt() {
        return updatedAt;
    }
}
