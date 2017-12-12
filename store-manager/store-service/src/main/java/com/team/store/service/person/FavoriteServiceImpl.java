package com.team.store.service.person;

import com.alibaba.fastjson.JSON;
import com.team.store.consts.FootConstant;
import com.team.store.mapper.FavoriteMapper;
import com.team.store.mapper.ProductInfoMapper;
import com.team.store.po.Favorite;
import com.team.store.po.FavoriteExample;
import com.team.store.po.ProductInfo;
import com.team.store.utils.CollectionUtils;
import com.team.store.vo.FavoritePro;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import redis.clients.jedis.Jedis;

import javax.annotation.Resource;

import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Date;
import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.TreeMap;

@Service("favoriteService")
public class FavoriteServiceImpl implements FavoriteService {
	@Resource(name = "jedis")
	private Jedis jedis;
	@Autowired
	private FavoriteMapper favoriteMapper;
	@Autowired
	private ProductInfoMapper productMapper;
	private final String KEY_PREFIX = "user:favorite:";

	@Override
	public boolean addToFavorite(int userId, int proId) {
		Date now = new Date();
		SimpleDateFormat simpleDateFormat = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");
		String favoriteKey = favoriteKey(userId);
		String id = String.valueOf(proId);
		String favoritePro = jedis.hget(favoriteKey, id);
		jedis.hset(favoriteKey, id, simpleDateFormat.format(now));
		if (favoritePro == null) {
			Favorite favorite = new Favorite();
			favorite.setProId(proId);
			favorite.setFavoriteTime(now);
			favoriteMapper.insert(favorite);
			return true;
		}
		return false;
	}

	@Override
	public void deleteFavorite(int userId, int proId) {
		String favoriteKey = favoriteKey(userId);
		String id = String.valueOf(proId);
		String favoritePro = jedis.hget(favoriteKey, id);
		jedis.hset(favoriteKey, id, null);
		if (favoritePro != null) {
			FavoriteExample example = new FavoriteExample();
			example.createCriteria().andProIdEqualTo(proId);
			favoriteMapper.deleteByExample(example);
		}
	}

	@Override
	public TreeMap<String, ProductInfo> getFavorites(int userId) {
		String favoriteKey = favoriteKey(userId);
		Map<String, String> favorte = jedis.hgetAll(favoriteKey);
		Set<String> keySet = favorte.keySet();
		TreeMap<String, ProductInfo> favoriteMap = new TreeMap<>(Collections.reverseOrder());
		for(String id : keySet) {
			String goodsKey = goodsKey(id);
			String string = jedis.get(goodsKey);
			String time = favorte.get(id);
			ProductInfo productInfo = null;
			if(string!=null) {
				productInfo=JSON.parseObject(string,ProductInfo.class);
			}else {
				productInfo = productMapper.selectByPrimaryKey(Integer.parseInt(id));
				jedis.set(goodsKey, JSON.toJSONString(productInfo));
			}
			favoriteMap.put(time, productInfo);
		}
		return favoriteMap;
	}

	private String favoriteKey(int userId) {
		return KEY_PREFIX + userId;
	}
	private String goodsKey(String id) {
		return FootConstant._GOODS.getValue()+id;
	}
}
