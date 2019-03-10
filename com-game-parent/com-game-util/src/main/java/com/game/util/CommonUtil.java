package com.game.util;

import org.apache.commons.lang3.StringUtils;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * Created by Administrator on 2019/3/10.
 */
public class CommonUtil {

    public static List<Map<String,String>> parseNpcPlanCodeName(String npcPlanCodeName){
        if (StringUtils.isNotBlank(npcPlanCodeName)) {
            String [] npcPlanCodeNames = npcPlanCodeName.split("\\}");
            ArrayList<Map<String, String>> list = new ArrayList<Map<String, String>>();
            for (String codeName : npcPlanCodeNames) {
                String [] codeNames = codeName.replaceAll("\\{", "").split("#");
                Map<String, String> map = new HashMap<String, String>();
                map.put("npcCode", codeNames[0]);
                map.put("npcName", codeNames[1]);
                // 任务暂时不解析
                list.add(map);
            }
            return list;
        }
        return null;
    }
}
