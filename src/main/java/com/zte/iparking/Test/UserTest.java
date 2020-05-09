package com.zte.iparking.Test;

import com.sun.org.apache.xalan.internal.utils.XMLSecurityManager;
import com.sun.scenario.effect.impl.state.HVSeparableKernel;
import com.zte.iparking.dao.UserDao;
import com.zte.iparking.entity.Plimit;
import com.zte.iparking.entity.User;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
        /*
 * Created by Administrator on 2020/4/30 0030.
 */

class UserTest {
    public static void main(String[] args) {
            ApplicationContext context = new ClassPathXmlApplicationContext("spring-dao.xml");
            UserDao userDao = (UserDao) context.getBean("userDao");

        User user1 = new User();
        Plimit plimit1=new Plimit();
        plimit1.setLid(1);
        user1.setPlimit(plimit1);
        user1.setUname("2");
        user1.setUpwd("3");
        Integer i=123;
        user1.setUcall(i);
        user1.setUmoney(0);
        int result1=userDao.insert(user1);
        System.out.print(result1);
        }
}
