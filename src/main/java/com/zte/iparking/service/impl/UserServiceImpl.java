package com.zte.iparking.service.impl;

import com.zte.iparking.dao.UserDao;
import com.zte.iparking.entity.User;
import com.zte.iparking.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Propagation;
import org.springframework.transaction.annotation.Transactional;

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
}