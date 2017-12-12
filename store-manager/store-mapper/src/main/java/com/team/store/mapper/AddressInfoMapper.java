package com.team.store.mapper;

import java.util.List;

import com.team.store.po.AddressInfo;
import com.team.store.po.AddressInfoExample;
import org.apache.ibatis.annotations.Param;

public interface AddressInfoMapper {
    int countByExample(AddressInfoExample example);

    int deleteByExample(AddressInfoExample example);

    int deleteByPrimaryKey(int addrId);

    int insert(AddressInfo record);

    int insertSelective(AddressInfo record);

    List<AddressInfo> selectByExample(AddressInfoExample example);

    AddressInfo selectByPrimaryKey(int addrId);
    
    AddressInfo selectAddressByPrimaryKey(int addrId);
    
    List<AddressInfo> selectAddressByUserKey(int userId);

    int updateByExampleSelective(@Param("record") AddressInfo record, @Param("example") AddressInfoExample example);

    int updateByExample(@Param("record") AddressInfo record, @Param("example") AddressInfoExample example);

    int updateByPrimaryKeySelective(AddressInfo record);

    int updateByPrimaryKey(AddressInfo record);
}