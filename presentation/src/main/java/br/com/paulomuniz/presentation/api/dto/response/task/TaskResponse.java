package br.com.paulomuniz.presentation.api.dto.response.task;

import java.time.OffsetDateTime;
import java.util.UUID;

import br.com.paulomuniz.core.domain.enums.TaskStatusEnum;

public record TaskResponse(
        UUID id,
        String title,
        String description,
        TaskStatusEnum status,
        OffsetDateTime createdAt,
        OffsetDateTime updatedAt
) {
}
