package br.com.paulomuniz.core.usecase.task;

import static org.junit.jupiter.api.Assertions.assertNotNull;
import static org.mockito.ArgumentMatchers.any;
import static org.mockito.Mockito.doNothing;
import static org.mockito.Mockito.when;

import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.mockito.InjectMocks;
import org.mockito.Mock;
import org.mockito.junit.jupiter.MockitoExtension;

import br.com.paulomuniz.core.dataprovider.task.SaveTaskDataProvider;
import br.com.paulomuniz.core.domain.Task;
import br.com.paulomuniz.core.usecase.task.builder.TaskBuilder;
import br.com.paulomuniz.core.usecase.task.impl.CreateTaskUseCaseImpl;

@ExtendWith(MockitoExtension.class)
class CreateTaskUseCaseTest {

    @Mock
    private ValidateDuplicatedTaskUseCase validateDuplicatedTaskUseCase;

    @Mock
    private SaveTaskDataProvider saveTaskDataProvider;

    @InjectMocks
    private CreateTaskUseCaseImpl createTaskUseCase;

    @Test
    void createTask_shouldCreateAnTask_whenCalled() {
        var task = TaskBuilder.createTask();

        doNothing().when(this.validateDuplicatedTaskUseCase).execute(task.getId());
        when(this.saveTaskDataProvider.execute(any(Task.class))).thenReturn(task);

        var createdTask = this.createTaskUseCase.execute(task);

        assertNotNull(createdTask);
    }
}