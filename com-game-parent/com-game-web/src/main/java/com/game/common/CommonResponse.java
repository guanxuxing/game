package com.game.common;

import lombok.Data;
import lombok.EqualsAndHashCode;
import lombok.ToString;

/**
 * Created by Administrator on 2019-03-06.
 */
@Data
@EqualsAndHashCode(callSuper = false)
@ToString(callSuper = true)
public class CommonResponse {

    private String code;
    private String msg;
    private Object data;

    public CommonResponse(String code, String msg) {
        this.code = code;
        this.msg = msg;
    }

    public CommonResponse(String code, String msg, Object data) {
        this.code = code;
        this.msg = msg;
        this.data = data;
    }
}
