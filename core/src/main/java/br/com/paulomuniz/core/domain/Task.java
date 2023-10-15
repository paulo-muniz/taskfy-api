package br.com.paulomuniz.core.domain;

import java.time.OffsetDateTime;
import java.util.UUID;

import br.com.paulomuniz.core.domain.enums.TaskStatusEnum;

public class Task {

    private UUID id;
    private String title;
    private String description;
    private TaskStatusEnum status;
    private OffsetDateTime createdDate;

    public Task() {
    }

    public Task(
            final UUID id,
            final String title,
            final String description
    ) {
        this.id = id;
        this.title = title;
        this.description = description;
        this.status = TaskStatusEnum.BACKLOG;
        this.createdDate = OffsetDateTime.now();
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

    public OffsetDateTime getCreatedDate() {
        return createdDate;
    }
}
