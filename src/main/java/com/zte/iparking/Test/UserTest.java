package com.zte.iparking.Test;

import com.zte.iparking.dao.UserDao;
import com.zte.iparking.entity.User;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

/**
 * Created by Administrator on 2020/4/30 0030.
 */

class UserTest {
    public static void main(String[] args) {
            ApplicationContext context = new ClassPathXmlApplicationContext("spring-dao.xml");
            UserDao userDao = (UserDao) context.getBean("userDao");

        User user1 = new User();
        user1.setUname("2");
        user1.setUpwd("3");
        int result1=userDao.insert(user1);
        System.out.print(result1);
        }
}
