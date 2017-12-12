package com.team.store.consts;

public enum AccountMoneyEnumeration {
    SEND_PACKET("发红包"),COST("消费"),CHARGE_MONEY("充值"),
    MONEY_TO_CASH("提现"),BACK_MONEY("退款");

    private String type;

    public String getType() {
        return type;
    }

    AccountMoneyEnumeration(String type) {
        this.type = type;
    }
}
