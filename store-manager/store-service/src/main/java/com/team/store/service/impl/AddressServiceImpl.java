package com.team.store.service.impl;

import java.util.List;

import com.team.store.mapper.AddressInfoMapper;
import com.team.store.po.AddressInfo;
import com.team.store.po.AddressInfoExample;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Service;

import com.team.store.service.AddressService;
@Service("addressService")
public class AddressServiceImpl implements AddressService {
	@Autowired
	@Qualifier("addressInfoMapper")
	private AddressInfoMapper addressInfoMapper;
	@Override
	public int add(AddressInfo addr) {
		return addressInfoMapper.insert(addr);
	}
	@Override
	public int delete(int addrId) {
		return addressInfoMapper.deleteByPrimaryKey(addrId);
	}
	@Override
	public AddressInfo getAddressById(int addrId) {
		return addressInfoMapper.selectByPrimaryKey(addrId);
	}
	@Override
	public int update(AddressInfo addr) {
		return addressInfoMapper.updateByPrimaryKey(addr);
	}
	
	@Override
	public List<AddressInfo> getAddrByUserId(int userId) {
		//创建查询地址 的条件
		AddressInfoExample ex = new AddressInfoExample();
		com.team.store.po.AddressInfoExample.Criteria crt = ex.createCriteria();
		//用户Id
		crt.andUserIdEqualTo(userId);
		List<AddressInfo> list = addressInfoMapper.selectByExample(ex);
		return list;
	}

}
