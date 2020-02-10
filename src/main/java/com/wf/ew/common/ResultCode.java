package com.wf.ew.common;

public enum ResultCode {
    SUCCESS(200, "success"),
    PARAMETER_ERROR(400, "参数错误"),
    ERROR(500, "error");
    private int code;
    private String msg;

    ResultCode(int code, String msg) {
        this.code = code;
        this.msg = msg;
    }

    public int code() {
        return code;
    }

    public String msg() {
        return msg;
    }
}
