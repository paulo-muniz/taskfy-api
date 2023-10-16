package br.com.paulomuniz.app.core.usecase.task.builder;

import br.com.paulomuniz.app.core.domain.Task;

public class TaskBuilder {

    public static Task createTask() {
        return new Task("New Task", "An description");
    }
}
