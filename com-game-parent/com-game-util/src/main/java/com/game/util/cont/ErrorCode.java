package com.game.util.cont;

/**
 * Created by Administrator on 2019-03-06.
 *
 */
public enum  ErrorCode {

    E0000("0000", "成功"),
    E0001("0001", "失败"),
    E0002("0002", "参数不完整"),
    E0003("0003", "信息不存在"),
    E0004("0004", "添加信息已存在"),
    E9999("9999", "请稍后再试");  // 异常(Exception)提示

    private String code;
    private String value;

    private ErrorCode(String code, String value) {
        this.code = code;
        this.value = value;
    }

    public String getCode() {
        return code;
    }

    public String getValue() {
        return value;
    }

    public static ErrorCode resolve(String code) {
        ErrorCode errorCode = null;
        for (ErrorCode object : ErrorCode.values()) {
            if (object.getCode().equals(code)) {
                return object;
            }
        }
        return errorCode;
    }
}
