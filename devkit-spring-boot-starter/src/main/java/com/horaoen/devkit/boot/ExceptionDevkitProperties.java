package com.horaoen.devkit.boot;

import lombok.Getter;
import lombok.Setter;
import org.springframework.boot.context.properties.ConfigurationProperties;

@ConfigurationProperties("devkit.exception")
@Getter
@Setter
public class ExceptionDevkitProperties {
    private boolean enabled = true;
}
