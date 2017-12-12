package com.team.store.service.impl;

import java.util.List;

import com.team.store.mapper.AddressInfoMapper;
import com.team.store.mapper.UserInfoMapper;
import com.team.store.po.UserInfo;
import com.team.store.po.UserInfoExample;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Service;

import com.team.store.po.UserInfoExample.Criteria;
import com.team.store.service.UserService;
@Service("userService")
public class UserServiceImpl implements UserService {
	@Autowired
	@Qualifier("userInfoMapper")
	private UserInfoMapper userInfoMapper;
	@Autowired
	@Qualifier("addressInfoMapper")
	private AddressInfoMapper addressInfoMapper;
	
	@Override
	public UserInfo login(UserInfo user) {
		//创建用户查询条件
		UserInfoExample ex = new UserInfoExample();
		Criteria crt = ex.createCriteria();
		//账号 密码
		crt.andUserAccountEqualTo(user.getUserAccount());
		crt.andUserPasswordEqualTo(user.getUserPassword());
		//条件查询 返回用户集合
		List<UserInfo> list = userInfoMapper.selectByExample(ex);
		//返回用户对象
		if(list.size()>0) {
			return list.get(0);
		}else {
			System.out.println("++++++++++++++");
			return null;
		}
	}
	
	
	
}
