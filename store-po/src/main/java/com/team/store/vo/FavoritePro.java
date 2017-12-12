package com.team.store.vo;

import com.team.store.po.ProductInfo;

import java.util.Date;

public class FavoritePro {
    private int favoriteId;
    private int userId;
    private Date favoriteTime;
    private Integer proId;
    private String proName;
    private Double proPrice;
    private String proImg;
    private Integer pcId;
    private Integer pbId;
    private Integer ptId;
    private String proLevel1;
    private String proLevel2;
    private Integer proNum;
    private Double proExpress;
    private String proBigImg;
    private String proDesc;

    public void setFavoriteId(int favoriteId) {
        this.favoriteId = favoriteId;
    }

    public void setUserId(int userId) {
        this.userId = userId;
    }

    public void setFavoriteTime(Date favoriteTime) {
        this.favoriteTime = favoriteTime;
    }

    public void setProId(Integer proId) {
        this.proId = proId;
    }

    public void setProName(String proName) {
        this.proName = proName;
    }

    public void setProPrice(Double proPrice) {
        this.proPrice = proPrice;
    }

    public void setProImg(String proImg) {
        this.proImg = proImg;
    }

    public void setPcId(Integer pcId) {
        this.pcId = pcId;
    }

    public void setPbId(Integer pbId) {
        this.pbId = pbId;
    }

    public void setPtId(Integer ptId) {
        this.ptId = ptId;
    }

    public void setProLevel1(String proLevel1) {
        this.proLevel1 = proLevel1;
    }

    public void setProLevel2(String proLevel2) {
        this.proLevel2 = proLevel2;
    }

    public void setProNum(Integer proNum) {
        this.proNum = proNum;
    }

    public void setProExpress(Double proExpress) {
        this.proExpress = proExpress;
    }

    public void setProBigImg(String proBigImg) {
        this.proBigImg = proBigImg;
    }

    public void setProDesc(String proDesc) {
        this.proDesc = proDesc;
    }

    public int getFavoriteId() {
        return favoriteId;
    }

    public int getUserId() {
        return userId;
    }

    public Date getFavoriteTime() {
        return favoriteTime;
    }

    public Integer getProId() {
        return proId;
    }

    public String getProName() {
        return proName;
    }

    public Double getProPrice() {
        return proPrice;
    }

    public String getProImg() {
        return proImg;
    }

    public Integer getPcId() {
        return pcId;
    }

    public Integer getPbId() {
        return pbId;
    }

    public Integer getPtId() {
        return ptId;
    }

    public String getProLevel1() {
        return proLevel1;
    }

    public String getProLevel2() {
        return proLevel2;
    }

    public Integer getProNum() {
        return proNum;
    }

    public Double getProExpress() {
        return proExpress;
    }

    public String getProBigImg() {
        return proBigImg;
    }

    public String getProDesc() {
        return proDesc;
    }
}
