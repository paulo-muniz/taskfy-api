package br.com.paulomuniz.app.presentation.api.config.beans;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import br.com.paulomuniz.app.core.usecase.task.impl.FindAllTaskUseCaseImpl;
import br.com.paulomuniz.app.infra.repository.impl.FindAllTaskDataProviderImpl;

@Configuration
public class FindAllTaskUseCaseConfig {

    @Bean
    public FindAllTaskUseCaseImpl findAllTaskUseCase(
            final FindAllTaskDataProviderImpl findAllTaskDataProvider
    ) {
        return new FindAllTaskUseCaseImpl(findAllTaskDataProvider);
    }
}
