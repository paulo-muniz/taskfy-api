package br.com.paulomuniz.app.presentation.api.config.beans;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import br.com.paulomuniz.app.core.usecase.task.impl.ValidateDuplicatedTaskUseCaseImpl;
import br.com.paulomuniz.app.infra.repository.impl.FindByIdTaskDataProviderImpl;

@Configuration
public class ValidateDupliatedTaskUseCaseConfig {

    @Bean
    ValidateDuplicatedTaskUseCaseImpl validateDuplicatedTaskUseCase(
            final FindByIdTaskDataProviderImpl findByIdTaskDataProvider
    ) {
        return new ValidateDuplicatedTaskUseCaseImpl(findByIdTaskDataProvider);
    }
}
