package com.horaoen.devkit.boot;

import org.springframework.boot.autoconfigure.AutoConfiguration;
import org.springframework.boot.autoconfigure.condition.ConditionalOnProperty;
import org.springframework.context.annotation.Bean;

@AutoConfiguration
@ConditionalOnProperty(prefix = "devkit", name = "exception.enabled", matchIfMissing = true)
public class ExceptionHandlerAutoConfiguration {
    @Bean
    public MyBean myBean() {
        return new MyBean();
    }
}
