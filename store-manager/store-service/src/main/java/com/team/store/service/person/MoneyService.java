package com.team.store.service.person;

import com.github.pagehelper.PageInfo;
import com.team.store.consts.AccountMoneyEnumeration;
import com.team.store.consts.TimeEnumeration;
import com.team.store.po.MoneyInfo;
import com.team.store.po.Packet;
import com.team.store.po.UserInfo;

public interface MoneyService {
    /**
     * 获取用户账户
     * @param user
     * @return
     */
    MoneyInfo getAccountMoney(UserInfo user);

    /**
     * 用户消费
     * @param user
     * @param money
     * @return
     */
    boolean payMoney(UserInfo user, double money);

    /**
     * 发红包
     * @param user
     * @param money
     * @return
     */
    Packet createPacket(UserInfo user, double money);

    /**
     * 充值 或者 退款
     * @param user
     * @param money
     * @param type
     * @return
     */
    boolean addMoney(UserInfo user , double money , AccountMoneyEnumeration type);

    /**
     * 根据时间段获取用户账户资金变化明细表，默认每页10条
     * @param user 用户
     * @param page 第几页
     * @param condition 查询的时间段
     * @return
     */
    PageInfo getMoneyCostList(UserInfo user,int page,TimeEnumeration condition);

}
