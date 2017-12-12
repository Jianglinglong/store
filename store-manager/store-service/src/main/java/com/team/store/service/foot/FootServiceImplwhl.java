package com.team.store.service.foot;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Date;
import java.util.List;
import java.util.Set;
import java.util.TreeMap;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Service;

import com.alibaba.fastjson.JSON;
import com.team.store.consts.FootConstant;
import com.team.store.po.ProductInfo;

import redis.clients.jedis.Jedis;

@Service("footServicewhl")
public class FootServiceImplwhl implements FootServicewhl {

	@Autowired
	@Qualifier("jedis")
	private Jedis jedis;

	@Override
	public TreeMap<Date, List<ProductInfo>> getFoot(int userId) throws ParseException {
		String footTimeKey = FootConstant.USER_TIME.getValue() + userId + ":*";
		TreeMap<Date, List<ProductInfo>> goodsMap = new TreeMap<Date, List<ProductInfo>>(Collections.reverseOrder());
		Set<String> keys = jedis.keys(footTimeKey);
		SimpleDateFormat format = new SimpleDateFormat("yyyy-MM-dd");
		for (String key : keys) {
			List<ProductInfo> goodsList = new ArrayList<ProductInfo>();
			String goodsIds = jedis.get(key);
			String[] ids = goodsIds.split(",");
			for (String id : ids) {
				String goodsJson = jedis.get(FootConstant._GOODS.getValue() + id);
				goodsList.add(JSON.parseObject(goodsJson, ProductInfo.class));
			}
			String dateKey = key.substring(key.lastIndexOf(":") +1);
			goodsMap.put(format.parse(dateKey), goodsList);
		}
		return goodsMap;
	}

	@Override
	public void addFoot(int userId, int goodsId) {

		// 足迹点击次数key
		String footNumKey = getFootNumKey(userId, goodsId);
		// 时间
		String footTimeKey = getFootTimeKey(userId);

		// 判断点击次数是否存在
		if (!jedis.exists(footNumKey)) {
			// 不存在，添加
			jedis.set(footNumKey, "1");
		} else {
			// 存在，value自增1
			jedis.incr(footNumKey);
		}
		String id = String.valueOf(goodsId);
		String str = jedis.get(footTimeKey);

		if (str != null ) {
			if (!str.contains(id)) {
				str = id+","+str;
			}
		} else {
			str = id;
		}
		// 时间
		jedis.set(footTimeKey, str);
	}

	// 足迹key
	private String getFootKey(int userId) {
		return FootConstant.USER_FOOT.getValue() + userId;
	}

	// 足迹点击次数key
	private String getFootNumKey(int userId, int goodsId) {
		return FootConstant.USER_FOOT.getValue() + userId + FootConstant.GOODS.getValue() + goodsId;
	}

	private String getFootTimeKey(int userId) {
		return FootConstant.USER_TIME.getValue() + userId + ":" + new SimpleDateFormat("yyyy-MM-dd").format(new Date());
	}

	@Override
	public void deleteFoot(int proId,String time,int userId) {
		String id = String.valueOf(proId);
		String footTimeKey = FootConstant.USER_TIME.getValue()+userId+":"+time;
		String string = jedis.get(footTimeKey);
		if(string!=null && string.contains(id)) {
			boolean contains = string.contains(",");
			if(!contains){
				jedis.del(footTimeKey);
			}else if(string.endsWith(id)) {
				string = string.replace(","+id, "");
				jedis.set(footTimeKey, string);
			}else {
				string = string.replace(id+",", "");
				jedis.set(footTimeKey, string);
			}
		}
	}
}
