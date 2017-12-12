package com.team.store.mapper;

import java.util.List;

import com.team.store.po.PointInfo;
import com.team.store.po.PointInfoExample;
import org.apache.ibatis.annotations.Param;

public interface PointInfoMapper {
    int countByExample(PointInfoExample example);

    int deleteByExample(PointInfoExample example);

    int deleteByPrimaryKey(int pointId);

    int insert(PointInfo record);

    int insertSelective(PointInfo record);

    List<PointInfo> selectByExample(PointInfoExample example);

    PointInfo selectByPrimaryKey(int pointId);

    int updateByExampleSelective(@Param("record") PointInfo record, @Param("example") PointInfoExample example);

    int updateByExample(@Param("record") PointInfo record, @Param("example") PointInfoExample example);

    int updateByPrimaryKeySelective(PointInfo record);

    int updateByPrimaryKey(PointInfo record);
}