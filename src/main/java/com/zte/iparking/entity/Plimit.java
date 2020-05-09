package com.zte.iparking.entity;

import java.io.Serializable;

/**
 * Created by Administrator on 2020/4/30 0030.
 */

public class Plimit implements Serializable{
    private Integer lid;
    private Integer llimit;

    public Plimit() {
    }

    public Integer getLid() {
        return lid;
    }

    public void setLid(Integer lid) {
        this.lid = lid;
    }

    public Integer getLlimit() {
        return llimit;
    }

    public void setLlimit(Integer llimit) {
        this.llimit = llimit;
    }
}
