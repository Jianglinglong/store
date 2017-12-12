//package com.team.store.service.impl;
//
//import java.util.List;
//
//import org.springframework.beans.factory.annotation.Autowired;
//import org.springframework.beans.factory.annotation.Qualifier;
//import org.springframework.stereotype.Service;
//
//import com.team.store.mapper.OrderInfoMapper;
//import com.team.store.mapper.OrderProInfoMapper;
//import com.team.store.po.OrderInfo;
//import com.team.store.po.OrderInfoExample;
//import com.team.store.po.OrderProInfo;
//import com.team.store.po.OrderProInfoExample;
//import com.team.store.service.rl.OrderService;
//import com.team.store.vo.rl.OrderAndProduct;
//@Service("orderService")
//public class OrderServiceImpl implements OrderService {
//	@Autowired
//	@Qualifier("orderInfoMapper")
//	private OrderInfoMapper orderInfoMapper;
//	@Autowired
//	@Qualifier("orderProInfoMapper")
//	private OrderProInfoMapper orderProInfoMapper;
//	@Override
//	public int addOrder(OrderInfo order) {
//		return orderInfoMapper.insert(order);
//	}
//	@Override
//	public int addOrderPro(OrderProInfo oap) {
//		return orderProInfoMapper.insert(oap);
//	}
//	@Override
//	public List<OrderInfo> getOrder(int userId) {
//		//创建查询订单 的条件
//		OrderInfoExample ex = new OrderInfoExample();
//		com.team.store.po.OrderInfoExample.Criteria crt = ex.createCriteria();
//		//用户Id
//		crt.andUserIdEqualTo(userId);
//		List<OrderInfo> list = orderInfoMapper.selectByExample(ex);
//		return list;
//	}
//	@Override
//	public List<OrderProInfo> getOrderPro(int orderId) {
//		//创建查询订单商品关系表 的条件
//		OrderProInfoExample ex = new OrderProInfoExample();
//		com.team.store.po.OrderProInfoExample.Criteria crt = ex.createCriteria();
//		//订单Id
//		crt.andUserIdEqualTo(orderId);
//		List<OrderProInfo> list = orderProInfoMapper.selectByExample(ex);
//		return list;
//	}
//	@Override
//	public List<OrderAndProduct> getOrderAndProductListById(int proId) {
//		// TODO Auto-generated method stub
//		return null;
//	}
//	@Override
//	public List<OrderAndProduct> getOrderAndProductList(int userId) {
//		// TODO Auto-generated method stub
//		return null;
//	}
//
//}
package com.team.store.service.impl;

import java.util.List;

import com.team.store.mapper.OrderInfoMapper;
import com.team.store.mapper.OrderProInfoMapper;
import com.team.store.po.OrderInfo;
import com.team.store.po.OrderInfoExample;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Service;

import com.team.store.po.OrderProInfo;
import com.team.store.po.OrderProInfoExample;
import com.team.store.service.OrderService;
@Service("orderService")
public class OrderServiceImpl implements OrderService {
	@Autowired
	@Qualifier("orderInfoMapper")
	private OrderInfoMapper orderInfoMapper;
	@Autowired
	@Qualifier("orderProInfoMapper")
	private OrderProInfoMapper orderProInfoMapper;
	@Override
	public int addOrder(OrderInfo order) {
		return orderInfoMapper.insert(order);
	}
	@Override
	public int addOrderPro(OrderProInfo oap) {
		return orderProInfoMapper.insert(oap);
	}
	@Override
	public List<OrderInfo> getOrder(int userId) {
		//创建查询订单 的条件
		OrderInfoExample ex = new OrderInfoExample();
		com.team.store.po.OrderInfoExample.Criteria crt = ex.createCriteria();
		//用户Id
		crt.andUserIdEqualTo(userId);
		List<OrderInfo> list = orderInfoMapper.selectByExample(ex);
		return list;
	}
	@Override
	public List<OrderProInfo> getOrderPro(int orderId) {
		//创建查询订单商品关系表 的条件
		OrderProInfoExample ex = new OrderProInfoExample();
		com.team.store.po.OrderProInfoExample.Criteria crt = ex.createCriteria();
		//订单Id
		crt.andUserIdEqualTo(orderId);
		List<OrderProInfo> list = orderProInfoMapper.selectByExample(ex);
		return list;
	}

}
