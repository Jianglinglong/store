package com.team.store.po;

public class ProductInfo {
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

    public Integer getProId() {
        return proId;
    }

    public void setProId(Integer proId) {
        this.proId = proId;
    }

    public String getProName() {
        return proName;
    }

    public void setProName(String proName) {
        this.proName = proName == null ? null : proName.trim();
    }

    public Double getProPrice() {
        return proPrice;
    }

    public void setProPrice(Double proPrice) {
        this.proPrice = proPrice;
    }

    public String getProImg() {
        return proImg;
    }

    public void setProImg(String proImg) {
        this.proImg = proImg == null ? null : proImg.trim();
    }

    public Integer getPcId() {
        return pcId;
    }

    public void setPcId(Integer pcId) {
        this.pcId = pcId;
    }

    public Integer getPbId() {
        return pbId;
    }

    public void setPbId(Integer pbId) {
        this.pbId = pbId;
    }

    public Integer getPtId() {
        return ptId;
    }

    public void setPtId(Integer ptId) {
        this.ptId = ptId;
    }

    public String getProLevel1() {
        return proLevel1;
    }

    public void setProLevel1(String proLevel1) {
        this.proLevel1 = proLevel1 == null ? null : proLevel1.trim();
    }

    public String getProLevel2() {
        return proLevel2;
    }

    public void setProLevel2(String proLevel2) {
        this.proLevel2 = proLevel2 == null ? null : proLevel2.trim();
    }

    public Integer getProNum() {
        return proNum;
    }

    public void setProNum(Integer proNum) {
        this.proNum = proNum;
    }

    public Double getProExpress() {
        return proExpress;
    }

    public void setProExpress(Double proExpress) {
        this.proExpress = proExpress;
    }

    public String getProBigImg() {
        return proBigImg;
    }

    public void setProBigImg(String proBigImg) {
        this.proBigImg = proBigImg == null ? null : proBigImg.trim();
    }

    public String getProDesc() {
        return proDesc;
    }

    public void setProDesc(String proDesc) {
        this.proDesc = proDesc == null ? null : proDesc.trim();
    }
}