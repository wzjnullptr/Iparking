package com.zte.iparking.service;

import com.zte.iparking.entity.User;

import java.util.List;

/**
 * Created by Administrator on 2020/4/30 0030.
 */
public interface UserService {
    int add(User user);
    /**
     * 根据用户名查询某个用户
     * @param name
     * @return 用户
     */
    User findByName(String name);
    /**
     * 检查登录
     * @param name
     * @param pwd
     * @return 用户
     */
    User checkLogin(String name, String pwd);
}