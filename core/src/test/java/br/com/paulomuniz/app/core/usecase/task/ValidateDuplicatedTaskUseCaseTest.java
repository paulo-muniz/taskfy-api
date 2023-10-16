package br.com.paulomuniz.app.core.usecase.task;

import static org.junit.jupiter.api.Assertions.assertDoesNotThrow;
import static org.junit.jupiter.api.Assertions.assertThrows;
import static org.mockito.Mockito.any;
import static org.mockito.Mockito.when;

import java.util.Optional;
import java.util.UUID;

import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.mockito.InjectMocks;
import org.mockito.Mock;
import org.mockito.junit.jupiter.MockitoExtension;

import br.com.paulomuniz.app.core.dataprovider.task.FindByIdTaskDataProvider;
import br.com.paulomuniz.app.core.exceptions.task.DuplicatedTaskException;
import br.com.paulomuniz.app.core.usecase.task.builder.TaskBuilder;
import br.com.paulomuniz.app.core.usecase.task.impl.ValidateDuplicatedTaskUseCaseImpl;

@ExtendWith(MockitoExtension.class)
class ValidateDuplicatedTaskUseCaseTest {

    @Mock
    private FindByIdTaskDataProvider findByIdTaskDataProvider;

    @InjectMocks
    private ValidateDuplicatedTaskUseCaseImpl validateDuplicatedTaskUseCase;

    @Test
    void validateDuplicatedTask_shouldDoNothing_whenCalled() {
        var task = TaskBuilder.createTask();

        when(this.findByIdTaskDataProvider.execute(any(UUID.class))).thenReturn(Optional.empty());

        assertDoesNotThrow(() -> this.validateDuplicatedTaskUseCase.execute(task.getId()));
    }

    @Test
    void validateDuplicatedTask_shouldThrowException_whenCalledWithAnDuplicatedTask() {
        var task = TaskBuilder.createTask();
        var id = task.getId();

        when(this.findByIdTaskDataProvider.execute(any(UUID.class))).thenReturn(Optional.of(task));

        assertThrows(DuplicatedTaskException.class, () -> this.validateDuplicatedTaskUseCase.execute(id));
    }
}