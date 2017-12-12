package com.team.store.po;

public class OrderProInfo {
    private Integer orderProId;

    private Integer userId;

    private Integer proId;

    private Integer orderId;

    private String orderLevle1;

    private String orderLevle2;

    private Integer proNum;

    private Double proPrice;

    private String appraisStatus;

    public Integer getOrderProId() {
        return orderProId;
    }

    public void setOrderProId(Integer orderProId) {
        this.orderProId = orderProId;
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

    public Integer getOrderId() {
        return orderId;
    }

    public void setOrderId(Integer orderId) {
        this.orderId = orderId;
    }

    public String getOrderLevle1() {
        return orderLevle1;
    }

    public void setOrderLevle1(String orderLevle1) {
        this.orderLevle1 = orderLevle1 == null ? null : orderLevle1.trim();
    }

    public String getOrderLevle2() {
        return orderLevle2;
    }

    public void setOrderLevle2(String orderLevle2) {
        this.orderLevle2 = orderLevle2 == null ? null : orderLevle2.trim();
    }

    public Integer getProNum() {
        return proNum;
    }

    public void setProNum(Integer proNum) {
        this.proNum = proNum;
    }

    public Double getProPrice() {
        return proPrice;
    }

    public void setProPrice(Double proPrice) {
        this.proPrice = proPrice;
    }

    public String getAppraisStatus() {
        return appraisStatus;
    }

    public void setAppraisStatus(String appraisStatus) {
        this.appraisStatus = appraisStatus == null ? null : appraisStatus.trim();
    }
}