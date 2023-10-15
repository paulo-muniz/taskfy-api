package br.com.paulomuniz.core.usecase.task;

import java.util.UUID;

public interface ValidateDuplicatedTaskUseCase {
    void execute(final UUID id);
}
