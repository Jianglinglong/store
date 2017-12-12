package com.team.store.po;

import java.util.Date;

public class MoneyOpInfo {
    private Integer moneyopId;

    private Date moneyopTime;

    private Double moneyopMoney;

    private String moneyopType;

    private Integer moneyId;

    private Double remainMoney;

    public Integer getMoneyopId() {
        return moneyopId;
    }

    public void setMoneyopId(Integer moneyopId) {
        this.moneyopId = moneyopId;
    }

    public Date getMoneyopTime() {
        return moneyopTime;
    }

    public void setMoneyopTime(Date moneyopTime) {
        this.moneyopTime = moneyopTime;
    }

    public Double getMoneyopMoney() {
        return moneyopMoney;
    }

    public void setMoneyopMoney(Double moneyopMoney) {
        this.moneyopMoney = moneyopMoney;
    }

    public String getMoneyopType() {
        return moneyopType;
    }

    public void setMoneyopType(String moneyopType) {
        this.moneyopType = moneyopType == null ? null : moneyopType.trim();
    }

    public Integer getMoneyId() {
        return moneyId;
    }

    public void setMoneyId(Integer moneyId) {
        this.moneyId = moneyId;
    }

    public Double getRemainMoney() {
        return remainMoney;
    }

    public void setRemainMoney(Double remainMoney) {
        this.remainMoney = remainMoney;
    }
}