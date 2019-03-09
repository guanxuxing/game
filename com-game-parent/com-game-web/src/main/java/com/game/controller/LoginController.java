package com.game.controller;

import com.game.biz.GameUserBiz;
import com.game.common.CommonResponse;
import com.game.controller.base.BaseController;
import com.game.entity.GameUser;
import com.game.util.PageData;
import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.servlet.ModelAndView;
import javax.annotation.Resource;

/**
 * Created by Administrator on 2019-03-05.
 */
@Slf4j
@Controller
public class LoginController extends BaseController{

    @Resource
    private GameUserBiz gameUserBiz;

    @RequestMapping(value = "goloin")
    public ModelAndView goLogin(){
        ModelAndView mv = new ModelAndView();
        mv.setViewName("system/login");
        return mv;
    }

    @RequestMapping(value = "goreg")
    public ModelAndView goReg() {
        ModelAndView mv = new ModelAndView();
        mv.setViewName("system/reg");
        return mv;
    }

    @RequestMapping(value = "goupw")
    public ModelAndView goUpdatePassWord(){
        ModelAndView mv = new ModelAndView();
        mv.setViewName("system/update_pass_word");
        return mv;
    }

    /***
     * 用户服务条款
     * @return
     */
    @RequestMapping(value = "goright")
    public ModelAndView goRight(){
        ModelAndView mv = new ModelAndView();
        mv.setViewName("system/right");
        return mv;
    }

    /***
     * 注册
     * @return
     */
    @ResponseBody
    @RequestMapping(value = "reg")
    public CommonResponse reg(){
        PageData pd = this.getPageData();
        return gameUserBiz.reg(pd);
    }

    /***
     * 登录
     * @return
     */
    @ResponseBody
    @RequestMapping(value = "login")
    public CommonResponse login(){
        PageData pd = this.getPageData();
        return gameUserBiz.login(pd);
    }

    /***
     * 修改密码
     * @return
     */
    @ResponseBody
    @RequestMapping(value = "upd")
    public CommonResponse udpatePassWord() {
        PageData pd = this.getPageData();
        return gameUserBiz.upd(pd);
    }

    /***
     * 登录成功之后游戏首页
     * @return
     */
    @RequestMapping(value = "game/index")
    public ModelAndView mainIndex(){
        ModelAndView mv = new ModelAndView();
        mv.setViewName("data/game_index");
        return mv;
    }


}
