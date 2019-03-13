package com.game.util.cont;

/**
 * Created by Administrator on 2019/3/13.
 * 0:生命 1:潜能 2: 内力 3:精神 4:防御 5:攻击
 */
public enum  UseTypeEnum {

    U_0("0", "生命"),
    U_1("0", "潜能"),
    U_2("2", "内力"),
    U_3("3", "精神"),
    U_4("4", "防御"),
    U_5("5", "攻击");

    private String code;
    private String value;

    private UseTypeEnum(String code, String value) {
        this.code = code;
        this.value = value;
    }

    public String getCode() {
        return code;
    }

    public String getValue() {
        return value;
    }

    public static UseTypeEnum resolve(String code) {
        UseTypeEnum useTypeEnum = null;
        for (UseTypeEnum object : UseTypeEnum.values()) {
            if (object.getCode().equals(code)) {
                return object;
            }
        }
        return useTypeEnum;
    }
}
