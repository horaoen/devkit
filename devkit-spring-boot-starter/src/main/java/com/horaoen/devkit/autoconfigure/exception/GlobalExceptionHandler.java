package com.horaoen.devkit.autoconfigure.exception;

import cn.hutool.http.HttpStatus;
import com.horaoen.devkit.Result;
import com.horaoen.devkit.UnifiedResponse;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.RestControllerAdvice;

@RestControllerAdvice
public class GlobalExceptionHandler {
    @ExceptionHandler(value = Exception.class)
    public UnifiedResponse<?> handleException(Exception ex) {
        return Result.exception(ex, HttpStatus.HTTP_INTERNAL_ERROR);
    }
}
