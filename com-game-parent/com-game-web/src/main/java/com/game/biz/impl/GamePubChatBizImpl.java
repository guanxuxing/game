package com.game.biz.impl;

import com.game.biz.GamePubChatBiz;
import com.game.common.CommonResponse;
import com.game.controller.base.Session;
import com.game.dao.GamePubChatDao;
import com.game.entity.GamePubChat;
import com.game.entity.GameUser;
import com.game.util.Constant;
import com.game.util.DateUtil;
import com.game.util.PageData;
import com.game.util.cont.ErrorCode;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;
import java.util.Date;
import java.util.List;
import java.util.Map;

/**
 * Created by Administrator on 2019/3/9.
 */
@Service
public class GamePubChatBizImpl implements GamePubChatBiz {

    @Resource
    private GamePubChatDao gamePubChatDao;

    public CommonResponse pubChat(PageData pd) {
        CommonResponse response = new CommonResponse(ErrorCode.E0001.getCode(), ErrorCode.E0001.getValue());
        GameUser gameUser = Session.getCurrentUser();
        GamePubChat gamePubChat = new GamePubChat();
        gamePubChat.setUserId(gameUser.getId());
        gamePubChat.setChatText((String) pd.get("chatText"));
        gamePubChat.setAddTime(System.currentTimeMillis());
        gamePubChat.setChatTime(DateUtil.sdfTime.format(new Date()));
        Integer key = gamePubChatDao.insertOne(gamePubChat);
        if (Constant.SUCCESS_CODE.equals(key)) {
            response = new CommonResponse(ErrorCode.E0000.getCode(), ErrorCode.E0000.getValue());
        }
        return response;
    }

    public List<Map<String, String>> getList() {
        return gamePubChatDao.getList();
    }
}
