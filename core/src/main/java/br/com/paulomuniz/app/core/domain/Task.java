package br.com.paulomuniz.app.core.domain;

import br.com.paulomuniz.app.core.domain.enums.TaskStatusEnum;

import java.time.OffsetDateTime;
import java.util.Objects;
import java.util.UUID;

public class Task {

    private final UUID id;
    private final String title;
    private final String description;
    private final TaskStatusEnum status;
    private final boolean active;
    private final OffsetDateTime createdAt;
    private final OffsetDateTime updatedAt;
    private final OffsetDateTime deletedAt;


    private Task(
            final UUID id,
            final String title,
            final String description,
            final TaskStatusEnum status,
            final boolean active,
            final OffsetDateTime createdAt,
            final OffsetDateTime updatedAt,
            final OffsetDateTime deletedAt
    ) {
        this.id = id;
        this.title = title;
        this.description = description;
        this.status = status;
        this.active = active;
        this.createdAt = createdAt;
        this.updatedAt = updatedAt;
        this.deletedAt = deletedAt;
    }

    public static Task createTask(
            final UUID id,
            final String title,
            final String description
    ) {
        return new Task(
                id,
                title,
                description,
                TaskStatusEnum.BACKLOG,
                true,
                OffsetDateTime.now(),
                null,
                null
        );
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

    public boolean isActive() {
        return active;
    }

    public OffsetDateTime getCreatedAt() {
        return createdAt;
    }

    public OffsetDateTime getUpdatedAt() {
        return updatedAt;
    }

    public OffsetDateTime getDeletedAt() {
        return deletedAt;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Task task = (Task) o;
        return Objects.equals(id, task.id);
    }

    @Override
    public int hashCode() {
        return Objects.hash(id);
    }
}
