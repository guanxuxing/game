package com.game.util;

import lombok.Data;
import lombok.EqualsAndHashCode;
import lombok.ToString;

/**
 * Created by Administrator on 2019/3/9.
 */
@Data
@EqualsAndHashCode(callSuper = false)
@ToString(callSuper = true)
public class DirectionAim {

    private String code;
    private String name;
    private String aim;
    private String align;
}
