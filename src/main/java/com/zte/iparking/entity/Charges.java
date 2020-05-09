package com.zte.iparking.entity;

/**
 * Created by Administrator on 2020/4/30 0030.
 */

class Charges {
    private Integer chid;
    private  Integer chstanard;
    private Plimit plimit;

    public Charges() {
    }

    public Integer getChid() {
        return chid;
    }

    public void setChid(Integer chid) {
        this.chid = chid;
    }

    public Integer getChstanard() {
        return chstanard;
    }

    public void setChstanard(Integer chstanard) {
        this.chstanard = chstanard;
    }

    public Plimit getPlimit() {
        return plimit;
    }

    public void setPlimit(Plimit plimit) {
        this.plimit = plimit;
    }
}
