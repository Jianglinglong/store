package com.team.store.mapper;

import com.team.store.po.ProTotalSales;
import com.team.store.po.ProTotalSalesExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface ProTotalSalesMapper {
    int countByExample(ProTotalSalesExample example);

    int deleteByExample(ProTotalSalesExample example);

    int deleteByPrimaryKey(Integer psId);

    int insert(ProTotalSales record);

    int insertSelective(ProTotalSales record);

    List<ProTotalSales> selectByExample(ProTotalSalesExample example);

    ProTotalSales selectByPrimaryKey(Integer psId);

    int updateByExampleSelective(@Param("record") ProTotalSales record, @Param("example") ProTotalSalesExample example);

    int updateByExample(@Param("record") ProTotalSales record, @Param("example") ProTotalSalesExample example);

    int updateByPrimaryKeySelective(ProTotalSales record);

    int updateByPrimaryKey(ProTotalSales record);
}