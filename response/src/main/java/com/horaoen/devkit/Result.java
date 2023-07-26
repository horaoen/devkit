package com.horaoen.devkit;

import cn.hutool.http.HttpStatus;

public class Result {
    public static <T> UnifiedResponse<T> ok(T data) {
        UnifiedResponse<T> response = new UnifiedResponse<T>();
        response.setSuccess(true);
        response.setData(data);
        response.setCode(HttpStatus.HTTP_OK);
        return response;
    }
    
    public static UnifiedResponse<?> error(String errMsg) {
        UnifiedResponse<?> response = new UnifiedResponse<>();
        response.setSuccess(false);
        response.setCode(HttpStatus.HTTP_BAD_REQUEST);
        response.setErrMsg(errMsg);
        return response;
    }

    /**
      * @param errType 传递一个继承自errType的枚举
     */ 
    public static UnifiedResponse<?> error(ErrType errType) {
        UnifiedResponse<?> response = new UnifiedResponse<>();
        response.setSuccess(false);
        response.setCode(errType.getCode());
        response.setErrMsg(errType.getErrMsg());
        return response;
    }
}
