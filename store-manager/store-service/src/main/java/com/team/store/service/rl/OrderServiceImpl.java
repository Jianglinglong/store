package com.team.store.service.rl;

import java.util.List;
import java.util.Set;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Service;

import com.team.store.mapper.AppraiseInfoMapper;
import com.team.store.mapper.OrderInfoMapper;
import com.team.store.mapper.OrderProInfoMapper;
import com.team.store.mapper.ProductInfoMapper;
import com.team.store.po.AppraiseInfo;
import com.team.store.po.OrderInfo;
import com.team.store.po.OrderInfoExample;
import com.team.store.po.OrderInfoExample.Criteria;
import com.team.store.po.OrderProInfo;
import com.team.store.po.OrderProInfoExample;
import com.team.store.po.ProductInfo;
import com.team.store.vo.rl.AppraiseAndProduct;
import com.team.store.vo.rl.OrderAndProduct;
@Service("orderService1")
public class OrderServiceImpl implements OrderService {
	@Autowired
	@Qualifier("orderInfoMapper")
	private OrderInfoMapper mapper;
	@Autowired
	@Qualifier("appraiseInfoMapper")
	private AppraiseInfoMapper app;
	@Autowired
	@Qualifier("productInfoMapper")
	private ProductInfoMapper prt;
	@Autowired
	@Qualifier("orderProInfoMapper")
	private OrderProInfoMapper opf;
	
//根据ID查询订单和商品信息；
	@Override
	public List<OrderAndProduct> getOrderAndProductListById(int proId) {
		
		List<OrderAndProduct> orderAndProduct = mapper.getOrderAndProductListById(proId);
		
		return orderAndProduct;
	}

//	查询所有的订单和商品信息；
	@Override
	public List<OrderAndProduct> getOrderAndProductList(int userId) {
		
		return mapper.getOrderAndProductList(userId);
	}
//	根据用户ID查询订单信息；
	@Override
	public List<OrderInfo> getOrder(int userId) {
		
		OrderInfoExample example = new OrderInfoExample();
		Criteria crt = example.createCriteria();
		crt.andUserIdEqualTo(userId);
		return mapper.selectByExample(example);
	}
	
// 添加商品到
	@Override
	public int addAprraise(AppraiseInfo apprasie) {
		return app.insert(apprasie);
	}
//通过orderId查询订单信息；
	@Override
	public OrderInfo getOrderInfoById(int orderId) {
		// TODO Auto-generated method stub
		OrderInfoExample example = new OrderInfoExample();
		Criteria crt = example.createCriteria();
		crt.andOrderIdEqualTo(orderId);
		return mapper.selectByExample(example).get(0);
	}

	@Override
//	删除订单；
	public int deleteOrder(int orderId) {
		// TODO Auto-generated method stub
		
		return mapper.deleteByPrimaryKey(orderId);
	}

	@Override
	public int addOrder(OrderInfo order) {
		return 0;
	}

	@Override
	public int addOrderPro(OrderProInfo oap) {
		return 0;
	}

	@Override
	public List<OrderProInfo> getOrderPro(int orderId) {
		
		return null;
	}

	@Override
	public Set<AppraiseAndProduct> getAppraise2(int userId) {
		// TODO Auto-generated method stub
		
		return app.getAppraise2(userId);
	}
//根据商品Id查询商品信息；
	@Override
	public ProductInfo getProductInfoById(int proId) {
		return prt.selectByPrimaryKey(proId);
		
	}
//根据proId和orderId查询关系表的全部信息；
	@Override
	public OrderProInfo getAllById(int proId, int orderId) {
		// TODO Auto-generated method stub
		OrderProInfoExample example = new OrderProInfoExample();
		OrderProInfoExample.Criteria crt = example.createCriteria();
		crt.andOrderIdEqualTo(orderId).andProIdEqualTo(proId);
		
		
		return opf.selectByExample(example).get(0);
	}

	@Override
	public int updateStatus(OrderProInfo opi) {
		// TODO Auto-generated method stub
		return opf.updateByPrimaryKey(opi);
	}
//修改訂單信息；
	@Override
	public int updateOrderInfo(OrderInfo orderInfo) {
		
		// TODO Auto-generated method stub
		return mapper.updateByPrimaryKey(orderInfo);
	}
//删除关系表；
	@Override
	public int deleteOrderProduct(int orderId) {
		OrderProInfoExample example = new OrderProInfoExample();
		 OrderProInfoExample.Criteria crt = example.createCriteria();
		crt.andOrderIdEqualTo(orderId);
		return opf.deleteByExample(example);
	}
}

