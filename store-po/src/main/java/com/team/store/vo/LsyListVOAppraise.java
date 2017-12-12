package com.team.store.vo;

import java.util.Date;

import com.fasterxml.jackson.annotation.JsonFormat;

public class LsyListVOAppraise {

	private int apprId;
	//图片
	private String apprPicture;
	
	@JsonFormat(pattern="yyyy-MM-dd HH:mm")
	private Date apprTime;
	private String userName;
	//评价（1好评2中评3差评)
	private int apprType;
	private String apprNoname;
	private String apprContents;
	private String orderLevel1;
	private String orderLevel2;
	private int countA;
	private int countB;
	private int countC;
	private String userPhoto;
	
	
	
	public String getUserPhoto() {
		return userPhoto;
	}
	public void setUserPhoto(String userPhoto) {
		this.userPhoto = userPhoto;
	}
	public int getCountA() {
		return countA;
	}
	public void setCountA(int countA) {
		this.countA = countA;
	}
	public int getCountB() {
		return countB;
	}
	public void setCountB(int countB) {
		this.countB = countB;
	}
	public int getCountC() {
		return countC;
	}
	public void setCountC(int countC) {
		this.countC = countC;
	}
	public int getApprId() {
		return apprId;
	}
	public void setApprId(int apprId) {
		this.apprId = apprId;
	}
	public String getApprPicture() {
		return apprPicture;
	}
	public void setApprPicture(String apprPicture) {
		this.apprPicture = apprPicture;
	}
	public Date getApprTime() {
		return apprTime;
	}
	public void setApprTime(Date apprTime) {
		this.apprTime = apprTime;
	}
	public String getUserName() {
		return userName;
	}
	public void setUserName(String userName) {
		this.userName = userName;
	}
	public int getApprType() {
		return apprType;
	}
	public void setApprType(int apprType) {
		this.apprType = apprType;
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
	public String getOrderLevel2() {
		return orderLevel2;
	}
	public void setOrderLevel2(String orderLevel2) {
		this.orderLevel2 = orderLevel2;
	}
	
	
}
