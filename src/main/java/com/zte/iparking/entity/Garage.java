package com.zte.iparking.entity;

/**
 * Created by Administrator on 2020/4/30 0030.
 */

class Garage {
    private Integer gid;
    private String gname;
    private Integer gremark;

    public Garage() {
    }

    public Integer getGid() {
        return gid;
    }

    public void setGid(Integer gid) {
        this.gid = gid;
    }

    public String getGname() {
        return gname;
    }

    public void setGname(String gname) {
        this.gname = gname;
    }

    public Integer getGremark() {
        return gremark;
    }

    public void setGremark(Integer gremark) {
        this.gremark = gremark;
    }
}
