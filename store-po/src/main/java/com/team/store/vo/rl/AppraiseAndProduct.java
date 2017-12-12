package com.team.store.vo.rl;

import java.util.Date;

import com.fasterxml.jackson.annotation.JsonFormat;

public class AppraiseAndProduct {
	private int apprId;
	 private Date apprTime;
	//图片
	private String apprPicture;
	public String getApprPicture() {
		return apprPicture;
	}
	public void setApprPicture(String apprPicture) {
		this.apprPicture = apprPicture;
	}
	//评价（1好评2中评3差评)
	private String apprNoname;
	public Date getApprTime() {
		return apprTime;
	}
	public void setApprTime(Date apprTime) {
		this.apprTime = apprTime;
	}
	private String apprContents;
	private String orderLevel1;
	private String orderLevel2;
	public String getOrderLevel2() {
		return orderLevel2;
	}
	public void setOrderLevel2(String orderLevel2) {
		this.orderLevel2 = orderLevel2;
	}
	private String proImg;
	private String proName;
	public int getApprId() {
		return apprId;
	}
	public void setApprId(int apprId) {
		this.apprId = apprId;
	}
	public String getApprNoname() {
		return apprNoname;
	}
	public void setApprNoname(String apprNoname) {
		this.apprNoname = apprNoname;
	}
	public String getApprContents() {
		return apprContents;
	}
	public void setApprContents(String apprContents) {
		this.apprContents = apprContents;
	}
	public String getOrderLevel1() {
		return orderLevel1;
	}
	public void setOrderLevel1(String orderLevel1) {
		this.orderLevel1 = orderLevel1;
	}
	public String getProImg() {
		return proImg;
	}
	public void setProImg(String proImg) {
		this.proImg = proImg;
	}
	public String getProName() {
		return proName;
	}
	public void setProName(String proName) {
		this.proName = proName;
	}
	
	
}
