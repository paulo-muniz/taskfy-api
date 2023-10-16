package br.com.paulomuniz.app.presentation.api.config.beans;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import br.com.paulomuniz.app.core.usecase.task.impl.FindByIdTaskUseCaseImpl;
import br.com.paulomuniz.app.infra.repository.impl.FindByIdTaskDataProviderImpl;

@Configuration
public class FindByIdTaskUseCaseConfig {

    @Bean
    FindByIdTaskUseCaseImpl findByIdTaskUseCase(final FindByIdTaskDataProviderImpl findByIdTaskDataProvider) {
        return new FindByIdTaskUseCaseImpl(findByIdTaskDataProvider);
    }
}
