package com.horaoen.devkit;

public enum CustomErrType implements ErrType{
    NULL_ID(1001, "id不能为空");
    final Integer code;
    final String errMsg;

    CustomErrType(Integer code, String errMsg) {
        this.code = code;
        this.errMsg = errMsg;
    }

    @Override
    public Integer getCode() {
        return this.code;
    }

    @Override
    public String getErrMsg() {
        return this.errMsg;
    }
}
