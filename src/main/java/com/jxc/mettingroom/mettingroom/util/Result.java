package com.jxc.mettingroom.mettingroom.util;


import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

/**
 * 统一API响应结果封装
 */
@Data
@NoArgsConstructor
@AllArgsConstructor
@Builder
public class Result<T> {

    private int code;
    private String message;
    private T data;

    public static com.jxc.mettingroom.mettingroom.util.Result success() {
        return com.jxc.mettingroom.mettingroom.util.Result.builder()
                .code(com.jxc.mettingroom.mettingroom.util.ResultCode.SUCCESS.code())
                .message(com.jxc.mettingroom.mettingroom.util.ResultCode.SUCCESS.message())
                .build();
    }

    public static com.jxc.mettingroom.mettingroom.util.Result success(Object data) {
        return com.jxc.mettingroom.mettingroom.util.Result.builder()
                .code(com.jxc.mettingroom.mettingroom.util.ResultCode.SUCCESS.code())
                .message(com.jxc.mettingroom.mettingroom.util.ResultCode.SUCCESS.message())
                .data(data)
                .build();
    }

    public static com.jxc.mettingroom.mettingroom.util.Result fail(String message) {
        return com.jxc.mettingroom.mettingroom.util.Result.builder()
                .code(com.jxc.mettingroom.mettingroom.util.ResultCode.FAIL.code())
                .message(message)
                .build();
    }

    public static com.jxc.mettingroom.mettingroom.util.Result fail() {
        return com.jxc.mettingroom.mettingroom.util.Result.builder()
                .code(com.jxc.mettingroom.mettingroom.util.ResultCode.FAIL.code())
                .message(com.jxc.mettingroom.mettingroom.util.ResultCode.FAIL.message())
                .build();
    }

    public static com.jxc.mettingroom.mettingroom.util.Result fail(com.jxc.mettingroom.mettingroom.util.ResultCode resultCode) {
        return com.jxc.mettingroom.mettingroom.util.Result.builder()
                .code(resultCode.code())
                .message(resultCode.message())
                .build();
    }
}
