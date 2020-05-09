package com.zte.iparking.controller;

import com.alibaba.fastjson.JSON;
import com.zte.iparking.entity.User;
import com.zte.iparking.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.SessionAttributes;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpSession;
import java.util.HashMap;
import java.util.Map;

/**
 * Created by Administrator on 2020/5/9 0009.
 */

@Controller
@RequestMapping("/user")
@SessionAttributes("user")
public class UserController {
    @Autowired
    private UserService userService;

    @RequestMapping("/login")
    private String login() {
        return "user/login";
    }

    @RequestMapping("/login/do")
    @ResponseBody
    private String checkLogin(HttpServletRequest req, HttpSession session) {
        Map map = new HashMap<>(3);
        int uid;
        int status;
        String msg;
        String username = req.getParameter("name");
        String pwd = req.getParameter("pwd");
//      System.out.print(username);
//      System.out.print(pwd);
        // 获取用户
        User user = userService.checkLogin(username, pwd);
        // System.out.print(user);
        if (user != null) {
            session.setAttribute("user", user);
            uid = user.getUid();
            status = 1;
            msg = "success！";
            map.put("uid", uid);
            map.put("status", status);
            map.put("msg", msg);
            return JSON.toJSONString(map);
        }
        uid = 0;
        status = 0;
        msg = "fail";
        map.put("uid", uid);
        map.put("status", status);
        map.put("msg", msg);
        return JSON.toJSONString(map);
    }
}
