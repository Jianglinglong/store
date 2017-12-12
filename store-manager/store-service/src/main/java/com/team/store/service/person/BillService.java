package com.team.store.service.person;

import com.team.store.service.rl.OrderService;
import com.team.store.vo.UserOrder;

import java.util.Date;
import java.util.List;

public interface BillService extends OrderService{
    double getSumCost(int userId);
    double getSumCost(int userId, Date begin,Date end);
    List<UserOrder> getOrders(int userId , Date begin ,Date end);
}
