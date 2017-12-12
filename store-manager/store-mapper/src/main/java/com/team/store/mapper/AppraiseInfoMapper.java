package com.team.store.mapper;

import com.team.store.po.AppraiseInfo;
import com.team.store.po.AppraiseInfoExample;
import com.team.store.vo.LsyListVOAppraise;
import com.team.store.vo.rl.AppraiseAndProduct;

import java.util.List;
import java.util.Set;

import org.apache.ibatis.annotations.Param;

public interface AppraiseInfoMapper {
    int countByExample(AppraiseInfoExample example);

    int deleteByExample(AppraiseInfoExample example);

    int deleteByPrimaryKey(int apprId);

    int insert(AppraiseInfo record);

    int insertSelective(AppraiseInfo record);

    List<AppraiseInfo> selectByExample(AppraiseInfoExample example);

    AppraiseInfo selectByPrimaryKey(int apprId);

    int updateByExampleSelective(@Param("record") AppraiseInfo record, @Param("example") AppraiseInfoExample example);

    int updateByExample(@Param("record") AppraiseInfo record, @Param("example") AppraiseInfoExample example);

    int updateByPrimaryKeySelective(AppraiseInfo record);

    int updateByPrimaryKey(AppraiseInfo record);

    List<LsyListVOAppraise> getAppraise(int proId);
    
    Set<AppraiseAndProduct> getAppraise2(int userId);
}