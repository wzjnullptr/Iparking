package com.zte.iparking.dao;

import com.zte.iparking.entity.User;

import java.util.List;

/**
 * Created by Administrator on 2020/4/30 0030.
 */
public interface UserDao {
    int insert(User user);
    /**
     * 根据用户名查询某个用户
     * @param name
     * @return 用户
     */
    User selectByName(String name);


}