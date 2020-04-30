package com.zte.iparking.entity;

/**
 * Created by Administrator on 2020/4/30 0030.
 */

class Card {
    private Integer cid;
    private Integer cbalance;
    private String cnumber;
    private User user;

    public Card() {
    }

    public Integer getCid() {
        return cid;
    }

    public void setCid(Integer cid) {
        this.cid = cid;
    }

    public Integer getCbalance() {
        return cbalance;
    }

    public void setCbalance(Integer cbalance) {
        this.cbalance = cbalance;
    }

    public String getCnumber() {
        return cnumber;
    }

    public void setCnumber(String cnumber) {
        this.cnumber = cnumber;
    }

    public User getUser() {
        return user;
    }

    public void setUser(User user) {
        this.user = user;
    }
}
