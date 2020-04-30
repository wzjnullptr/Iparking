package com.zte.iparking.entity;

/**
 * Created by Administrator on 2020/4/30 0030.
 */

class Icord {
    private Integer irid;
    private User user;
    private String cnumber;
    private Integer imoney;

    public Icord() {
    }

    public Integer getIrid() {
        return irid;
    }

    public void setIrid(Integer irid) {
        this.irid = irid;
    }

    public User getUser() {
        return user;
    }

    public void setUser(User user) {
        this.user = user;
    }

    public String getCnumber() {
        return cnumber;
    }

    public void setCnumber(String cnumber) {
        this.cnumber = cnumber;
    }

    public Integer getImoney() {
        return imoney;
    }

    public void setImoney(Integer imoney) {
        this.imoney = imoney;
    }
}
