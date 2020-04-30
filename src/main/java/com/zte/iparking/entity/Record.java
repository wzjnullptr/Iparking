package com.zte.iparking.entity;

import java.util.Date;

/**
 * Created by Administrator on 2020/4/30 0030.
 */

class Record {
    private Integer reid;
    private Garage garage;
    private Park park;
    private User user;
    private Card card;
    private Date sstime;
    private Date setime;
    private Integer smoney;
    private String spay;
    private Boolean sstate;

    public Record() {
    }

    public Integer getReid() {
        return reid;
    }

    public void setReid(Integer reid) {
        this.reid = reid;
    }

    public Date getSstime() {
        return sstime;
    }

    public void setSstime(Date sstime) {
        this.sstime = sstime;
    }

    public Date getSetime() {
        return setime;
    }

    public void setSetime(Date setime) {
        this.setime = setime;
    }

    public Integer getSmoney() {
        return smoney;
    }

    public void setSmoney(Integer smoney) {
        this.smoney = smoney;
    }

    public String getSpay() {
        return spay;
    }

    public void setSpay(String spay) {
        this.spay = spay;
    }

    public Boolean getSstate() {
        return sstate;
    }

    public void setSstate(Boolean sstate) {
        this.sstate = sstate;
    }

    public Garage getGarage() {
        return garage;
    }

    public void setGarage(Garage garage) {
        this.garage = garage;
    }

    public Park getPark() {
        return park;
    }

    public void setPark(Park park) {
        this.park = park;
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
