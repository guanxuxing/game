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
    private String nickName;
    private String userName;
    private String passWord;
    private String mark;
    private Long levelNum;
    private Double account;
    private Long schoolId;
    private Long masterId;
    private Long currentExperNum;
    private Long maxExperNum;
    private Long currentLifeNum;
    private Long maxLifeNum;
    private Long currentMindNum;
    private Long maxMindNum;
    private Long currentForceNum;
    private Long maxForceNum;

}
