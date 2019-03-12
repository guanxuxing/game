package com.game.controller;

import com.game.biz.GameGoodsBiz;
import com.game.biz.GamePubChatBiz;
import com.game.biz.RouteBiz;
import com.game.common.CommonResponse;
import com.game.controller.base.BaseController;
import com.game.entity.GameGoods;
import com.game.entity.GameNpc;
import com.game.util.Constant;
import com.game.util.MapConstant;
import com.game.util.PageData;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.servlet.ModelAndView;

import javax.annotation.Resource;
import java.util.List;
import java.util.Map;

/**
 * Created by Administrator on 2019-03-07.
 */
@Controller
@RequestMapping(value = "route")
public class RouteController extends BaseController{

    @Resource
    private RouteBiz routeBiz;

    @Resource
    private GamePubChatBiz gamePubChatBiz;

    @Resource
    private GameGoodsBiz gameGoodsBiz;

    /***
     * 前往游戏一区
     * @return
     */
    @RequestMapping(value = "gfp")
    public ModelAndView goGameFirstPart(){
        ModelAndView mv = new ModelAndView();
        mv.setViewName("data/first_part");
        return mv;
    }

    /***
     * 前往游戏二区
     * @return
     */
    @RequestMapping(value = "gsp")
    public ModelAndView goGameSecongPart(){
        ModelAndView mv = new ModelAndView();
        mv.setViewName("data/second_part");
        return mv;
    }

    /***
     * riskCode 地图具体位置编号
     * 前往游戏三区
     * @return
     */
    @RequestMapping(value = "gtp")
    public ModelAndView goGameThirdPart(){
        PageData pd = this.getPageData();
        MapConstant mapConstant = routeBiz.mapAddressData(pd);
        ModelAndView mv = new ModelAndView();
        mv.setViewName("data/third_part");
        mv.addObject("mc", mapConstant);
        mv.addObject("pd", pd);
        return mv;
    }

    /***
     * 冒险江湖
     * @return
     */
    @RequestMapping(value = "gorisk")
    public ModelAndView goRisk() {
        ModelAndView mv = new ModelAndView();
        mv.setViewName("game/user_risk_all");
        return mv;
    }

    /***
     * 地图方向匹配
     * @return
     */
    @RequestMapping(value = "mapaddress")
    public ModelAndView mapAddress(){
        ModelAndView mv = new ModelAndView();
        mv.setViewName("game/user_risk_all");
        return mv;
    }

    /***
     * 去往公聊页面
     * @return
     */
    @RequestMapping(value = "gopchat")
    public ModelAndView goPubChat(){
        ModelAndView mv = new ModelAndView();
        List<Map<String, String>> list = gamePubChatBiz.getList();
        mv.addObject("list", list);
        mv.setViewName("data/pub_chat");
        return mv;
    }

    /***
     * 公聊添加信息
     * @return
     */
    @ResponseBody
    @RequestMapping(value = "pchat")
    public CommonResponse pubChat(){
        PageData pd = this.getPageData();
        return gamePubChatBiz.pubChat(pd);
    }

    /***
     * 前往npc列表
     * 接受npc任务 或 和npcPK
     * @return
     */
    @RequestMapping(value = "gnl")
    public ModelAndView goNpcList(){
        ModelAndView mv = new ModelAndView();
        PageData pd = this.getPageData();
        List<Map<String, String>> list = routeBiz.getNpcsById(pd);
        mv.setViewName("/data/npc_list");
        mv.addObject("list", list);
        return mv;
    }

    /***
     * 前往单个npc页面
     * 进行PK
     * @return
     */
    @RequestMapping(value = "gcn")
    public ModelAndView goCurrentNpc(){
        ModelAndView mv = new ModelAndView();
        PageData pd = this.getPageData();
        GameNpc gameNpc = routeBiz.getCurrentNpcByCode(pd);
        mv.setViewName("data/current_npc_info");
        mv.addObject("gn", gameNpc);
        return mv;
    }

    /***
     * 前往当前位置玩家列表
     * 和玩家互动
     * @return
     */
    @RequestMapping(value = "gudl")
    public ModelAndView goUserAddressList(){
        ModelAndView mv = new ModelAndView();
        PageData pd = this.getPageData();
        List<Map<String, String>> list = routeBiz.getUsersByRiskCode((String) pd.get("a_c"));
        mv.setViewName("/data/user_address_list");
        mv.addObject("list", list);
        return mv;
    }

    /**
     * 去往商店
     * @return
     */
    @RequestMapping(value = "gs")
    public ModelAndView goStore(){
        ModelAndView mv = new ModelAndView();
        mv.setViewName("data/store");
        return mv;
    }

    /***
     * 浏览商店物品
     * @return
     */
    @RequestMapping(value = "ssl")
    public ModelAndView showStoreList(){
        ModelAndView mv = new ModelAndView();
        List<GameGoods> list = gameGoodsBiz.getListByType(Constant.GOODS_0);
        mv.setViewName("data/store_list");
        mv.addObject("sl", list);
        return mv;
    }

    /***
     * 前往单个商品页面进行商品/药品购买
     * @return
     */
    @RequestMapping(value = "gbg")
    public ModelAndView goBuyGoods (){
        PageData pd = this.getPageData();
        ModelAndView mv = new ModelAndView();
        GameGoods gameGoods = gameGoodsBiz.getOne(pd);
        mv.setViewName("data/buy_goods");
        mv.addObject("ggs", gameGoods);
        return mv;
    }

    /***
     * 前往药铺页面
     * @return
     */
    @RequestMapping(value = "gds")
    public ModelAndView goDrupShop() {
        ModelAndView mv = new ModelAndView();
        PageData pd = this.getPageData();
        mv.setViewName("data/drug_shop");
        return mv;
    }

    /***
     * 前往药铺列表
     * @return
     */
    @RequestMapping(value = "bdgs")
    public ModelAndView buyDrugGoods(){
        ModelAndView mv = new ModelAndView();
        PageData pd = this.getPageData();
        List<GameGoods> list = gameGoodsBiz.getListByType(Constant.GOODS_1);
        mv.setViewName("data/drug_shop_list");
        mv.addObject("sl", list);
        return mv;
    }

    /***
     * 购买商品接口
     * @return
     */
    @ResponseBody
    @RequestMapping(value = "bg")
    public CommonResponse buyGoods(){
        PageData pd = this.getPageData();
        return gameGoodsBiz.buyGoods(pd);
    }

}
