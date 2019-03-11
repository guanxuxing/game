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
public class GameUser extends BaseEntity  {

    private String mobile;
    private String userName;
    private String passWord;
    private String mark;
    private Double account;
    private Long schoolId;
    private Long userExper;
    private Long leftNum;

}
