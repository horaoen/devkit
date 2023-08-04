package com.horaoen.devkit.autoconfigure.response;


import com.horaoen.devkit.Result;
import com.horaoen.devkit.UnifiedResponse;
import org.springframework.core.MethodParameter;
import org.springframework.http.MediaType;
import org.springframework.http.converter.HttpMessageConverter;
import org.springframework.http.server.ServerHttpRequest;
import org.springframework.http.server.ServerHttpResponse;
import org.springframework.web.bind.annotation.RestControllerAdvice;
import org.springframework.web.servlet.mvc.method.annotation.ResponseBodyAdvice;

import java.util.Objects;

@RestControllerAdvice
public class UnifiedResponseAdvice implements ResponseBodyAdvice<Object> {
    @Override
    public boolean supports(MethodParameter methodParameter,
                            Class<? extends HttpMessageConverter<?>> aClass) {

        if (methodParameter.getDeclaringClass()
                .isAnnotationPresent(IgnoreResponseAdvice.class)) {
            return false;
        }

        return !Objects.requireNonNull(methodParameter.getMethod()).isAnnotationPresent(IgnoreResponseAdvice.class);
    }

    @Override
    public Object beforeBodyWrite(Object o, MethodParameter methodParameter,
                                                   MediaType mediaType,
                                                   Class<? extends HttpMessageConverter<?>> aClass,
                                                   ServerHttpRequest serverHttpRequest,
                                                   ServerHttpResponse serverHttpResponse) {
        if (o instanceof UnifiedResponse) {
            return o;
        } else {
            return Result.ok(o);
        }
    }
}
