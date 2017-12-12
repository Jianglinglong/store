package com.team.store.mapper;

import java.util.List;

import com.team.store.po.MoneyOpInfo;
import com.team.store.po.MoneyOpInfoExample;
import org.apache.ibatis.annotations.Param;

public interface MoneyOpInfoMapper {
    int countByExample(MoneyOpInfoExample example);

    int deleteByExample(MoneyOpInfoExample example);

    int deleteByPrimaryKey(int moneyopId);

    int insert(MoneyOpInfo record);

    int insertSelective(MoneyOpInfo record);

    List<MoneyOpInfo> selectByExample(MoneyOpInfoExample example);

    MoneyOpInfo selectByPrimaryKey(int moneyopId);

    int updateByExampleSelective(@Param("record") MoneyOpInfo record, @Param("example") MoneyOpInfoExample example);

    int updateByExample(@Param("record") MoneyOpInfo record, @Param("example") MoneyOpInfoExample example);

    int updateByPrimaryKeySelective(MoneyOpInfo record);

    int updateByPrimaryKey(MoneyOpInfo record);
}