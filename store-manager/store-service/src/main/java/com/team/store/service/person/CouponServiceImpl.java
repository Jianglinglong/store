package com.team.store.service.person;

import com.team.store.mapper.CouponInfoMapper;
import com.team.store.po.CouponInfo;
import com.team.store.po.CouponInfoExample;
import com.team.store.po.UserInfo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.Date;
import java.util.List;

/**
 * 优惠券
 */
@Service("couponService")
public class CouponServiceImpl implements CouponService {
    @Autowired
    private CouponInfoMapper couponMapper;

    //获取优惠券
    public List<CouponInfo> getCoupon(UserInfo user){
        CouponInfoExample example = new CouponInfoExample();
        CouponInfoExample.Criteria criteria = example.createCriteria();
        criteria.andUserIdEqualTo(user.getUserId());
        List<CouponInfo> coupons = couponMapper.selectByExample(example);
        return coupons;
    }

    @Override
    public CouponInfo getCoupon(UserInfo user, int couponId) {
        CouponInfo couponInfo = couponMapper.selectByPrimaryKey(couponId);
       //注 这两个id相同 但是进不去判断  所有我删了判断  徐帆
        if( couponInfo != null&& couponInfo.getUserId().equals(user.getUserId())){
        	return couponInfo;
        }
        return null;
    }

    @Override
    public int userCoupon(UserInfo user,int couponId) {

        return 0;
    }

    @Override
    public int deleteCoupon(UserInfo user, int couponId) {
        CouponInfo couponInfo = couponMapper.selectByPrimaryKey(couponId);
        //判断删除的优惠券是否属于该用户
        if (couponInfo.getUserId().equals(user.getUserId())){
           return couponMapper.deleteByPrimaryKey(couponId);
        }
        return 0;
    }

    @Override
    public int addCoupon(UserInfo user, Integer couponId) {
        CouponInfo couponInfo = couponMapper.selectByPrimaryKey(couponId);
        //判断该用户下是否有这张优惠券
        if (couponInfo == null && couponInfo.getUserId() != user.getUserId()){
            couponInfo.setUserId(user.getUserId());
            return couponMapper.insert(couponInfo);
        }
        return 0;
    }

    @Override
    public List<CouponInfo> getAvailableCoupon(int userId) {
        CouponInfoExample couponInfoExample = new CouponInfoExample();
        CouponInfoExample.Criteria criteria = couponInfoExample.createCriteria();
        criteria.andCouponStateNotEqualTo("0")
                .andCouponEndtimeGreaterThanOrEqualTo(new Date())
                .andUserIdEqualTo(userId);
        return couponMapper.selectByExample(couponInfoExample);
    }

    @Override
    public List<CouponInfo> getAvilableCoupon(int userId, int condition) {
        CouponInfoExample couponInfoExample = new CouponInfoExample();
        CouponInfoExample.Criteria criteria = couponInfoExample.createCriteria();
        criteria.andCouponStateNotEqualTo("0")
                .andCouponConditionLessThanOrEqualTo(condition)
                .andCouponEndtimeGreaterThanOrEqualTo(new Date())
                .andUserIdEqualTo(userId);
        return couponMapper.selectByExample(couponInfoExample);
    }
}
