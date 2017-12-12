package com.team.store.mapper;

import java.util.List;

import com.team.store.po.History;
import com.team.store.po.HistoryExample;
import com.team.store.vo.lsy.LsyListFootVO;

import org.apache.ibatis.annotations.Param;

public interface HistoryMapper {
    int countByExample(HistoryExample example);

    int deleteByExample(HistoryExample example);

    int deleteByPrimaryKey(Integer historyId);

    int insert(History record);

    int insertSelective(History record);

    List<History> selectByExample(HistoryExample example);

    History selectByPrimaryKey(Integer historyId);

    int updateByExampleSelective(@Param("record") History record, @Param("example") HistoryExample example);

    int updateByExample(@Param("record") History record, @Param("example") HistoryExample example);

    int updateByPrimaryKeySelective(History record);

    int updateByPrimaryKey(History record);
    
    List<LsyListFootVO> getFootByUserId(int userId);
}