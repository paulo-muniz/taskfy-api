package br.com.paulomuniz.app.core.dataprovider.task;

import java.util.List;

import br.com.paulomuniz.app.core.domain.Task;

public interface FindAllTaskDataProvider {
    List<Task> execute();
}
