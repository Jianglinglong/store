package com.team.store.po;

import java.util.Date;

public class AppraiseInfo {
    private Integer apprId;

    private String apprContents;

    private Integer orderId;

    private String apprPicture;

    private Integer userId;

    private Date apprTime;

    private Integer apprType;

    private String apprNoname;

    private Integer proId;

    public Integer getApprId() {
        return apprId;
    }

    public void setApprId(Integer apprId) {
        this.apprId = apprId;
    }

    public String getApprContents() {
        return apprContents;
    }

    public void setApprContents(String apprContents) {
        this.apprContents = apprContents == null ? null : apprContents.trim();
    }

    public Integer getOrderId() {
        return orderId;
    }

    public void setOrderId(Integer orderId) {
        this.orderId = orderId;
    }

    public String getApprPicture() {
        return apprPicture;
    }

    public void setApprPicture(String apprPicture) {
        this.apprPicture = apprPicture == null ? null : apprPicture.trim();
    }

    public Integer getUserId() {
        return userId;
    }

    public void setUserId(Integer userId) {
        this.userId = userId;
    }

    public Date getApprTime() {
        return apprTime;
    }

    public void setApprTime(Date apprTime) {
        this.apprTime = apprTime;
    }

    public Integer getApprType() {
        return apprType;
    }

    public void setApprType(Integer apprType) {
        this.apprType = apprType;
    }

    public String getApprNoname() {
        return apprNoname;
    }

    public void setApprNoname(String apprNoname) {
        this.apprNoname = apprNoname == null ? null : apprNoname.trim();
    }

    public Integer getProId() {
        return proId;
    }

    public void setProId(Integer proId) {
        this.proId = proId;
    }
}