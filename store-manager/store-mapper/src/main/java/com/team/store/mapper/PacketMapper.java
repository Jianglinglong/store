package com.team.store.mapper;

import com.team.store.po.PacketExample;
import com.team.store.po.Packet;
import org.apache.ibatis.annotations.Param;

import java.util.List;

public interface PacketMapper {
    int countByExample(PacketExample example);

    int deleteByExample(PacketExample example);

    int deleteByPrimaryKey(int packetId);

    int insert(Packet record);


    int insertSelective(Packet record);

    List<Packet> selectByExample(PacketExample example);

    Packet selectByPrimaryKey(int packetId);

    int updateByExampleSelective(@Param("record") Packet record, @Param("example") PacketExample example);

    int updateByExample(@Param("record") Packet record, @Param("example") PacketExample example);

    int updateByPrimaryKeySelective(Packet record);

    int updateByPrimaryKey(Packet record);
}