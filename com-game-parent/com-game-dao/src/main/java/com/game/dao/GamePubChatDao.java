package com.game.dao;

import com.game.entity.GamePubChat;

import java.util.List;
import java.util.Map;

/**
 * Created by Administrator on 2019/3/9.
 */
public interface GamePubChatDao {

    public Integer insertOne(GamePubChat gamePubChat);

    public List<Map<String, String>> getList();

}
