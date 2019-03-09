package com.game.dao;

import com.game.entity.GameUserAddress;

import java.util.List;
import java.util.Map;

/**
 * Created by Administrator on 2019/3/9.
 */
public interface GameUserAddressDao {

    public void insertOne(GameUserAddress gameUserAddress);

    public GameUserAddress getOne(Long userId);

    public void updateGameUserAddress(GameUserAddress gameUserAddress);

    public List<Map<String, String>> getUsersByCode(Map<String, Object> param);

}
