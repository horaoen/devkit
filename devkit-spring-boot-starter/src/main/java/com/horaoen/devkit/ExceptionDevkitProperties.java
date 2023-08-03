package com.horaoen.devkit;

import lombok.Getter;
import lombok.Setter;
import org.springframework.boot.context.properties.ConfigurationProperties;

@ConfigurationProperties(prefix = "devkit.exception")
@Setter
@Getter
public class ExceptionDevkitProperties {
    private boolean enabled = true;
}
