package com.zte.iparking.entity;

/**
 * Created by Administrator on 2020/4/30 0030.
 */

class Master {
    private Integer mid;
    private String mname;
    private String mpwd;

    public Master() {
    }

    public Integer getMid() {
        return mid;
    }

    public void setMid(Integer mid) {
        this.mid = mid;
    }

    public String getMname() {
        return mname;
    }

    public void setMname(String mname) {
        this.mname = mname;
    }

    public String getMpwd() {
        return mpwd;
    }

    public void setMpwd(String mpwd) {
        this.mpwd = mpwd;
    }
}
