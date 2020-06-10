package com.jxc.mettingroom.mettingroom.util;

public enum ResultCode {

    SUCCESS(200,"SUCCESS"), //成功
    FAIL(400,"FAIL"),//失败
    UNAUTHORIZED(401,"未认证/未授权"),//未认证（签名错误）
    NOT_FOUND(404,"接口不存在"),//接口不存在
    SERVER_ERROR(500,"服务器内部错误"),//服务器内部错误
    BUSINESS_ERROR(501,"业务层错误"),
    PARAMS_ERROR(502,"参数错误"),
    ID_ERROR(503,"id错误"),
    TOKEN_EXPIRE(426,"token已过期，请重新登录"),

    ;

    private final int code;
    private final String message;

    ResultCode(int code, String message) {
        this.code = code;
        this.message = message;
    }

    public int code() {
        return code;
    }

    public String message() {
        return message;
    }
}
