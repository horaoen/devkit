package com.horaoen.devkit;

import lombok.Getter;
import lombok.Setter;
import org.springframework.boot.context.properties.ConfigurationProperties;

@ConfigurationProperties(prefix = "devkit.response")
@Setter
@Getter
public class ResponseDevkitProperties {
    private boolean enabled = true;
}
