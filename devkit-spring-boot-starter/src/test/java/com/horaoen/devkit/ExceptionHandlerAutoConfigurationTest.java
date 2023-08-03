package com.horaoen.devkit;

import com.horaoen.devkit.autoconfigure.ExceptionHandlerAutoConfiguration;
import com.horaoen.devkit.autoconfigure.exception.GlobalExceptionHandler;
import org.junit.jupiter.api.Test;
import org.springframework.boot.autoconfigure.AutoConfigurations;
import org.springframework.boot.test.context.runner.ApplicationContextRunner;

import static org.assertj.core.api.Assertions.assertThat;

public class ExceptionHandlerAutoConfigurationTest {
    @Test
    void hasGlobalExceptionHandlerTest() {
        ApplicationContextRunner contextRunner = new
                ApplicationContextRunner()
                .withPropertyValues("devkit.exception.enabled=true")
                .withConfiguration(AutoConfigurations.of(ExceptionHandlerAutoConfiguration.class));
        contextRunner.run((context) -> assertThat(context).hasSingleBean(GlobalExceptionHandler.class));
    }
    @Test
    void doesNotHaveExceptionHandlerTest() {
        ApplicationContextRunner contextRunner = new
                ApplicationContextRunner()
                .withPropertyValues("devkit.exception.enabled=false")
                .withConfiguration(AutoConfigurations.of(ExceptionHandlerAutoConfiguration.class));
        contextRunner.run((context) -> assertThat(context).doesNotHaveBean(GlobalExceptionHandler.class));
    }
}

