package br.com.paulomuniz.core.usecase.task;

import static org.junit.jupiter.api.Assertions.assertDoesNotThrow;
import static org.junit.jupiter.api.Assertions.assertNotNull;
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

import br.com.paulomuniz.core.dataprovider.task.FindByIdTaskDataProvider;
import br.com.paulomuniz.core.exceptions.task.NotFoundTaskException;
import br.com.paulomuniz.core.usecase.task.builder.TaskBuilder;
import br.com.paulomuniz.core.usecase.task.impl.FindByIdTaskUseCaseImpl;

@ExtendWith(MockitoExtension.class)
class FindByIdTaskUseCaseTest {

    @Mock
    private FindByIdTaskDataProvider findByIdTaskDataProvider;

    @InjectMocks
    private FindByIdTaskUseCaseImpl findByIdTaskUseCase;

    @Test
    void findByIdTask_shouldReturn_whenCalled() {
        var task = TaskBuilder.createTask();

        when(this.findByIdTaskDataProvider.execute(any(UUID.class))).thenReturn(Optional.of(task));

        var taskFounded = findByIdTaskUseCase.execute(task.getId());

        assertNotNull(taskFounded);
        assertDoesNotThrow(() -> taskFounded);
    }

    @Test
    void findByIdTask_shouldThrowException_whenCalled() {
        var task = TaskBuilder.createTask();
        var id = task.getId();

        when(this.findByIdTaskDataProvider.execute(any(UUID.class))).thenReturn(Optional.empty());

        assertThrows(NotFoundTaskException.class, () -> findByIdTaskUseCase.execute(id));
    }
}