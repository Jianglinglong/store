package com.team.store.mapper;

import com.team.store.po.QuestionInfo;
import com.team.store.po.QuestionInfoExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface QuestionInfoMapper {

    int countByExample(QuestionInfoExample example);

    int deleteByExample(QuestionInfoExample example);

    int deleteByPrimaryKey(int quesId);

    int insert(QuestionInfo record);

    int insertSelective(QuestionInfo record);

    List<QuestionInfo> selectByExample(QuestionInfoExample example);

    QuestionInfo selectByQuesId(int quesId);

    QuestionInfo selectQuestionByContext(String quesContextone);

    int updateByExampleSelective(@Param("record") QuestionInfo record, @Param("example") QuestionInfoExample example);

    int updateByExample(@Param("record") QuestionInfo record, @Param("example") QuestionInfoExample example);

    int updateByPrimaryKeySelective(QuestionInfo record);

    int updateByPrimaryKey(QuestionInfo record);
}