package com.team.store.service.person;

import java.util.List;

import com.team.store.mapper.AddressInfoMapper;
import com.team.store.mapper.QuestionInfoMapper;
import com.team.store.mapper.SecurityQuestionMapper;
import com.team.store.mapper.UserInfoMapper;
import com.team.store.po.AddressInfo;
import com.team.store.po.QuestionInfo;
import com.team.store.po.SecurityQuestion;
import com.team.store.po.UserInfo;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.team.store.po.SendsmsInfo;

@Service("personalDataService")
public class PersonalDataServiceImpl implements PersonalDataService {

	@Autowired
	private UserInfoMapper userMapper;
	
	@Autowired
	private QuestionInfoMapper questionMapper;

	@Autowired
	private AddressInfoMapper addressInfoMapper;

	@Autowired
	private SecurityQuestionMapper securityQuestionMapper;
	
	/*根据ID获取用户对象*/
	@Override
	public UserInfo selectByPrimaryKey(int userId) {
		return userMapper.selectByPrimaryKey(userId);
	}

	/*更新用户信息*/
	@Override
	public int updateByPrimaryKey(UserInfo record) {
		return userMapper.updateByPrimaryKey(record);
	}

	/*获取trueOrFalse对象*/
	@Override
	public SendsmsInfo getSendsms(boolean trueOrFalse) {
		SendsmsInfo sendsms = new SendsmsInfo();
		sendsms.setTrueOrFalse(trueOrFalse);
		return sendsms;
	}

	/*添加安全问题*/
	@Override
	public int insert(QuestionInfo record) {
		return questionMapper.insert(record);
	}

	/*更新安全问题*/
	@Override
	public int updateByPrimaryKey(QuestionInfo record) {
		return questionMapper.updateByPrimaryKey(record);
	}

	/*查询安全问题id*/
	@Override
	public QuestionInfo selectQuestionByContext(String quesContextone) {
		return questionMapper.selectQuestionByContext(quesContextone);
	}

	/*根据userId查询收货地址*/
	@Override
	public List<AddressInfo> selectAddressByUserKey(int userId) {
		return addressInfoMapper.selectAddressByUserKey(userId);
	}
	
	/*根据addrId查询收货地址*/
	@Override
	public AddressInfo selectAddressByPrimaryKey(int addrId) {
		return addressInfoMapper.selectAddressByPrimaryKey(addrId);
	}

	/*添加收货地址*/
	@Override
	public int insert(AddressInfo addr) {
		return addressInfoMapper.insert(addr);
	}

	/*修改收货地址*/
	@Override
	public int updateByPrimaryKeySelective(AddressInfo record) {
		return addressInfoMapper.updateByPrimaryKeySelective(record);
	}

	/*删除收货地址*/
	@Override
	public int deleteByPrimaryKey(int addrId) {
		return addressInfoMapper.deleteByPrimaryKey(addrId);
	}

	/*添加安全答案*/
	@Override
	public int insertSelective(SecurityQuestion record) {
		return securityQuestionMapper.insert(record);
	}
    /*更新安全答案*/
	@Override
	public int updateByPrimaryKey(SecurityQuestion record) {
		return securityQuestionMapper.updateByPrimaryKey(record);
	}
    /*根据用户ID查询安全答案*/
	@Override
	public List<SecurityQuestion> selectByUserId(Integer userId) {
		return securityQuestionMapper.selectByUserId(userId);
	}

	/*根据问题ID查询问题*/
	@Override
	public QuestionInfo selectByQuesId(int quesId) {
		return questionMapper.selectByQuesId(quesId);
	}
	
	
}
