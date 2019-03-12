package com.game.biz;

import com.game.entity.GameSchool;
import com.game.util.PageData;

import java.util.List;
import java.util.Map;

/**
 * Created by Administrator on 2019/3/12.
 */
public interface GameSchoolBiz {

    // 帮派排行
    public List<GameSchool> getSchoolList(PageData pd);
}
