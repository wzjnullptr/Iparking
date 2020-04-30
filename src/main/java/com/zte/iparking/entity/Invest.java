package com.zte.iparking.entity;

/**
 * Created by Administrator on 2020/4/30 0030.
 */

class Invest {
    private Integer lid;
    private User user;
    private Card card;
    private Integer imoney;

    public Invest() {
    }

    public Integer getLid() {
        return lid;
    }

    public void setLid(Integer lid) {
        this.lid = lid;
    }


    public Integer getImoney() {
        return imoney;
    }

    public void setImoney(Integer imoney) {
        this.imoney = imoney;
    }

    public User getUser() {
        return user;
    }

    public void setUser(User user) {
        this.user = user;
    }

    public Card getCard() {
        return card;
    }

    public void setCard(Card card) {
        this.card = card;
    }
}
