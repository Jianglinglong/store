package com.team.store.service;

import java.util.List;

import com.team.store.po.ShopCart;

public interface ShopCartService {
	int addShopCart(ShopCart shopCart);
	int deleteShopCart(int shopcartId);
	int updateShopCart(ShopCart shopCart);
	//根据购物车id得到购物车信息
	ShopCart getShopCartById(int shopcartId);
	List<ShopCart> listShopCart(int userId);
}
