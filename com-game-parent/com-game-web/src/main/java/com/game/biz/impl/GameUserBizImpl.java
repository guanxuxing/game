package com.game.biz.impl;

import com.game.biz.GameUserBiz;
import com.game.common.CommonResponse;
import com.game.dao.GameUserDao;
import com.game.entity.GameUser;
import com.game.util.PageData;
import com.game.util.cont.ErrorCode;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;
import java.util.Date;

/**
 * Created by Administrator on 2019-03-05.
 */
@Service
public class GameUserBizImpl implements GameUserBiz {

    @Resource
    private GameUserDao gameUserDao;

    public CommonResponse login(PageData pd) {
        GameUser gameUser = new GameUser();
        gameUser.setUserName((String) pd.get("userName"));
        gameUser.setPassWord((String) pd.get("passWord"));
        gameUser = gameUserDao.getOne(gameUser);
        if (null != gameUser) {
           return new CommonResponse(ErrorCode.E0000.getCode(), ErrorCode.E0000.getValue());
        }else {
            return new CommonResponse(ErrorCode.E0003.getCode(), ErrorCode.E0003.getValue());
        }
    }

    public Boolean reg(GameUser gameUser){
        gameUser.setAddTime(new Date().getTime());
        Integer key = gameUserDao.insertOne(gameUser);
        if (Integer.valueOf("1").equals(key)){
            return true;
        }
        return false;
    }
}
