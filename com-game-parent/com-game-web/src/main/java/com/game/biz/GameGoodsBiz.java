package com.game.biz;

import com.game.entity.GameGoods;

import java.util.List;

/**
 * Created by Administrator on 2019/3/11.
 */
public interface GameGoodsBiz {

    public List<GameGoods> getListByType(Integer type);

}
