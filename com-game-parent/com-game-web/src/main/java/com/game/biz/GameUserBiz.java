package com.game.biz;

import com.game.common.CommonResponse;
import com.game.entity.GameUser;
import com.game.util.PageData;
import com.github.pagehelper.Page;

import java.util.Map;

/**
 * Created by Administrator on 2019-03-05.
 */
public interface GameUserBiz {

    public CommonResponse login(PageData pd);

    public CommonResponse reg(PageData pd);

    public CommonResponse upd(PageData pd);

    public Map<String, Object> getUserInfo(PageData pd);
}
