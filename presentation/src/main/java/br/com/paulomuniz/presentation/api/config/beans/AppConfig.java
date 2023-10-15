package br.com.paulomuniz.presentation.api.config.beans;

import org.springframework.boot.autoconfigure.domain.EntityScan;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.data.jpa.repository.config.EnableJpaRepositories;

@Configuration
@EntityScan(basePackages = "br.com.paulomuniz.infra.entity")
@ComponentScan(basePackages = {"br.com.paulomuniz.infra.repository", "br.com.paulomuniz.core.usecase"})
@EnableJpaRepositories(basePackages = "br.com.paulomuniz.infra.repository")
public class AppConfig {
}
