package com.uj.study.common.exception;

import com.uj.study.common.util.ExceptionUtil;

/**
 * @author ：UncleJet
 * @date ：Created in 2021/7/6 上午9:55
 * @description：
 */
public enum CommonError {

    /**
     * 1001, "用户信息为空"
     */
    AUTH_EMPTY_ERROR(10001, "the user is null, please check");

    private Integer code;
    private String message;

    CommonError(Integer code, String message) {
        this.code = code;
        this.message = message;
    }

    public Integer getCode() {
        return code;
    }

    public void setCode(Integer code) {
        this.code = code;
    }

    public String getMessage() {
        return message;
    }

    public void setMessage(String message) {
        this.message = message;
    }

    public String getCodeEn() {
        return ExceptionUtil.errorToCodeEN(this);
    }

}

