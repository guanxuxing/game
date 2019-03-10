package com.game.dao;

import com.game.entity.GameMap;

/**
 * Created by Administrator on 2019/3/10.
 */
public interface GameMapDao {

    public GameMap getOne(String addressCode);

    public GameMap getCon(GameMap gameMap);
}
