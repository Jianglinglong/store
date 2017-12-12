package com.team.store.vo;

import com.fasterxml.jackson.annotation.JsonFormat;

import java.util.Date;
import java.util.List;

public class UserOrder {
    @JsonFormat(pattern = "yyyy-MM-dd HH:mm")
    private Date orderTime;
    private double orderPrice;
    private int orderId;
    private List<UserOrderPro> proList;

    public Date getOrderTime() {
        return orderTime;
    }

    public void setOrderTime(Date orderTime) {
        this.orderTime = orderTime;
    }

    public double getOrderPrice() {
        return orderPrice;
    }

    public void setOrderPrice(double orderPrice) {
        this.orderPrice = orderPrice;
    }

    public int getOrderId() {
        return orderId;
    }

    public void setOrderId(int orderId) {
        this.orderId = orderId;
    }

    public List<UserOrderPro> getProList() {
        return proList;
    }

    public void setProList(List<UserOrderPro> proList) {
        this.proList = proList;
    }
}
