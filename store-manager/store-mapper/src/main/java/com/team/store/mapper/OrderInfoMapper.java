package com.team.store.mapper;

import com.team.store.po.OrderInfo;
import com.team.store.po.OrderInfoExample;
import com.team.store.vo.UserOrder;
import com.team.store.vo.rl.OrderAndProduct;

import java.util.Date;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface OrderInfoMapper {
    int countByExample(OrderInfoExample example);

    int deleteByExample(OrderInfoExample example);

    int deleteByPrimaryKey(int orderId);

    int insert(OrderInfo record);

    int insertSelective(OrderInfo record);

    List<OrderInfo> selectByExample(OrderInfoExample example);

    OrderInfo selectByPrimaryKey(int orderId);

    int updateByExampleSelective(@Param("record") OrderInfo record, @Param("example") OrderInfoExample example);

    int updateByExample(@Param("record") OrderInfo record, @Param("example") OrderInfoExample example);

    int updateByPrimaryKeySelective(OrderInfo record);

    int updateByPrimaryKey(OrderInfo record);

    List<OrderAndProduct> getOrderAndProductListById(int proId);
    List<OrderAndProduct> getOrderAndProductList(int userId);

    /**
     * 根据时间段获取用户订单及商品
     * @param userId
     * @param begin
     * @param end
     * @return
     */
    List<UserOrder> getCostByUserIdBetween(int userId, Date begin, Date end);
}