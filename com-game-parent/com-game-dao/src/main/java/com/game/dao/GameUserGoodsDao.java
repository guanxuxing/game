package com.game.dao;

import com.game.entity.GameUserGoods;

/**
 * Created by Administrator on 2019-03-12.
 */
public interface GameUserGoodsDao {

    public Integer addObject(GameUserGoods gameUserGoods);

    public GameUserGoods getObject(GameUserGoods gameUserGoods);

    public Integer updateObject(GameUserGoods gameUserGoods);
}
