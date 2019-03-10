package com.game.biz;

import com.game.entity.GameMap;
import com.game.entity.GameNpc;
import com.game.util.MapConstant;
import com.game.util.PageData;

import java.util.List;
import java.util.Map;

/**
 * Created by Administrator on 2019-03-08.
 */
public interface RouteBiz {

    public MapConstant mapAddress(PageData pd);
    public List<Map<String, String>> getUsersByRiskCode(String riskCode);
    public MapConstant mapAddressData(PageData pd);
    public List<Map<String, String>> getNpcsById (PageData pd);
    public GameNpc getCurrentNpcByCode(PageData pd);
}
