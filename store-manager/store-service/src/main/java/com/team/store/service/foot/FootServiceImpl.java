package com.team.store.service.foot;

import java.util.Collection;
import java.util.List;
import java.util.Set;

import javax.annotation.Resource;

import org.springframework.stereotype.Service;

import com.alibaba.fastjson.JSON;
import com.team.store.mapper.HistoryMapper;
import com.team.store.po.History;
import com.team.store.po.HistoryExample;
import com.team.store.po.HistoryExample.Criteria;
import com.team.store.utils.CollectionUtils;
import com.team.store.vo.lsy.LsyListFootVO;

import redis.clients.jedis.Jedis;

@Service("footService")
public class FootServiceImpl implements FootService {

	@Resource
	private HistoryMapper footMapper;
	
	@Override
	public List<LsyListFootVO> getFoot(int userId) {
		return footMapper.getFootByUserId(userId);
	}

	@Override
	public int addFoot(History his) {
		int result= 0; 
		HistoryExample example = new HistoryExample();
		Criteria crt = example.createCriteria();
		crt.andProIdEqualTo(his.getProId()).andUserIdEqualTo(his.getUserId());
		List<History> list = footMapper.selectByExample(example);
		if(CollectionUtils.isNotEmpty(list)) {
			History history = list.get(0);
			history.setHistoryTime(his.getHistoryTime());
			result = footMapper.updateByPrimaryKey(history);
		}else {
			List<LsyListFootVO> foot = getFoot(his.getUserId());
			int size = foot.size();
			if(size>=10) {
				footMapper.deleteByPrimaryKey(foot.get(size-1).getHistoryId());
			}
			result = footMapper.insert(his);
		}
		return result;
	}

	@Override
	public int deleteFoot(int historyId) {
		
		return footMapper.deleteByPrimaryKey(historyId);
	}

}
