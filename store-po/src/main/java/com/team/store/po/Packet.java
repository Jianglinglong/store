package com.team.store.po;

public class Packet {
    private Integer packetId;

    private Double packetTotalMoney;

    private Double packetRemainMoney;

    private Integer packetFrom;

    private Integer userId;

    public Integer getPacketId() {
        return packetId;
    }

    public void setPacketId(Integer packetId) {
        this.packetId = packetId;
    }

    public Double getPacketTotalMoney() {
        return packetTotalMoney;
    }

    public void setPacketTotalMoney(Double packetTotalMoney) {
        this.packetTotalMoney = packetTotalMoney;
    }

    public Double getPacketRemainMoney() {
        return packetRemainMoney;
    }

    public void setPacketRemainMoney(Double packetRemainMoney) {
        this.packetRemainMoney = packetRemainMoney;
    }

    public Integer getPacketFrom() {
        return packetFrom;
    }

    public void setPacketFrom(Integer packetFrom) {
        this.packetFrom = packetFrom;
    }

    public Integer getUserId() {
        return userId;
    }

    public void setUserId(Integer userId) {
        this.userId = userId;
    }
}