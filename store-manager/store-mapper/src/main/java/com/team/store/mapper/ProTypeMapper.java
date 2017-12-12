package com.team.store.mapper;

import com.team.store.po.ProType;
import com.team.store.po.ProTypeExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface ProTypeMapper {
    int countByExample(ProTypeExample example);

    int deleteByExample(ProTypeExample example);

    int deleteByPrimaryKey(Integer ptId);

    int insert(ProType record);

    int insertSelective(ProType record);

    List<ProType> selectByExample(ProTypeExample example);

    ProType selectByPrimaryKey(Integer ptId);

    int updateByExampleSelective(@Param("record") ProType record, @Param("example") ProTypeExample example);

    int updateByExample(@Param("record") ProType record, @Param("example") ProTypeExample example);

    int updateByPrimaryKeySelective(ProType record);

    int updateByPrimaryKey(ProType record);
}