package com.game.controller.base;

import com.game.entity.GameUser;
import org.springframework.web.context.request.RequestContextHolder;
import org.springframework.web.context.request.ServletRequestAttributes;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpSession;

/**
 * Created by Administrator on 2019-03-07.
 */
public class Session {

    public static final String GAME_USER = "game_user";

    /**
     * 得到request对象
     */
    public static HttpServletRequest getRequest() {
        HttpServletRequest request = ((ServletRequestAttributes) RequestContextHolder.getRequestAttributes()).getRequest();
        return request;
    }

    public static void addSeesion(GameUser gameUser){
        HttpSession mapSession = getRequest().getSession();
        mapSession.setAttribute(GAME_USER, gameUser);
    }

    public static GameUser getCurrentUser(){
        HttpSession mapSession = getRequest().getSession();
        return (GameUser) mapSession.getAttribute(GAME_USER);
    }
}
