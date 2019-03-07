package com.game.biz.impl;

import com.game.biz.GameUserBiz;
import com.game.common.CommonResponse;
import com.game.controller.base.Session;
import com.game.dao.GameUserDao;
import com.game.entity.GameUser;
import com.game.util.PageData;
import com.game.util.cont.ErrorCode;
import org.apache.shiro.crypto.hash.SimpleHash;
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
        String [] data = pd.get("KEYDATA").toString().split(",");
        String userName = data[0];
        String passWord = data[1];
        passWord = new SimpleHash("SHA-1", userName,
                passWord).toString(); // 密码加密
        GameUser gameUser = new GameUser();
        gameUser.setUserName(userName);
        gameUser.setPassWord(passWord);
        gameUser = gameUserDao.getOne(gameUser);
        if (null != gameUser) {
            Session.addSeesion(gameUser);
           return new CommonResponse(ErrorCode.E0000.getCode(), ErrorCode.E0000.getValue());
        }else {
            return new CommonResponse(ErrorCode.E0003.getCode(), ErrorCode.E0003.getValue());
        }
    }

    public CommonResponse reg(PageData pd){
        GameUser gameUser = new GameUser();
        String[] data = pd.get("KEYDATA").toString().split(",");
        String userName = data[0];
        String passWord = data[1];
        gameUser.setUserName(userName);
        GameUser gameCheckUser = gameUserDao.getOne(gameUser);
        if  (null != gameCheckUser) {
            return new CommonResponse(ErrorCode.E0004.getCode(), ErrorCode.E0004.getValue());
        }
        String passWordSimpleHash = new SimpleHash("SHA-1", userName,
                passWord).toString(); // 密码加密
        gameUser.setUserName(userName);
        gameUser.setPassWord(passWordSimpleHash);
        gameUser.setAddTime(new Date().getTime());
        gameUser.setMark(passWord+"|"+ passWord.substring(0,3));
        Integer key = gameUserDao.insertOne(gameUser);
        if (Integer.valueOf("1").equals(key)){
            return new CommonResponse(ErrorCode.E0000.getCode(), ErrorCode.E0000.getValue());
        }
        return new CommonResponse(ErrorCode.E0003.getCode(), ErrorCode.E0003.getValue());
    }
}
