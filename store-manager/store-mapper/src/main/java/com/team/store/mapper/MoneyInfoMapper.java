package com.team.store.mapper;

import com.team.store.po.MoneyInfo;
import com.team.store.po.MoneyInfoExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface MoneyInfoMapper {
    int countByExample(MoneyInfoExample example);

    int deleteByExample(MoneyInfoExample example);

    int deleteByPrimaryKey(int monId);

    int insert(MoneyInfo record);

    int insertSelective(MoneyInfo record);

    List<MoneyInfo> selectByExample(MoneyInfoExample example);

    MoneyInfo selectByPrimaryKey(int monId);

    int updateByExampleSelective(@Param("record") MoneyInfo record, @Param("example") MoneyInfoExample example);

    int updateByExample(@Param("record") MoneyInfo record, @Param("example") MoneyInfoExample example);

    int updateByPrimaryKeySelective(MoneyInfo record);

    int updateByPrimaryKey(MoneyInfo record);
}