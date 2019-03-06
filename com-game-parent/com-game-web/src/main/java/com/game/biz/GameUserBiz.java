package com.game.biz;

import com.game.common.CommonResponse;
import com.game.entity.GameUser;
import com.game.util.PageData;

/**
 * Created by Administrator on 2019-03-05.
 */
public interface GameUserBiz {

    public CommonResponse login(PageData pd);

    public Boolean reg(GameUser gameUser);
}
