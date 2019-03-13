package com.game.dao;

import com.game.entity.Game;
import com.game.entity.GameUser;

import java.util.List;
import java.util.Map;

/**
 * Created by Administrator on 2019-03-05.
 */
public interface GameUserDao {

    public GameUser getOne(GameUser gameUser);

    public Integer insertOne(GameUser gameUser);

    public Integer updatePwd(Map<String, String> map);

    public Integer updateAccount(GameUser gameUser);

    public Integer updateSchool(GameUser gameUser);

    public Integer updateMaster(GameUser gameUser);

    public List<Map<String, String>> getUserSchool(Long userId);

    public List<Map<String, String>> getUserGest(Long userId);

    public List<Map<String, String>> getUserGoods(Game game);
}
