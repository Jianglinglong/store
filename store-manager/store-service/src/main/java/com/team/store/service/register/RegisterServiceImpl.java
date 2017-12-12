package com.team.store.service.register;

import java.util.List;

import com.team.store.mapper.UserInfoMapper;
import com.team.store.po.UserInfo;
import com.team.store.po.UserInfoExample;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.team.store.service.register.util.Sendsms;

@Service("registerService")
@Transactional
public class RegisterServiceImpl implements RegisterService {
    
	
	@Autowired
	private UserInfoMapper mapper;


	@Override
	public int getSendsms(String value) {
		int row = new Sendsms().sendsms(value);
		System.out.println(row);
		return row;
	}

	@Override
	public int insert(UserInfo record) {
		
		return mapper.insert(record);
	}

	@Override
	public UserInfo selectByPrimaryKey(int userId) {
		return mapper.selectByPrimaryKey(userId);
	}

	@Override
	public List<UserInfo> selectByAccount(String userAccount){
		return mapper.selectByAccount(userAccount);
		
	}

	@Override
	public List<UserInfo> selectByExample(UserInfoExample example) {
		return mapper.selectByExample(example);
	}
	
	
	
	
	
	
   
}
