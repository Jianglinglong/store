package com.team.store.consts;

public enum PointTypeEnumeration {
    SINGED("签到"), COMMENT("评论商品"),EMAIL("邮箱验证"),PHONE("手机绑定"),EXCHANGE("积分兑换");

    private String type;

    public String getType() {
        return type;
    }

    PointTypeEnumeration(String type) {
        this.type=type;
    }
}
