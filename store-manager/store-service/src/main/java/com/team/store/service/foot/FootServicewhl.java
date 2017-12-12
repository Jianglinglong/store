package com.team.store.service.foot;

import java.text.ParseException;
import java.util.Date;
import java.util.List;
import java.util.TreeMap;

import com.team.store.po.ProductInfo;

public interface FootServicewhl {
	/**
	 * 
	 */
	void deleteFoot(int proId,String time,int userId);
	/**
	 * 添加足迹
	 */
	void addFoot(int userId, int goodsId);
	
	/**
	 * 获取
	 * @param userId
	 * @return
	 * @throws ParseException 
	 */
	TreeMap<Date, List<ProductInfo>> getFoot(int userId) throws ParseException;
}
