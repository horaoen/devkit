package com.horaoen.devkit.autoconfigure;

import com.alibaba.fastjson.serializer.SerializerFeature;
import com.alibaba.fastjson.support.config.FastJsonConfig;
import com.alibaba.fastjson.support.spring.FastJsonHttpMessageConverter;
import com.horaoen.devkit.ResponseDevkitProperties;
import org.springframework.boot.autoconfigure.AutoConfiguration;
import org.springframework.boot.autoconfigure.condition.ConditionalOnProperty;
import org.springframework.boot.autoconfigure.http.HttpMessageConverters;
import org.springframework.boot.context.properties.EnableConfigurationProperties;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.http.MediaType;

import java.util.ArrayList;
import java.util.List;

@AutoConfiguration
@ComponentScan("com.horaoen.devkit.autoconfigure.response")
@ConditionalOnProperty(prefix = "devkit", name = "response.enabled", matchIfMissing = true)
@EnableConfigurationProperties({ResponseDevkitProperties.class})
public class UnifiedResponseAutoConfiguration {
    @Bean
    public HttpMessageConverters customHttpMessageConverter() {
        FastJsonHttpMessageConverter converter = new FastJsonHttpMessageConverter();
        FastJsonConfig fastJsonConfig = new FastJsonConfig();
        fastJsonConfig.setSerializerFeatures(SerializerFeature.DisableCircularReferenceDetect);
        converter.setFastJsonConfig(fastJsonConfig);
        List<MediaType> supportedMediaTypes = new ArrayList<>();
        supportedMediaTypes.add(MediaType.APPLICATION_JSON);
        converter.setSupportedMediaTypes(supportedMediaTypes);
        return new HttpMessageConverters(converter);
    }
}
