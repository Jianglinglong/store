package com.team.store.consts;

public enum TimeEnumeration {
    TODAY("today"),SEVEN_DAYS("sevenDays"),ONE_MONTH("oneMonth"),THREE_MONTHS("threeMonths");
    private String type;

    public String getType() {
        return type;
    }

    TimeEnumeration(String type) {
        this.type=type;
    }
}
