package br.com.paulomuniz.app.presentation.api.exception;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.servlet.mvc.method.annotation.ResponseEntityExceptionHandler;

import br.com.paulomuniz.app.core.exceptions.DomainDuplicatedException;
import br.com.paulomuniz.app.core.exceptions.DomainNotFoundException;

@ControllerAdvice
public class RestControllerAdvice extends ResponseEntityExceptionHandler {

    @ExceptionHandler(value = DomainNotFoundException.class)
    protected ResponseEntity<Object> handleNotFound(RuntimeException e) {
        return ResponseEntity.status(HttpStatus.NOT_FOUND).body(
                new ApiResponse(e.getMessage(), HttpStatus.NOT_FOUND.value())
        );
    }

    @ExceptionHandler(value = DomainDuplicatedException.class)
    protected ResponseEntity<Object> handleConflict(RuntimeException e) {
        return ResponseEntity.status(HttpStatus.CONFLICT).body(
                new ApiResponse(e.getMessage(), HttpStatus.CONFLICT.value())
        );
    }
}
