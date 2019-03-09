package com.game.biz;

import com.game.common.CommonResponse;
import com.game.entity.GamePubChat;
import com.game.util.PageData;

import java.util.List;
import java.util.Map;

/**
 * Created by Administrator on 2019/3/9.
 */
public interface GamePubChatBiz {

    public CommonResponse pubChat(PageData pd);

    public List<Map<String, String>> getList();
}
