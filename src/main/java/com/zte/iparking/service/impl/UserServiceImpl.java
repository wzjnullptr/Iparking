package com.zte.iparking.service.impl;

import com.zte.iparking.dao.UserDao;
import com.zte.iparking.entity.Plimit;
import com.zte.iparking.entity.User;
import com.zte.iparking.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Propagation;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;

/**
 * Created by Administrator on 2020/4/30 0030.
 */
@Service
@Transactional(propagation = Propagation.REQUIRED,rollbackFor = Exception.class)
public class UserServiceImpl implements UserService{
    @Autowired
    private UserDao userDao;

    @Override
    public int add(User user) {
        return userDao.insert(user);
    }

    @Override
    public User findByName(String name) {
        return userDao.selectByName(name);
    }

    @Override
    @Transactional(propagation = Propagation.SUPPORTS,readOnly = true)
    public User checkLogin(String name, String pwd) {
        User user = userDao.selectByName(name);
        // 判断用户名和密码是否正确
        if (user != null && user.getUpwd().equals(pwd)) {
            return user;
        }
        return null;
    }

    @Override
    public int regist(String name, String pwd) {
        User user = new User();
        user.setUname(name);
        user.setUpwd(pwd);
        Plimit plimit=new Plimit();
        plimit.setLid(1);
        user.setPlimit(plimit);
        User check = userDao.selectByName(name);
        if ( check != null ) {
            return 0;
        }
        return userDao.insert(user);
    }
}