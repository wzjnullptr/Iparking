package com.zte.iparking.entity;

import java.io.Serializable;

/**
 * Created by wzj on 2020/4/30 0030.
 */

/*entity创建实体类时 外键应映射成对象*/
public class User implements Serializable{
    private String uname;
    private String upwd;
    private Integer uid;
    private Card card;
    private Integer ucall;
    public User(){}

    public User(Integer uid,String uname,String upwd,Integer ucall) {
        this.uname = uname;
        this.upwd = upwd;
        this.uid = uid;
        this.ucall = ucall;
    }

    public User(Integer uid,String upwd,String uname) {
        this.uname = uname;
        this.uid = uid;
        this.upwd = upwd;
    }

    public String getUname() {
        return uname;
    }

    public void setUname(String uname) {
        this.uname = uname;
    }

    public Card getCard() {
        return card;
    }

    public void setCard(Card card) {
        this.card = card;
    }

    public String getUpwd() {
        return upwd;
    }

    public void setUpwd(String upwd) {
        this.upwd = upwd;
    }

    public Integer getUcall() {
        return ucall;
    }

    public void setUcall(Integer ucall) {
        this.ucall = ucall;
    }

    public Integer getUid() {
        return uid;
    }

    public void setUid(Integer uid) {
        this.uid = uid;
    }
}
