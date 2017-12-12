package com.team.store.mapper;

import java.util.List;

import com.team.store.po.CouponInfo;
import com.team.store.po.CouponInfoExample;
import org.apache.ibatis.annotations.Param;

public interface CouponInfoMapper {
    int countByExample(CouponInfoExample example);

    int deleteByExample(CouponInfoExample example);

    int deleteByPrimaryKey(int couponId);

    int insert(CouponInfo record);

    int insertSelective(CouponInfo record);

    List<CouponInfo> selectByExample(CouponInfoExample example);

    CouponInfo selectByPrimaryKey(int couponId);

    int updateByExampleSelective(@Param("record") CouponInfo record, @Param("example") CouponInfoExample example);

    int updateByExample(@Param("record") CouponInfo record, @Param("example") CouponInfoExample example);

    int updateByPrimaryKeySelective(CouponInfo record);

    int updateByPrimaryKey(CouponInfo record);
}