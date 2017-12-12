package com.team.store.service.person;

import com.team.store.po.PointInfo;
import com.team.store.po.PointOperator;
import com.team.store.po.UserInfo;

import java.util.Date;
import java.util.List;

public interface UserPointService {
    /**
     * 根据用户获取积分
     * @param user
     * @return
     */
    PointInfo getPoint(UserInfo user);

    /**
     * 签到
     * @param user
     * @param signedTime
     * @return
     */
    int addPointBySigned(UserInfo user, Date signedTime);

    /**
     * 评论订单
     * @param user
     * @param orderId
     * @return
     */
    int addPointByCommentOrder(UserInfo user,int orderId);

    /**
     * 验证邮箱
     * @param user
     * @return
     */
    int addPointByEmail(UserInfo user);

    /**
     * 验证手机
     * @param user
     * @return
     */
    int addPointByPhone(UserInfo user);

    /**
     * 兑换商品
     * @param user
     * @param point
     * @return
     */
    int reducePointByExchange(UserInfo user,int point);

    /**
     * 查询用户积分变化明细
     * @param user
     * @param type 1 积分增加 ， -1 积分减少 其它 全部
     * @return
     */
    List<PointOperator>getALlOperator(UserInfo user, int type);
}
