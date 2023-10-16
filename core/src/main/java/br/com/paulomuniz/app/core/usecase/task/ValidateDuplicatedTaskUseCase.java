package br.com.paulomuniz.app.core.usecase.task;

import java.util.UUID;

public interface ValidateDuplicatedTaskUseCase {
    void execute(final UUID id);
}
