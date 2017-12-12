package com.team.store.service.register;

import com.team.store.po.UserInfo;
import com.team.store.po.UserInfoExample;

import java.util.List;

public interface RegisterService {
    
    int getSendsms(String value);
    int insert(UserInfo record);
    
    UserInfo selectByPrimaryKey(int userId);
   
	List<UserInfo> selectByAccount(String userAccount);
	
	 List<UserInfo> selectByExample(UserInfoExample example);
}
