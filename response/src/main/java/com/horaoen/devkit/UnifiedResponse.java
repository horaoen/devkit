package com.horaoen.devkit;

import lombok.AccessLevel;
import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

@Getter(AccessLevel.PROTECTED)
@Setter(AccessLevel.PROTECTED)
@ToString
public class UnifiedResponse<T> {
    private boolean success;
    
    private T data;
    
    private Integer code;
    
    private String errMsg;
}
