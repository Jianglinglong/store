package com.team.store.mapper;

import com.team.store.po.ProBrand;
import com.team.store.po.ProBrandExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface ProBrandMapper {
    int countByExample(ProBrandExample example);

    int deleteByExample(ProBrandExample example);

    int deleteByPrimaryKey(Integer pbId);

    int insert(ProBrand record);

    int insertSelective(ProBrand record);

    List<ProBrand> selectByExample(ProBrandExample example);

    ProBrand selectByPrimaryKey(Integer pbId);

    int updateByExampleSelective(@Param("record") ProBrand record, @Param("example") ProBrandExample example);

    int updateByExample(@Param("record") ProBrand record, @Param("example") ProBrandExample example);

    int updateByPrimaryKeySelective(ProBrand record);

    int updateByPrimaryKey(ProBrand record);
}