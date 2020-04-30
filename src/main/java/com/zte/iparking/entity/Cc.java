package com.zte.iparking.entity;

import java.util.Date;

/**
 * Created by Administrator on 2020/4/30 0030.
 */

class Cc {
    private Integer ccid;
    private User user;
    private Date cctime;
    private Charges charges;

    public Cc() {
    }

    public Integer getCcid() {
        return ccid;
    }

    public void setCcid(Integer ccid) {
        this.ccid = ccid;
    }

    public User getUser() {
        return user;
    }

    public void setUser(User user) {
        this.user = user;
    }

    public Date getCctime() {
        return cctime;
    }

    public void setCctime(Date cctime) {
        this.cctime = cctime;
    }

    public Charges getCharges() {
        return charges;
    }

    public void setCharges(Charges charges) {
        this.charges = charges;
    }
}
