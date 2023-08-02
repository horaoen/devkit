package com.horaoen.devkit.boot;

import org.springframework.boot.autoconfigure.AutoConfiguration;
import org.springframework.boot.autoconfigure.condition.ConditionalOnProperty;
import org.springframework.context.annotation.Bean;

@AutoConfiguration
@ConditionalOnProperty(name = "devkit.exception.enabled")
public class ExceptionHandlerAutoConfiguration {
}
