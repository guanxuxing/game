package com.game.util;

import lombok.Data;
import lombok.EqualsAndHashCode;
import lombok.ToString;
import java.util.Arrays;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * Created by Administrator on 2019-03-08.
 * 东 east　
 * 西  west　
 * 南 south
 * 北 north　
 * R 返回长安客栈
 * F 开始冒险江湖
 */
@Data
@EqualsAndHashCode(callSuper = false)
@ToString(callSuper = true)
public class MapConstant {

    private String code;
    private String name;
    private List<String> text;
    private List<String> npc;
    private List<String> direction;

    private List<DirectionAim> directionAim;
    private String textDesc;
    private String npcDesc;

    private List<Map<String, String>> codeUsers;

    public static Map<String, MapConstant> NPC_MAP = new HashMap<String, MapConstant>();

    public MapConstant(){}

    public MapConstant(String code,String name, List<String> text,
                       List<String> npc, List<String> direction) {
        this.code = code;
        this.name = name;
        this.text = text;
        this.npc = npc;
        this.direction = direction;
    }

     static {

        MapConstant c0 = new MapConstant("0", "首页", Arrays.asList("本页包含你的账号和密码信息","新手村","开始江湖"),
                Arrays.asList(""),
                Arrays.asList("F#this.enx#开始江湖冒险#P", "4#江湖大厅论坛#论坛#P", "5#长安客栈#长安客栈#→") );
         NPC_MAP.put(c0.getCode(), c0);

        MapConstant c1 = new MapConstant("1", "新手村广场", Arrays.asList("欢迎你来到风云变幻的江湖","北：镜湖(挣钱) ↑","西：长安客栈(江湖起点) ←"),
                Arrays.asList("武林信使"),
                Arrays.asList("2#N#镜湖#北：镜湖(挣钱) ↑", "5#W#长安客栈#西：长安客栈(江湖起点) ←",
                "6#E#新手村夺宝擂台#东：夺宝擂台(PK场) →", "7#S#江湖聚义厅#南：江湖聚义厅 ↓") );
         NPC_MAP.put(c1.getCode(), c1);

        MapConstant c2 = new MapConstant("2", "镜湖", Arrays.asList("这里可以钓鱼挣钱","还可以搜索地上捡钱"),
                Arrays.asList(""),
                Arrays.asList("3#N#新手村当铺#北：当铺(存物品) ↑", "9#W#新手村商店#西：商店(买东西) ←",
                        "10#E#新手村钱庄#东：钱庄(存取钱) →", "5#R#长安客栈#返回长安客栈", "1#S#新手村广场#南：新手村广场 ↓") );
         NPC_MAP.put(c2.getCode(), c2);

        MapConstant c3 = new MapConstant("3", "新手村当铺", Arrays.asList("这里可以存放东西","且不收手续费","南：镜湖(挣钱) ↓"),
                Arrays.asList("春花(任务)","梅剑"),
                Arrays.asList("5#R#长安客栈#返回长安客栈", "2#S#镜湖#南：镜湖(挣钱) ↓") );
         NPC_MAP.put(c3.getCode(), c3);

    }

}
