package com.game.biz.impl;

import com.game.biz.RouteBiz;
import com.game.controller.base.Session;
import com.game.dao.GameUserAddressDao;
import com.game.entity.GameUser;
import com.game.entity.GameUserAddress;
import com.game.util.DirectionAim;
import com.game.util.MapConstant;
import com.game.util.PageData;
import org.apache.commons.lang3.StringUtils;
import org.springframework.stereotype.Service;
import javax.annotation.Resource;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * Created by Administrator on 2019-03-08.
 */
@Service
public class RouteBizImpl implements RouteBiz {

    @Resource
    private GameUserAddressDao gameUserAddressDao;

    public static final String MAP_FIRST_RISK = "0";



    public MapConstant mapAddress(PageData pd) {
        String riskCode =  MAP_FIRST_RISK;
        //判断当前用户存在已有位置
        GameUser gameUser = Session.getCurrentUser();
        if (null != gameUser) {
            GameUserAddress gameUserAddress = gameUserAddressDao.getOne(gameUser.getId());
            if (null != gameUserAddress) {
                riskCode = gameUserAddress.getAddressCode();
            }
        }
        if (null != pd.get("riskCode") && StringUtils.isNotBlank(pd.get("riskCode").toString())) {
            riskCode = pd.get("riskCode").toString();
        }
       //  riskCode = null==pd.get("riskCode") ? MAP_FIRST_RISK:pd.get("riskCode").toString();
        //记录用户当前位置
        markUserAddress(riskCode);

        MapConstant mapConstant = null;
        mapConstant = MapConstant.NPC_MAP.get(riskCode);
        if (MAP_FIRST_RISK.equals(riskCode) ) {
            mapConstant = MapConstant.NPC_MAP.get(MAP_FIRST_RISK);
        }
        if (null == mapConstant) {
            return null;
        }

        mapConstant.setTextDesc(mapConstant.getText().toString().replaceAll("\\[", "").replaceAll("]", ""));
        mapConstant.setNpcDesc(mapConstant.getNpc().toString().replaceAll("\\[", "").replaceAll("]", ""));

        List<String> directions = mapConstant.getDirection();
        List<DirectionAim> list = new ArrayList<DirectionAim>();
        for (String str : directions) {
            String [] dis = str.split("#");
            DirectionAim directionAim = new DirectionAim();
            directionAim.setCode(dis[0]);
            String textAlign = "";
            if ("W".equals(dis[1])) {
                textAlign = "left";
            }else if ("S".equals(dis[1])) {
                textAlign = "center";
            }
            else if ("E".equals(dis[1])) {
                textAlign = "right";
            }
            directionAim.setAlign(textAlign);
            directionAim.setName(dis[2]);
            directionAim.setAim(dis[3]);
            list.add(directionAim);
        }
        mapConstant.setCodeUsers(getUsersByRiskCode(riskCode));
        mapConstant.setDirectionAim(list);
        return mapConstant;
    }

    public List<Map<String, String>> getUsersByRiskCode (String riskCode){
        Map<String, Object> param = new HashMap<String, Object>();
        param.put("addressCode", riskCode);
        param.put("userId", Session.getCurrentUser().getId());
        return gameUserAddressDao.getUsersByCode(param);
    }

    /***
     * 记录用户当前位置
     * @param addressCode
     */
    public void markUserAddress(String addressCode){
        GameUserAddress gameUserAddress = new GameUserAddress();
        GameUser gameUser = Session.getCurrentUser();
        if (null != gameUser) {
            gameUserAddress = gameUserAddressDao.getOne(gameUser.getId());
            // 添加或者更新用户当前位置
            if (null == gameUserAddress) {
                gameUserAddress = new GameUserAddress();
                gameUserAddress.setAddTime(System.currentTimeMillis());
                gameUserAddress.setAddressCode(addressCode);
                gameUserAddress.setUserId(gameUser.getId());
                gameUserAddressDao.insertOne(gameUserAddress);
            } else {
                gameUserAddress.setAddressCode(addressCode);
                gameUserAddress.setUserId(gameUser.getId());
                gameUserAddress.setUpdateTime(System.currentTimeMillis());
                gameUserAddressDao.updateGameUserAddress(gameUserAddress);
            }
        }
    }
}
