package com.team.store.mapper;

import com.team.store.po.BackOrder;
import com.team.store.po.BackOrderExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface BackOrderMapper {
    int countByExample(BackOrderExample example);

    int deleteByExample(BackOrderExample example);

    int deleteByPrimaryKey(int backId);

    int insert(BackOrder record);

    int insertSelective(BackOrder record);

    List<BackOrder> selectByExample(BackOrderExample example);

    BackOrder selectByPrimaryKey(int backId);

    int updateByExampleSelective(@Param("record") BackOrder record, @Param("example") BackOrderExample example);

    int updateByExample(@Param("record") BackOrder record, @Param("example") BackOrderExample example);

    int updateByPrimaryKeySelective(BackOrder record);

    int updateByPrimaryKey(BackOrder record);
}