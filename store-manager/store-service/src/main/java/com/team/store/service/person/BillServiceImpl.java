package com.team.store.service.person;

import com.team.store.mapper.OrderInfoMapper;
import com.team.store.po.OrderInfo;
import com.team.store.po.OrderInfoExample;
import com.team.store.service.rl.OrderServiceImpl;
import com.team.store.vo.UserOrder;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.Date;
import java.util.List;
@Service("billService")
public class BillServiceImpl extends OrderServiceImpl implements BillService {
    @Autowired
    private OrderInfoMapper orderMapper;

    /**
     * 获取用户的所有消费
     * @param userId
     * @return
     */
    @Override
    public double getSumCost(int userId) {
        OrderInfoExample orderInfoExample = new OrderInfoExample();
        orderInfoExample.createCriteria().andUserIdEqualTo(userId);
        List<OrderInfo> orderInfos = orderMapper.selectByExample(orderInfoExample);
        return getSumCost(orderInfos);
    }

    /**
     * 获取一段时间内的用户消费
     * @param userId
     * @param begin
     * @param end
     * @return
     */
    @Override
    public double getSumCost(int userId, Date begin, Date end) {
        if (begin ==null || end==null || begin.after(end)){
            throw new RuntimeException("时间段不合法");
        }
        List<UserOrder> userOrders = orderMapper.getCostByUserIdBetween(userId, begin, end);
        OrderInfoExample orderInfoExample = new OrderInfoExample();
        orderInfoExample.createCriteria().andUserIdEqualTo(userId).andOrderTimeBetween(begin,end);
        List<OrderInfo> orderInfos = orderMapper.selectByExample(orderInfoExample);
        return getSumCost(orderInfos);
    }

    @Override
    public List<UserOrder> getOrders(int userId, Date begin, Date end) {
        if (begin ==null || end==null || begin.after(end)){
            throw new RuntimeException("时间段不合法");
        }
        List<UserOrder> userOrders = orderMapper.getCostByUserIdBetween(userId, begin, end);
        return userOrders;
    }

    /**
     * 计算订单总消费
     * @param orders
     * @return
     */
    private double getSumCost(List<OrderInfo> orders){
        double orderPrice = 0;
        if (orders != null){
            for (OrderInfo order : orders){
                orderPrice += order.getOrderPrice();
            }
        }
        return orderPrice;
    }
}
