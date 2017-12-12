package com.team.store.mapper;

import com.team.store.po.SecurityQuestion;
import com.team.store.po.SecurityQuestionExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface SecurityQuestionMapper {
    int countByExample(SecurityQuestionExample example);

    int deleteByExample(SecurityQuestionExample example);

    int deleteByPrimaryKey(Integer securityId);

    int insert(SecurityQuestion record);

    int insertSelective(SecurityQuestion record);

    List<SecurityQuestion> selectByExample(SecurityQuestionExample example);

    SecurityQuestion selectByPrimaryKey(Integer securityId);
    
    /*根据用户ID查询答案对象*/
    List<SecurityQuestion> selectByUserId(Integer userId);

    int updateByExampleSelective(@Param("record") SecurityQuestion record, @Param("example") SecurityQuestionExample example);

    int updateByExample(@Param("record") SecurityQuestion record, @Param("example") SecurityQuestionExample example);

    int updateByPrimaryKeySelective(SecurityQuestion record);

    int updateByPrimaryKey(SecurityQuestion record);
}