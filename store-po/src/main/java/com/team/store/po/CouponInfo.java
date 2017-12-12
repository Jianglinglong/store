package com.team.store.po;

import java.util.Date;

public class CouponInfo {
    private Integer couponId;

    private Double couponPrice;

    private Integer couponCondition;

    private String couponState;

    private Date couponStarttime;

    private Date couponEndtime;

    private Integer userId;

    public Integer getCouponId() {
        return couponId;
    }

    public void setCouponId(Integer couponId) {
        this.couponId = couponId;
    }

    public Double getCouponPrice() {
        return couponPrice;
    }

    public void setCouponPrice(Double couponPrice) {
        this.couponPrice = couponPrice;
    }

    public Integer getCouponCondition() {
        return couponCondition;
    }

    public void setCouponCondition(Integer couponCondition) {
        this.couponCondition = couponCondition;
    }

    public String getCouponState() {
        return couponState;
    }

    public void setCouponState(String couponState) {
        this.couponState = couponState == null ? null : couponState.trim();
    }

    public Date getCouponStarttime() {
        return couponStarttime;
    }

    public void setCouponStarttime(Date couponStarttime) {
        this.couponStarttime = couponStarttime;
    }

    public Date getCouponEndtime() {
        return couponEndtime;
    }

    public void setCouponEndtime(Date couponEndtime) {
        this.couponEndtime = couponEndtime;
    }

    public Integer getUserId() {
        return userId;
    }

    public void setUserId(Integer userId) {
        this.userId = userId;
    }
}