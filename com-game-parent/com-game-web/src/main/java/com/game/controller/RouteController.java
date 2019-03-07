package com.game.controller;

import com.game.controller.base.BaseController;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

/**
 * Created by Administrator on 2019-03-07.
 */
@Controller
@RequestMapping(value = "route")
public class RouteController extends BaseController{

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
     * 前往游戏三区
     * @return
     */
    @RequestMapping(value = "gtp")
    public ModelAndView goGameThirdPart(){
        ModelAndView mv = new ModelAndView();
        mv.setViewName("data/third_part");
        return mv;
    }



}
