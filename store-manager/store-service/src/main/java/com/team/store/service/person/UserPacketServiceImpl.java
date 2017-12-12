package com.team.store.service.person;

import com.team.store.mapper.PacketMapper;
import com.team.store.po.Packet;
import com.team.store.po.PacketExample;
import com.team.store.po.UserInfo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service("packetService")
public class UserPacketServiceImpl implements UserPacketService {
    @Autowired
    private PacketMapper packetMapper;

    @Override
    public Packet getPacketById(int packetId) {
        return packetMapper.selectByPrimaryKey(packetId);
    }

    @Override
    //获取用户红包
    public List<Packet> getPackets(UserInfo user) {
        PacketExample example = new PacketExample();
        PacketExample.Criteria criteria = example.createCriteria();
        criteria.andUserIdEqualTo(user.getUserId());
        List<Packet> packets = packetMapper.selectByExample(example);
        return packets;
    }

    @Override
    //领红包
    public void getPacketFromUser(int packetId, UserInfo accept) {
        Packet packet = getPacketById(packetId);
        packet.setUserId(accept.getUserId());
        packetMapper.insert(packet);
    }

    @Override
    //使用红包
    public boolean usePacket(int packetId, double money) {
        Packet packet = getPacketById(packetId);
        double remainMoney = packet.getPacketRemainMoney() - money;
        if (remainMoney < 0) {
            return false;
        }
        PacketExample packetExample = new PacketExample();
        PacketExample.Criteria criteria = packetExample.createCriteria();
        criteria.andUserIdEqualTo(packet.getUserId());
        criteria.andPacketRemainMoneyEqualTo(packet.getPacketRemainMoney());
//        设置新的红包余额
        packet.setPacketRemainMoney(remainMoney);
        if (remainMoney == 0) {
            packetMapper.deleteByPrimaryKey(packetId);
        } else {
            packetMapper.updateByExampleSelective(packet, packetExample);
        }
        return true;
    }

}
