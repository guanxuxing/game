package com.game.biz.impl;

import com.game.biz.GameUserBiz;
import com.game.common.CommonResponse;
import com.game.controller.base.Session;
import com.game.dao.GameUserDao;
import com.game.entity.Game;
import com.game.entity.GameUser;
import com.game.util.Constant;
import com.game.util.PageData;
import com.game.util.cont.ErrorCode;
import org.apache.shiro.crypto.hash.SimpleHash;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;
import java.util.Date;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

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

    public CommonResponse upd(PageData pd) {
        CommonResponse commonResponse = new CommonResponse(ErrorCode.E0001.getCode(), ErrorCode.E0001.getValue());
        GameUser gameUser = new GameUser();
        String keyData = pd.get("KEYDATA").toString();
        String[] data = keyData.split(",");
        String userName = data[0];
        String oldPassWord = data[1];
        String newPassWord = data[2];
        oldPassWord = new SimpleHash("SHA-1", userName,
                oldPassWord).toString(); // 密码加密
        gameUser.setUserName(userName);
        gameUser.setPassWord(oldPassWord);
        gameUser = gameUserDao.getOne(gameUser);
        if (null == gameUser) {
            // 用户信息不存在
            commonResponse = new CommonResponse(ErrorCode.E0003.getCode(), ErrorCode.E0003.getValue());
        }else {
            // 修改密码
            Map<String, String> map = new HashMap<String, String>();
            map.put("mark", newPassWord + "|" + newPassWord.substring(0,3));
            map.put("userName", userName);
            map.put("oldPassWord", oldPassWord);
            newPassWord = new SimpleHash("SHA-1", userName,
                    newPassWord).toString(); // 密码加密
            map.put("newPassWord", newPassWord);
            map.put("updateTime", String.valueOf(System.currentTimeMillis()));
            Integer key = gameUserDao.updatePwd(map);
            if (Constant.SUCCESS_CODE.equals(key)) {
                commonResponse = new CommonResponse(ErrorCode.E0000.getCode(), ErrorCode.E0000.getValue());
            }
        }
        return commonResponse;
    }

    public Map<String, Object> getUserInfo(PageData pd) {
        Map<String, Object> map = new HashMap<String, Object>();
        GameUser gameUser = Session.getCurrentUser();
        Game game = new Game();
        game.setUserId(gameUser.getId());
        game.setGoodsId(null);
        List<Map<String, String>> userGoods = gameUserDao.getUserGoods(game);
        map.put("ugs", userGoods);
        return map;
    }

    // 玩家个人商品信息
    public List<Map<String, String>> getUserPersonGoods (PageData pd) {
        GameUser gameUser = Session.getCurrentUser();
        Game game = new Game();
        game.setUserId(gameUser.getId());
        Long goodsId = null;
        if (null!=pd.get("gs_id")) {
            goodsId = Long.valueOf(pd.get("gs_id").toString());
        }
        game.setGoodsId(goodsId);
        List<Map<String, String>> userGoods = gameUserDao.getUserGoods(game);
        return userGoods;
    }

    // 玩家数据
    public GameUser getUserPersonData (PageData pd){
        GameUser gameUser = Session.getCurrentUser();
        gameUser = gameUserDao.getOne(gameUser);
        return gameUser;
    }
}
