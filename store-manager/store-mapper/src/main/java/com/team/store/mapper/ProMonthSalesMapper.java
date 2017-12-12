package com.team.store.mapper;

import com.team.store.po.ProMonthSales;
import com.team.store.po.ProMonthSalesExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface ProMonthSalesMapper {
    int countByExample(ProMonthSalesExample example);

    int deleteByExample(ProMonthSalesExample example);

    int deleteByPrimaryKey(Integer pmsId);

    int insert(ProMonthSales record);

    int insertSelective(ProMonthSales record);

    List<ProMonthSales> selectByExample(ProMonthSalesExample example);

    ProMonthSales selectByPrimaryKey(Integer pmsId);

    int updateByExampleSelective(@Param("record") ProMonthSales record, @Param("example") ProMonthSalesExample example);

    int updateByExample(@Param("record") ProMonthSales record, @Param("example") ProMonthSalesExample example);

    int updateByPrimaryKeySelective(ProMonthSales record);

    int updateByPrimaryKey(ProMonthSales record);
}