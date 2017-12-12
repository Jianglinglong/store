package com.team.store.mapper;

import com.team.store.po.ProductClass;
import com.team.store.po.ProductClassExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface ProductClassMapper {
    int countByExample(ProductClassExample example);

    int deleteByExample(ProductClassExample example);

    int deleteByPrimaryKey(Integer pcId);

    int insert(ProductClass record);

    int insertSelective(ProductClass record);

    List<ProductClass> selectByExample(ProductClassExample example);

    ProductClass selectByPrimaryKey(Integer pcId);

    int updateByExampleSelective(@Param("record") ProductClass record, @Param("example") ProductClassExample example);

    int updateByExample(@Param("record") ProductClass record, @Param("example") ProductClassExample example);

    int updateByPrimaryKeySelective(ProductClass record);

    int updateByPrimaryKey(ProductClass record);
}