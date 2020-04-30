package com.zte.iparking.entity;

/**
 * Created by Administrator on 2020/4/30 0030.
 */

class Park {
    private Integer pid;
    private String pname;
    private Garage garage;
    private boolean pstate;

    public Park() {
    }

    public Integer getPid() {
        return pid;
    }

    public void setPid(Integer pid) {
        this.pid = pid;
    }

    public String getPname() {
        return pname;
    }

    public void setPname(String pname) {
        this.pname = pname;
    }


    public boolean isPstate() {
        return pstate;
    }

    public void setPstate(boolean pstate) {
        this.pstate = pstate;
    }

    public Garage getGarage() {
        return garage;
    }

    public void setGarage(Garage garage) {
        this.garage = garage;
    }
}
