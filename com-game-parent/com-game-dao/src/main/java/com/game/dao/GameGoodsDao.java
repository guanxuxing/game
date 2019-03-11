package com.game.dao;

import com.game.entity.GameGoods;
import java.util.List;

/**
 * Created by Administrator on 2019/3/11.
 */
public interface GameGoodsDao {

    public List<GameGoods> getListByType(Integer type);

}
