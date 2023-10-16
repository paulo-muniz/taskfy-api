package br.com.paulomuniz.app.presentation.api.exception;

import java.time.OffsetDateTime;

public record ApiResponse(String message, int status, OffsetDateTime date) {

    public ApiResponse(String message, int status) {
        this(message, status, OffsetDateTime.now());
    }
}
