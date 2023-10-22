package br.com.paulomuniz.app.core.usecase.task;

import java.util.List;

import br.com.paulomuniz.app.core.domain.Task;

public interface FindAllTaskUseCase {
    List<Task> execute();
}
