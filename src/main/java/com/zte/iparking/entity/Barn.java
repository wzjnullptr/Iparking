package com.zte.iparking.entity;

/**
 * Created by Administrator on 2020/4/30 0030.
 */

//车库表
class Barn {
    private Integer bid;
    private Garage garage;
    private Integer btotal;
    private Integer boccupy;
    private  Integer bappoint;
    private  Integer bsurlus;
    private String baddress;
    private Integer bprice;

    public Barn() {
    }

    public Integer getBid() {
        return bid;
    }

    public void setBid(Integer bid) {
        this.bid = bid;
    }

    public Garage getGarage() {
        return garage;
    }

    public void setGarage(Garage garage) {
        this.garage = garage;
    }

    public Integer getBtotal() {
        return btotal;
    }

    public void setBtotal(Integer btotal) {
        this.btotal = btotal;
    }

    public Integer getBoccupy() {
        return boccupy;
    }

    public void setBoccupy(Integer boccupy) {
        this.boccupy = boccupy;
    }

    public Integer getBappoint() {
        return bappoint;
    }

    public void setBappoint(Integer bappoint) {
        this.bappoint = bappoint;
    }

    public Integer getBsurlus() {
        return bsurlus;
    }

    public void setBsurlus(Integer bsurlus) {
        this.bsurlus = bsurlus;
    }

    public String getBaddress() {
        return baddress;
    }

    public void setBaddress(String baddress) {
        this.baddress = baddress;
    }

    public Integer getBprice() {
        return bprice;
    }

    public void setBprice(Integer bprice) {
        this.bprice = bprice;
    }
}
