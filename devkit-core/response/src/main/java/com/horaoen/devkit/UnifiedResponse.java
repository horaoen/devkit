package com.horaoen.devkit;

import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

import java.io.Serializable;

@Getter
@Setter
@ToString
public class UnifiedResponse<T> implements Serializable {
    private boolean success;
    
    private T data;
    
    private Integer code;
    
    private String errMsg;
}
