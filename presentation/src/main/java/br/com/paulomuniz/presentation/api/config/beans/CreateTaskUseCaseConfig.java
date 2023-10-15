package br.com.paulomuniz.presentation.api.config.beans;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import br.com.paulomuniz.core.usecase.task.impl.CreateTaskUseCaseImpl;
import br.com.paulomuniz.core.usecase.task.impl.ValidateDuplicatedTaskUseCaseImpl;
import br.com.paulomuniz.infra.repository.impl.SaveTaskDataProviderImpl;

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
