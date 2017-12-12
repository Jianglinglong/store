package com.team.store.service.person;

import com.team.store.po.Packet;
import com.team.store.po.UserInfo;

import java.util.List;

public interface UserPacketService {
    Packet getPacketById(int packetId);
    //获取红包
    List<Packet> getPackets(UserInfo user);
    //领红包
    void getPacketFromUser(int packetId , UserInfo accept);
    //使用红包
    boolean usePacket(int packetId,double money);
}
