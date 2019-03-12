package com.game.dao;

import com.game.entity.GameSchool;

import java.util.List;
import java.util.Map;

/**
 * Created by Administrator on 2019-03-12.
 */
public interface GameSchoolDao {

    public List<GameSchool> getSchoolList();

    public List<Map<String, String>> getMasterListBySchoolId(Long schoolId);

    public List<Map<String, String>> getGestListByMasterId(Long masterId);

    public List<Map<String, String>> getArtListByGestId(Long gestId);


}
