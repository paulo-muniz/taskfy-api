package br.com.paulomuniz.app.core.usecase.task;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertFalse;
import static org.junit.jupiter.api.Assertions.assertTrue;
import static org.mockito.Mockito.when;

import java.util.Collections;

import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.mockito.InjectMocks;
import org.mockito.Mock;
import org.mockito.junit.jupiter.MockitoExtension;

import br.com.paulomuniz.app.core.dataprovider.task.FindAllTaskDataProvider;
import br.com.paulomuniz.app.core.domain.Task;
import br.com.paulomuniz.app.core.usecase.task.builder.TaskBuilder;
import br.com.paulomuniz.app.core.usecase.task.impl.FindAllTaskUseCaseImpl;

@ExtendWith(MockitoExtension.class)
class FindAllTaskUseCaseTest {

    @Mock
    private FindAllTaskDataProvider findAllTaskDataProvider;

    @InjectMocks
    private FindAllTaskUseCaseImpl findAllTaskUseCase;

    @Test
    void findAll_shouldReturn_whenCalled() {
        var tasks = Collections.singletonList(TaskBuilder.createTask());

        when(this.findAllTaskDataProvider.execute()).thenReturn(tasks);

        var expectedTasks = findAllTaskUseCase.execute();

        assertFalse(expectedTasks.isEmpty());
        assertEquals(Task.class, expectedTasks.get(0).getClass());
    }

    @Test
    void findAll_shouldReturnAnEmptyList_whenCalled() {
        when(this.findAllTaskDataProvider.execute()).thenReturn(Collections.emptyList());

        var expectedTasks = findAllTaskUseCase.execute();

        assertTrue(expectedTasks.isEmpty());
    }
}