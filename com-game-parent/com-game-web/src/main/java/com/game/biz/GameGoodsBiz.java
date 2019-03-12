package com.game.biz;

import com.game.common.CommonResponse;
import com.game.entity.GameGoods;
import com.game.util.PageData;

import java.util.List;

/**
 * Created by Administrator on 2019/3/11.
 */
public interface GameGoodsBiz {

    public List<GameGoods> getListByType(Integer type);

    public GameGoods getOne(PageData pd);

    public CommonResponse buyGoods(PageData pd);

}
