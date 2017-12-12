package com.team.store.mapper;

import com.team.store.po.ShopCart;
import com.team.store.po.ShopCartExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface ShopCartMapper {
    int countByExample(ShopCartExample example);

    int deleteByExample(ShopCartExample example);

    int insert(ShopCart record);

    int insertSelective(ShopCart record);

    List<ShopCart> selectByExample(ShopCartExample example);

    int updateByExampleSelective(@Param("record") ShopCart record, @Param("example") ShopCartExample example);

    int updateByExample(@Param("record") ShopCart record, @Param("example") ShopCartExample example);
}