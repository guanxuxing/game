package com.game.biz.impl;

import com.game.biz.GameGoodsBiz;
import com.game.dao.GameGoodsDao;
import com.game.entity.GameGoods;
import com.game.util.Constant;
import org.springframework.stereotype.Service;
import javax.annotation.Resource;
import java.util.List;

/**
 * Created by Administrator on 2019/3/11.
 */
@Service
public class GameGoodsBizImpl implements GameGoodsBiz {

    @Resource
    private GameGoodsDao gameGoodsDao;


    public List<GameGoods> getListByType(Integer type) {
        return gameGoodsDao.getListByType(type);
    }
}
