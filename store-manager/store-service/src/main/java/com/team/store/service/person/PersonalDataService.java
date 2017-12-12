package com.team.store.service.person;

import java.util.List;

import com.team.store.po.AddressInfo;
import com.team.store.po.QuestionInfo;
import com.team.store.po.SecurityQuestion;
import com.team.store.po.SendsmsInfo;
import com.team.store.po.UserInfo;

public interface PersonalDataService {
    
	/*根据ID获取用户对象*/
	UserInfo selectByPrimaryKey(int userId);
	/*更新用户信息*/
	int updateByPrimaryKey(UserInfo record);
	
	/*获取trueOrFalse对象*/
	SendsmsInfo getSendsms(boolean trueOrFalse);
	
	/*添加安全问题*/
	int insert(QuestionInfo record);
	/*更新安全问题*/
	int updateByPrimaryKey(QuestionInfo record);
	/*根据问题名查询安全问题*/
	QuestionInfo selectQuestionByContext(String quesContextone);
	/*根据ID查询安全问题*/
	QuestionInfo selectByQuesId(int quesId);
	
	/*添加安全答案*/
	int insertSelective(SecurityQuestion record);
	/*更新安全答案*/
	int updateByPrimaryKey(SecurityQuestion record);
    /*根据用户ID查询答案对象*/
    List<SecurityQuestion> selectByUserId(Integer userId);
	
	/*根据userId查询收货地址*/
	List<AddressInfo> selectAddressByUserKey(int userId);
	/*根据addrId查询收货地址*/
	AddressInfo selectAddressByPrimaryKey(int addrId);
	
	/*添加收货地址*/
	int insert(AddressInfo addr);
	
	/*修改收货地址*/
	int updateByPrimaryKeySelective(AddressInfo record);
	
	/*删除收货地址*/
	int deleteByPrimaryKey(int addrId);
}
