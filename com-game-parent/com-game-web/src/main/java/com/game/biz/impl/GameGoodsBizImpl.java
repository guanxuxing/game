package com.game.biz.impl;

import com.game.biz.GameGoodsBiz;
import com.game.common.CommonResponse;
import com.game.controller.base.Session;
import com.game.dao.GameGoodsDao;
import com.game.dao.GameUserDao;
import com.game.dao.GameUserGoodsDao;
import com.game.entity.GameGoods;
import com.game.entity.GameUser;
import com.game.entity.GameUserGoods;
import com.game.util.Constant;
import com.game.util.PageData;
import com.game.util.cont.ErrorCode;
import org.springframework.stereotype.Service;
import javax.annotation.Resource;
import java.util.List;

/**
 * Created by Administrator on 2019/3/11.
 */
@Service
public class GameGoodsBizImpl implements GameGoodsBiz {

    @Resource
    private GameGoodsDao gameGoodsDao;

    @Resource
    private GameUserGoodsDao gameUserGoodsDao;

    @Resource
    private GameUserDao gameUserDao;


    public List<GameGoods> getListByType(Integer type) {
        return gameGoodsDao.getListByType(type);
    }

    public GameGoods getOne(PageData pd) {
        Long id = Long.valueOf(pd.get("g_id").toString());
        return gameGoodsDao.getOne(id);
    }

    /***
     * 购买商品/药品 ...
     * 判断单次购买的数量是否超限
     * 判断单次购买的数量总金额是否超限
     * 添加玩家-商品关联信息
     * 玩家余额变更
     * @param pd
     * @return
     */
    public CommonResponse buyGoods(PageData pd) {
        CommonResponse commonResponse = new CommonResponse(ErrorCode.E0001.getCode(), ErrorCode.E0001.getValue());
        Integer buyNum = Integer.valueOf(pd.get("num").toString());
        String ggsId = ((String) pd.get("ggs_id")).trim();
        GameGoods gameGoods = gameGoodsDao.getOne(Long.valueOf(ggsId));
        Double buyNumAmount = buyNum*gameGoods.getPrice();
        GameUser gameUser = Session.getCurrentUser();
        gameUser = gameUserDao.getOne(gameUser);
        if (buyNum.intValue() > gameGoods.getMaxBuy().intValue()){
            // 单次购买数量超限
            commonResponse = new CommonResponse(ErrorCode.E0006.getCode(), ErrorCode.E0006.getValue());
            return commonResponse;
        }else if (buyNumAmount.doubleValue() > gameUser.getAccount().doubleValue()) {
            // 余额不足
            commonResponse = new CommonResponse(ErrorCode.E0005.getCode(), ErrorCode.E0005.getValue());
            return commonResponse;
        }

        //玩家余额
        double balance = gameUser.getAccount().longValue() - buyNumAmount.longValue();
        gameUser.setAccount(balance);
        gameUser.setUpdateTime(System.currentTimeMillis());

        // 购买商品成功  添加信息
        GameUserGoods gameUserGoods = new GameUserGoods();
        gameUserGoods.setUserId(Session.getCurrentUser().getId());
        gameUserGoods.setGoodsId(gameGoods.getId());
        gameUserGoods = gameUserGoodsDao.getObject(gameUserGoods);

        if (null == gameUserGoods) {
            gameUserGoods = new GameUserGoods();
            gameUserGoods.setUserId(Session.getCurrentUser().getId());
            gameUserGoods.setGoodsId(gameGoods.getId());
            gameUserGoods.setGoodsNum(Long.valueOf(pd.get("num").toString()));
            gameUserGoods.setAddTime(System.currentTimeMillis());
            Integer key = gameUserGoodsDao.addObject(gameUserGoods);
            if (Constant.SUCCESS_CODE.equals(key)) {
                // 购买成功之后，玩家余额变更
                gameUserDao.updateAccount(gameUser);
                commonResponse = new CommonResponse(ErrorCode.E0000.getCode(), ErrorCode.E0000.getValue());
            }
        }else {
            gameUserGoods.setGoodsNum(Long.valueOf(pd.get("num").toString()).longValue()+gameUserGoods.getGoodsNum().longValue());
            gameUserGoods.setUpdateTime(System.currentTimeMillis());
            Integer key = gameUserGoodsDao.updateObject(gameUserGoods);
            if (Constant.SUCCESS_CODE.equals(key)) {
                // 购买成功之后，玩家余额变更
                gameUserDao.updateAccount(gameUser);
                commonResponse = new CommonResponse(ErrorCode.E0000.getCode(), ErrorCode.E0000.getValue());
            }
        }
        return commonResponse;
    }

    /***
     * 使用装备
     * 用户能量增加
     * 用户商品数量减少
     * @param pd
     * @return
     */
    public CommonResponse useGoods(PageData pd){
        return null;
    }

}
