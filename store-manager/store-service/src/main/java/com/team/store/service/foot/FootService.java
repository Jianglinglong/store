package com.team.store.service.foot;

import java.util.List;

import com.team.store.po.History;
import com.team.store.vo.lsy.LsyListFootVO;

public interface FootService {

	//根据userId查询足迹集合
	List<LsyListFootVO> getFoot(int userId);
	
	//插入足迹
	int addFoot(History his);
	
	//删除足迹
	int deleteFoot(int hisoryId);
}
