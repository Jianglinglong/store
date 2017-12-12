package com.team.store.service.rl;

import java.util.List;
import java.util.Set;

import com.team.store.po.AppraiseInfo;
import com.team.store.po.OrderInfo;
import com.team.store.po.OrderProInfo;
import com.team.store.po.ProductInfo;
import com.team.store.vo.rl.AppraiseAndProduct;
import com.team.store.vo.rl.OrderAndProduct;

public interface OrderService {
//添加单个订单
	int addOrder(OrderInfo order);
//	删除订单；
	int deleteOrder(int orderId);
//	删除关系表；
	int deleteOrderProduct(int orderId);
	//通过用户查询所有的订单
	List<OrderInfo> getOrder(int userId);
	
	//添加订单商品关系表
	int addOrderPro(OrderProInfo oap);
	//通过用户查询所有的订单
	List<OrderProInfo> getOrderPro(int orderId);
	//	根据商品id查询订单和商品信息；
	List<OrderAndProduct> getOrderAndProductListById(int orderId);
//	查询对应用户所有的订单和商品；
	List<OrderAndProduct> getOrderAndProductList(int userId);
//	添加评价到评价表；
	int addAprraise(AppraiseInfo apprasie);
//根据订单Id查询订单信息；
	OrderInfo getOrderInfoById(int orderId);
//	根据proId查询评价栏信息；
	Set<AppraiseAndProduct> getAppraise2(int userId);
//	根据商品Id查询商品信息；
	ProductInfo getProductInfoById(int proId);
//	根据proId和orderId查询关系表的信息；
	OrderProInfo getAllById(int proId,int orderId);
//	修改商品评价状态码；
	int updateStatus(OrderProInfo opi);
//	修改order表信息；
	int updateOrderInfo(OrderInfo orderInfo);
	

}
