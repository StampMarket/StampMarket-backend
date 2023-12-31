package com.stampmarket.common.pojo;

import lombok.Data;

import java.io.Serializable;

/**
 * 统一响应结果类
 */
@Data
public class Result<T> implements Serializable {
    private final int code;
    private final String msg;
    private final T data;

    public Result(int code, String msg, T data) {
        this.code = code;
        this.msg = msg;
        this.data = data;
    }

    public static <T> Result<T> success() {
        return new Result<>(1, "OK", null);
    }

    public static <T> Result<T> success(T data) {
        return new Result<>(1, "OK", data);
    }

    public static <T> Result<T> error(String msg) {
        return new Result<>(0, msg, null);
    }
}
