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

    private String npcCode;
    private String npcName;
    private String npcPlanCodeName;

    public List<Map<String, String>> planCodeName;

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

         MapConstant c4 = new MapConstant("9", "商店", Arrays.asList("这里可以买卖东西"),
                 Arrays.asList("竹剑"),
                 Arrays.asList( "2#S#镜湖#南：镜湖(挣钱) →") );
         NPC_MAP.put(c4.getCode(), c4);

         MapConstant c5 = new MapConstant("10", "钱庄", Arrays.asList("这里可以存取钱"),
                 Arrays.asList("包不同"),
                 Arrays.asList( "2#W#镜湖#南：镜湖(挣钱) →") );
         NPC_MAP.put(c5.getCode(), c5);

         MapConstant c6 = new MapConstant("7", "江湖聚义厅", Arrays.asList("江湖豪杰相会于此。在这里你可以申请成为新人的师傅，也可以申请一个师傅带你玩这个游戏。"),
                 Arrays.asList(""),
                 Arrays.asList("1#N#当铺#北：新手村广场 ↑", "12#W#江湖公告栏#西：江湖公告栏 ←",
                         "11#E#武馆#东：武馆 →", "13#S#江湖聊天室#南：江湖聊天室 ↓") );
         NPC_MAP.put(c6.getCode(), c6);

         MapConstant c7 = new MapConstant("11", "武馆", Arrays.asList("这里可以找钟灵学习武艺"),
                 Arrays.asList("闪电貂钟女侠"),
                 Arrays.asList( "7#W#江湖聚义厅#西：江湖聚义厅 ←") );
         NPC_MAP.put(c7.getCode(), c7);

         MapConstant c8 = new MapConstant("12", "江湖公告栏", Arrays.asList("这里空无一人，只剩一幅牌匾高挂在墙上，上面龙飞凤舞地写着三个大字“公告栏”，这里发放一些游戏中的最新公告。"),
                 Arrays.asList(""),
                 Arrays.asList( "7#E#江湖聚义厅#东：江湖聚义厅 →") );
         NPC_MAP.put(c8.getCode(), c8);

         MapConstant c9 = new MapConstant("13", "江湖聊天室", Arrays.asList("这是江湖人士聚集的地方，大家可以畅所欲言"),
                 Arrays.asList(""),
                 Arrays.asList( "7#N#江湖聚义厅#北：江湖聚义厅 ↑") );
         NPC_MAP.put(c9.getCode(), c9);

         MapConstant c10 = new MapConstant("14", "长安客栈", Arrays.asList("长安客栈是江湖人物出没的地方，可以和【小丽】对话开始主线任务。拜师可以找五岳的柳如烟、少林的清法比丘或魔教的无名乞丐。在江湖百晓生那里可以领连续任务。"),
                 Arrays.asList("小丽(任务)","江湖百晓生","少林清法比丘","五岳剑派柳如烟","魔教无名乞丐","日月神教见钱开","丐帮裘万家","唐门唐方"),
                 Arrays.asList("15#N#福威镖局#北：福威镖局 ↑", "35#W#朱雀大街#西：朱雀大街 ←",
                         "1#E#新手村广场#东：新手村广场 →", "18#S#竹林入口#南：竹林入口 ↓") );
         NPC_MAP.put(c10.getCode(), c10);

         MapConstant c11 = new MapConstant("15", "福威镖局", Arrays.asList("加入镖局后，可以点卯，每天增加一点镖局贡献，每充值一元也可获得一点镖局贡献。消耗镖局贡献可以提高自己的镖局等级，镖局等级提高后，可以领取对应的礼包，还可享受相应的特权，详见“福利”。这里还可以挂机，收益可累积二十四小时。资历值和镖局等级越高，挂机所得修行、潜能、白银越多。"),
                 Arrays.asList("镖局总管"),
                 Arrays.asList("16#N#镖局中堂#北：镖局中堂 ↑", "14#S#长安客栈#南：长安客栈↓") );
         NPC_MAP.put(c11.getCode(), c11);

         MapConstant c12 = new MapConstant("16", "镖局中堂", Arrays.asList("这里有镖局为趟子手、镖师、镖头们准备的一些常用物品。"),
                 Arrays.asList("镖局师爷"),
                 Arrays.asList("17#N#镖局后堂#北：镖局后堂↑", "15#S#福威镖局#南：福威镖局↓") );
         NPC_MAP.put(c12.getCode(), c12);

    }

}
