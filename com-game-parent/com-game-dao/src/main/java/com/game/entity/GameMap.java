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
public class GameMap extends BaseEntity{

    private String addressCode;
    private String addressName;
    private String text;
    private String npcCode;
    private String npcName;
    private String npcPlanCodeName;
    private String npcPlanCodeName1;
    private String direction;


}
