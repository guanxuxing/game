package com.game.biz.impl;

import com.game.biz.GameSchoolBiz;
import com.game.dao.GameSchoolDao;
import com.game.entity.GameSchool;
import com.game.util.PageData;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;
import java.util.List;

/**
 * Created by Administrator on 2019/3/12.
 */
@Service
public class GameSchoolBizImpl implements GameSchoolBiz {

   @Resource
   private GameSchoolDao gameSchoolDao;

    public List<GameSchool> getSchoolList(PageData pd) {
        return gameSchoolDao.getSchoolList();
    }
}
