package com.game.entity;

import lombok.Data;
import lombok.EqualsAndHashCode;
import lombok.ToString;

/**
 * Created by Administrator on 2019-03-11.
 */
@Data
@EqualsAndHashCode(callSuper = false)
@ToString(callSuper = true)
public class GameGoods extends BaseEntity {

    private Double price;
    private String priceDesc;
    private Integer type;
    private Integer maxBuy;
}
