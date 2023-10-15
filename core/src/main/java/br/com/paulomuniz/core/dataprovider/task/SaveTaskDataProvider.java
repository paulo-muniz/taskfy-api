package br.com.paulomuniz.core.dataprovider.task;

import br.com.paulomuniz.core.domain.Task;

public interface SaveTaskDataProvider {
    Task execute(final Task task);
}
