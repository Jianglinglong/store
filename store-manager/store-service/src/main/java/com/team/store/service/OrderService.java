package com.team.store.service;

import java.util.List;

import com.team.store.po.OrderInfo;
import com.team.store.po.OrderProInfo;

public interface OrderService {
    //添加单个订单

    int addOrder(OrderInfo order);

    //通过用户查询所有的订单
    List<OrderInfo> getOrder(int userId);

    //添加订单商品关系表
    int addOrderPro(OrderProInfo oap);

    //通过用户查询所有的订单
    List<OrderProInfo> getOrderPro(int orderId);

}
