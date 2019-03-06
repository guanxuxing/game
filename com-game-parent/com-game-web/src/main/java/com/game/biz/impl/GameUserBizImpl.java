package com.game.biz.impl;

import com.game.biz.GameUserBiz;
import com.game.dao.GameUserDao;
import com.game.entity.GameUser;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;

/**
 * Created by Administrator on 2019-03-05.
 */
@Service
public class GameUserBizImpl implements GameUserBiz {

    @Resource
    private GameUserDao gameUserDao;

    public Boolean login(GameUser gameUser) {
        gameUser = gameUserDao.getOne(gameUser);
        return true;
    }
}
