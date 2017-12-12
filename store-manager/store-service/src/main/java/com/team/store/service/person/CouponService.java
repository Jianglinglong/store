package com.team.store.service.person;

import com.team.store.po.CouponInfo;
import com.team.store.po.UserInfo;

import java.util.List;

/**
 * 优惠券
 */
public interface CouponService {
    /**
     * 获取用户所有优惠券
     * @param user
     * @return
     */
    List<CouponInfo> getCoupon(UserInfo user);

    /**
     * 获取用户的优惠券
     * @param user
     * @param couponId
     * @return
     */
    CouponInfo getCoupon(UserInfo user , int couponId);

    /**
     * 使用优惠券
     * @param user
     * @param couponId
     * @return
     */
    int userCoupon(UserInfo user, int couponId);

    /**
     * 删除优惠券
     * @param user
     * @param couponId
     * @return
     */
    int deleteCoupon(UserInfo user , int couponId);

    /**
     * 领取优惠券
     * @param user
     * @param couponId
     * @return
     */
    int addCoupon(UserInfo user, Integer couponId);

    /**
     * 获取用户有效的优惠券
     * @param userId
     * @return
     */
    List<CouponInfo> getAvailableCoupon(int userId);

    /**
     * 获取用户满足条件的优惠券
     * @param userId
     * @param condition
     * @return
     */
    List<CouponInfo> getAvilableCoupon(int userId , int condition);
}
