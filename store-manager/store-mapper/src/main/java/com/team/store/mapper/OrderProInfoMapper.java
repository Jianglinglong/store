package com.team.store.mapper;

import com.team.store.po.OrderProInfo;
import com.team.store.po.OrderProInfoExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface OrderProInfoMapper {
    int countByExample(OrderProInfoExample example);

    int deleteByExample(OrderProInfoExample example);

    int deleteByPrimaryKey(Integer orderProId);

    int insert(OrderProInfo record);

    int insertSelective(OrderProInfo record);

    List<OrderProInfo> selectByExample(OrderProInfoExample example);

    OrderProInfo selectByPrimaryKey(Integer orderProId);

    int updateByExampleSelective(@Param("record") OrderProInfo record, @Param("example") OrderProInfoExample example);

    int updateByExample(@Param("record") OrderProInfo record, @Param("example") OrderProInfoExample example);

    int updateByPrimaryKeySelective(OrderProInfo record);

    int updateByPrimaryKey(OrderProInfo record);
}