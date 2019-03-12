package com.game.entity;

import lombok.Data;
import lombok.EqualsAndHashCode;
import lombok.ToString;

/**
 * Created by Administrator on 2019-03-12.
 */
@Data
@EqualsAndHashCode(callSuper = false)
@ToString(callSuper = true)
public class GameSchoolMasterGest extends BaseEntity {

    private Long schoolId;
    private Long masterId;
    private Long gestId;

}
