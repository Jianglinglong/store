package com.team.store.mapper;

import java.util.List;

import com.team.store.po.PointOperator;
import com.team.store.po.PointOperatorExample;
import org.apache.ibatis.annotations.Param;

public interface PointOperatorMapper {
    int countByExample(PointOperatorExample example);

    int deleteByExample(PointOperatorExample example);

    int deleteByPrimaryKey(int pointopId);

    int insert(PointOperator record);

    int insertSelective(PointOperator record);

    List<PointOperator> selectByExample(PointOperatorExample example);

    PointOperator selectByPrimaryKey(int pointopId);

    int updateByExampleSelective(@Param("record") PointOperator record, @Param("example") PointOperatorExample example);

    int updateByExample(@Param("record") PointOperator record, @Param("example") PointOperatorExample example);

    int updateByPrimaryKeySelective(PointOperator record);

    int updateByPrimaryKey(PointOperator record);
}