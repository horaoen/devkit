package com.horaoen.devkit;

import com.horaoen.devkit.boot.ExceptionHandlerAutoConfiguration;
import org.junit.jupiter.api.Test;
import org.springframework.boot.autoconfigure.AutoConfigurations;
import org.springframework.boot.test.context.runner.ApplicationContextRunner;

import static org.assertj.core.api.Assertions.assertThat;

public class ExceptionHandlerAutoConfigurationTest {
    private final ApplicationContextRunner contextRunner = new
            ApplicationContextRunner()
            .withConfiguration(AutoConfigurations.of(ExceptionHandlerAutoConfiguration.class));

    @Test
    void test() {
        this.contextRunner.run((context) -> {
            assertThat(context).hasSingleBean(Application.class);
            assertThat(context).getBean("myCustomService").isSameAs(context.getBean(Application.class));
        });

    }
}

