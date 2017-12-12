package com.team.store.service;

import com.team.store.po.AddressInfo;

import java.util.List;

public interface AddressService {
	//添加收货地址
	int add(AddressInfo addr);
	//删除收货地址
	int delete(int addrId);
	//初始化修改地址
	AddressInfo getAddressById(int addrId);
	//修改地址
	int update(AddressInfo addr);
	//初始化地址
	List<AddressInfo> getAddrByUserId(int userId);
}
