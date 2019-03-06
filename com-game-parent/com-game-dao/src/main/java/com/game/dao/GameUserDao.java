package com.game.dao;

import com.game.entity.GameUser;

/**
 * Created by Administrator on 2019-03-05.
 */
public interface GameUserDao {

    public GameUser getOne(GameUser gameUser);

    public Integer insertOne(GameUser gameUser);
}
