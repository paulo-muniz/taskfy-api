package br.com.paulomuniz.app.core.dataprovider.task;

import br.com.paulomuniz.app.core.domain.Task;

public interface SaveTaskDataProvider {
    Task execute(final Task task);
}
