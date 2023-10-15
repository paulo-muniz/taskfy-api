package br.com.paulomuniz.core.usecase.task.builder;

import java.util.UUID;

import br.com.paulomuniz.core.domain.Task;

public class TaskBuilder {

    public static Task createTask() {
        return new Task(UUID.randomUUID(), "New Task", "An description");
    }
}
