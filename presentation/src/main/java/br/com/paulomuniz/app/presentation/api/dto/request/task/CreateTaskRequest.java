package br.com.paulomuniz.app.presentation.api.dto.request.task;

import jakarta.validation.constraints.NotEmpty;
import jakarta.validation.constraints.Size;

public record CreateTaskRequest(
        @NotEmpty @Size(min = 3, max = 100) String title,
        @Size(max = 255) String description
) {
}
