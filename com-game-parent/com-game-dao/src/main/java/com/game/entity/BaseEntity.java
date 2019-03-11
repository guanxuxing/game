package com.game.entity;

import lombok.Data;
import lombok.EqualsAndHashCode;
import lombok.ToString;

/**
 * Created by Administrator on 2019-03-05.
 */
@Data
@EqualsAndHashCode(callSuper = false)
@ToString(callSuper = true)
public class BaseEntity {

    private Long id;
    private Long addTime;
    private Long updateTime;
    private Long addUser;
    private Long updateUser;

    private String code;
    private String name;
    private String desc;
    private Long levelNum;
}
