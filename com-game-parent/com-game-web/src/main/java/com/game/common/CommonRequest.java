package com.game.common;

import lombok.Data;
import lombok.EqualsAndHashCode;
import lombok.ToString;

/**
 * Created by Administrator on 2019-03-05.
 */
@Data
@EqualsAndHashCode(callSuper = false)
@ToString(callSuper = true)
public class CommonRequest {

    private String userName;
}
