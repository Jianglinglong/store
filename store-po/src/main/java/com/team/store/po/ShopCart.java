package com.team.store.po;

public class ShopCart {
    private Integer shopcartId;

    private Integer userId;

    private Integer proId;

    private Double proPrice;

    private Double proMoney;

    private Integer proNum;

    private String proType1;

    private String proType2;

    private String proLevel1;

    private String proLevel2;

    public Integer getShopcartId() {
        return shopcartId;
    }

    public void setShopcartId(Integer shopcartId) {
        this.shopcartId = shopcartId;
    }

    public Integer getUserId() {
        return userId;
    }

    public void setUserId(Integer userId) {
        this.userId = userId;
    }

    public Integer getProId() {
        return proId;
    }

    public void setProId(Integer proId) {
        this.proId = proId;
    }

    public Double getProPrice() {
        return proPrice;
    }

    public void setProPrice(Double proPrice) {
        this.proPrice = proPrice;
    }

    public Double getProMoney() {
        return proMoney;
    }

    public void setProMoney(Double proMoney) {
        this.proMoney = proMoney;
    }

    public Integer getProNum() {
        return proNum;
    }

    public void setProNum(Integer proNum) {
        this.proNum = proNum;
    }

    public String getProType1() {
        return proType1;
    }

    public void setProType1(String proType1) {
        this.proType1 = proType1 == null ? null : proType1.trim();
    }

    public String getProType2() {
        return proType2;
    }

    public void setProType2(String proType2) {
        this.proType2 = proType2 == null ? null : proType2.trim();
    }

    public String getProLevel1() {
        return proLevel1;
    }

    public void setProLevel1(String proLevel1) {
        this.proLevel1 = proLevel1 == null ? null : proLevel1.trim();
    }

    public String getProLevel2() {
        return proLevel2;
    }

    public void setProLevel2(String proLevel2) {
        this.proLevel2 = proLevel2 == null ? null : proLevel2.trim();
    }
}