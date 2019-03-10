package com.game.entity;

import lombok.Data;
import lombok.EqualsAndHashCode;
import lombok.ToString;

/**
 * Created by Administrator on 2019/3/10.
 */
@Data
@EqualsAndHashCode(callSuper = false)
@ToString(callSuper = true)
public class GameNpc extends BaseEntity {
    private Long levelNum;
}
