package com.game.controller;

import com.game.biz.GamePubChatBiz;
import com.game.biz.RouteBiz;
import com.game.common.CommonResponse;
import com.game.controller.base.BaseController;
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
        MapConstant mapConstant = routeBiz.mapAddress(pd);
        ModelAndView mv = new ModelAndView();
        mv.setViewName("data/third_part");
        mv.addObject("mc", mapConstant);
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



}
