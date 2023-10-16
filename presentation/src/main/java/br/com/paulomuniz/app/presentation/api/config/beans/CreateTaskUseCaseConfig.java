package br.com.paulomuniz.app.presentation.api.config.beans;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import br.com.paulomuniz.app.core.usecase.task.impl.CreateTaskUseCaseImpl;
import br.com.paulomuniz.app.core.usecase.task.impl.ValidateDuplicatedTaskUseCaseImpl;
import br.com.paulomuniz.app.infra.repository.impl.SaveTaskDataProviderImpl;

@Configuration
public class CreateTaskUseCaseConfig {

    @Bean
    CreateTaskUseCaseImpl createTaskUseCase(
            final SaveTaskDataProviderImpl saveTaskDataProvider,
            final ValidateDuplicatedTaskUseCaseImpl validateDuplicatedTaskUseCase
    ) {
        return new CreateTaskUseCaseImpl(saveTaskDataProvider, validateDuplicatedTaskUseCase);
    }
}
