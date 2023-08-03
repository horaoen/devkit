package com.horaoen.devkit.autoconfigure.exception;

import com.horaoen.devkit.Result;
import com.horaoen.devkit.UnifiedResponse;
import jakarta.servlet.http.HttpServletResponse;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.RestControllerAdvice;

@RestControllerAdvice
public class GlobalExceptionHandler {
    @ExceptionHandler(value = Exception.class)
    public UnifiedResponse<?> handleException(Exception ex, HttpServletResponse httpResponse) {
        return Result.exception(ex, httpResponse.getStatus());
    }
}
