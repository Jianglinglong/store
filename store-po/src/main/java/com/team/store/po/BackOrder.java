package com.team.store.po;

import java.util.Date;

public class BackOrder {
    private Integer backId;

    private Date startTime;

    private Integer orderId;

    private Integer orderState;

    private Integer orderLogistics;

    private Double backMoney;

    private Integer userId;

    public Integer getBackId() {
        return backId;
    }

    public void setBackId(Integer backId) {
        this.backId = backId;
    }

    public Date getStartTime() {
        return startTime;
    }

    public void setStartTime(Date startTime) {
        this.startTime = startTime;
    }

    public Integer getOrderId() {
        return orderId;
    }

    public void setOrderId(Integer orderId) {
        this.orderId = orderId;
    }

    public Integer getOrderState() {
        return orderState;
    }

    public void setOrderState(Integer orderState) {
        this.orderState = orderState;
    }

    public Integer getOrderLogistics() {
        return orderLogistics;
    }

    public void setOrderLogistics(Integer orderLogistics) {
        this.orderLogistics = orderLogistics;
    }

    public Double getBackMoney() {
        return backMoney;
    }

    public void setBackMoney(Double backMoney) {
        this.backMoney = backMoney;
    }

    public Integer getUserId() {
        return userId;
    }

    public void setUserId(Integer userId) {
        this.userId = userId;
    }
}