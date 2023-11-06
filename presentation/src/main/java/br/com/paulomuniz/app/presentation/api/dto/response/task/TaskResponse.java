package br.com.paulomuniz.app.presentation.api.dto.response.task;

import java.time.OffsetDateTime;
import java.util.UUID;

import br.com.paulomuniz.app.core.domain.enums.TaskStatusEnum;

public record TaskResponse(
        UUID id,
        String title,
        String description,
        TaskStatusEnum status,
        boolean active,
        OffsetDateTime createdAt,
        OffsetDateTime updatedAt,
        OffsetDateTime deletedAt
) {
}
