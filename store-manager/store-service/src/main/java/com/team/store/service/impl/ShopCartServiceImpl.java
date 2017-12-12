package com.team.store.service.impl;

import java.util.List;

import com.team.store.mapper.ShopCartMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Service;

import com.team.store.po.ShopCart;
import com.team.store.po.ShopCartExample;
import com.team.store.service.ShopCartService;
@Service("shopCartService")
public class ShopCartServiceImpl implements ShopCartService {
	@Autowired
	@Qualifier("shopCartMapper")
	private ShopCartMapper shopCartMapper;
	@Override
	public int addShopCart(ShopCart shopCart) {
		return shopCartMapper.insert(shopCart);
	}

	@Override
	public List<ShopCart> listShopCart(int userId) {
		//创建查询订单 的条件
		ShopCartExample ex = new ShopCartExample();
		com.team.store.po.ShopCartExample.Criteria crt = ex.createCriteria();
		//用户Id
		crt.andUserIdEqualTo(userId);
		List<ShopCart> list = shopCartMapper.selectByExample(ex);
		return list;
	}

	@Override
	public int deleteShopCart(int shopcartId) {
		//创建查询订单 的条件
		ShopCartExample ex = new ShopCartExample();
		com.team.store.po.ShopCartExample.Criteria crt = ex.createCriteria();
		//用户Id
		crt.andShopcartIdEqualTo(shopcartId);
		return shopCartMapper.deleteByExample(ex);
	}

	@Override
	public ShopCart getShopCartById(int shopcartId) {
		//创建查询订单 的条件
		ShopCartExample ex = new ShopCartExample();
		com.team.store.po.ShopCartExample.Criteria crt = ex.createCriteria();
		//用户Id
		crt.andShopcartIdEqualTo(shopcartId);
		List<ShopCart> list = shopCartMapper.selectByExample(ex);
		return list.get(0);
	}

	@Override
	public int updateShopCart(ShopCart shopCart) {
		ShopCartExample ex = new ShopCartExample();
		com.team.store.po.ShopCartExample.Criteria crt = ex.createCriteria();
		crt.andShopcartIdEqualTo(shopCart.getShopcartId());
		return shopCartMapper.updateByExampleSelective(shopCart, ex);
	}

}
