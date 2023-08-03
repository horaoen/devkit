package com.horaoen.devkit.autoconfigure;

import com.horaoen.devkit.ExceptionDevkitProperties;
import org.springframework.boot.autoconfigure.AutoConfiguration;
import org.springframework.boot.autoconfigure.condition.ConditionalOnProperty;
import org.springframework.boot.context.properties.EnableConfigurationProperties;
import org.springframework.context.annotation.ComponentScan;

@AutoConfiguration
@ComponentScan("com.horaoen.devkit.autoconfigure.exception")
@ConditionalOnProperty(prefix = "devkit", name = "exception.enabled", matchIfMissing = true)
@EnableConfigurationProperties({ExceptionDevkitProperties.class})
public class ExceptionHandlerAutoConfiguration {
}
