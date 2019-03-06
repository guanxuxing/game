package com.game.controller;

import com.alibaba.fastjson.JSONObject;
import com.game.biz.GameUserBiz;
import com.game.common.CommonRequest;
import com.game.entity.GameUser;
import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.servlet.ModelAndView;
import javax.annotation.Resource;

/**
 * Created by Administrator on 2019-03-05.
 */
@Slf4j
@Controller
public class LoginController {

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

    @RequestMapping(value = "goright")
    public ModelAndView goRight(){
        ModelAndView mv = new ModelAndView();
        mv.setViewName("system/right");
        return mv;
    }

    @ResponseBody
    @RequestMapping(value = "login", produces = "application/json;charset=UTF-8")
    public ModelAndView login(CommonRequest request){
        log.info("--- receive.info --- {}", JSONObject.toJSON(request));
        ModelAndView mv = new ModelAndView();
        gameUserBiz.login(null);
        mv.setViewName("/index");
        return mv;
    }

}
