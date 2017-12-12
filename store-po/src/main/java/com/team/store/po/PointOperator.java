package com.team.store.po;

import java.util.Date;

public class PointOperator {
    private Integer pointopId;

    private Integer pointId;

    private Date pointopTime;

    private String pointopType;

    private Integer pointNum;

    public Integer getPointopId() {
        return pointopId;
    }

    public void setPointopId(Integer pointopId) {
        this.pointopId = pointopId;
    }

    public Integer getPointId() {
        return pointId;
    }

    public void setPointId(Integer pointId) {
        this.pointId = pointId;
    }

    public Date getPointopTime() {
        return pointopTime;
    }

    public void setPointopTime(Date pointopTime) {
        this.pointopTime = pointopTime;
    }

    public String getPointopType() {
        return pointopType;
    }

    public void setPointopType(String pointopType) {
        this.pointopType = pointopType == null ? null : pointopType.trim();
    }

    public Integer getPointNum() {
        return pointNum;
    }

    public void setPointNum(Integer pointNum) {
        this.pointNum = pointNum;
    }
}