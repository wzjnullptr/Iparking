package com.zte.iparking.entity;

import java.io.Serializable;
import java.text.DateFormat;
import java.util.Date;

/**
 * Created by Administrator on 2020/4/30 0030.
 */

public class Second implements Serializable {
    private Integer sd;
    private Garage garage;
    private Park park;
    private User user;
    private Date sstime;
    private Date setime;
    private DateFormat stime;

    public Second() {
    }

    public Integer getSd() {
        return sd;
    }

    public void setSd(Integer sd) {
        this.sd = sd;
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

    public DateFormat getStime() {
        return stime;
    }

    public void setStime(DateFormat stime) {
        this.stime = stime;
    }
}
