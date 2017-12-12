package com.team.store.service.person;

import com.github.pagehelper.PageHelper;
import com.github.pagehelper.PageInfo;
import com.team.store.consts.AccountMoneyEnumeration;
import com.team.store.consts.TimeEnumeration;
import com.team.store.mapper.MoneyInfoMapper;
import com.team.store.mapper.MoneyOpInfoMapper;
import com.team.store.po.*;
import com.team.store.utils.CollectionUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.Date;
import java.util.List;

@Service("moneyService")
public class MoneyServiceImpl implements MoneyService {
	// 账户金额
	@Autowired
	private MoneyInfoMapper moneyMapper;
	// 操作账户金额
	@Autowired
	private MoneyOpInfoMapper moneyOperator;

	@Override
	// 获取用户余额
	public MoneyInfo getAccountMoney(UserInfo user) {
		MoneyInfoExample example = new MoneyInfoExample();
		MoneyInfoExample.Criteria criteria = example.createCriteria();
		criteria.andUserIdEqualTo(user.getUserId());
		List<MoneyInfo> moneys = moneyMapper.selectByExample(example);
		return CollectionUtils.isNotEmpty(moneys) ? moneys.get(0) : null;
	}

	/**
	 * 支付
	 * 
	 * @param user
	 * @param money
	 * @return
	 */
	@Override
	public boolean payMoney(UserInfo user, double money) {
		MoneyInfo account = getAccountMoney(user);
		if (account == null) {
			return false;
		}
		double remain = account.getMonMoney() - money;
		if (remain < 0) {
			return false;
		}
		// 更新账户余额
		account.setMonMoney(remain);
		moneyMapper.updateByPrimaryKey(account);
		// 记录当前操作
		MoneyOpInfo moneyOpInfo = new MoneyOpInfo();
		moneyOpInfo.setMoneyopMoney(money);
		moneyOpInfo.setMoneyopTime(new Date());
		moneyOpInfo.setMoneyopType(AccountMoneyEnumeration.COST.getType());
		moneyOperator.insert(moneyOpInfo);
		return true;
	}

	/**
	 * 发红包
	 * 
	 * @param user
	 * @param money
	 * @return
	 */
	@Override
	public Packet createPacket(UserInfo user, double money) {
		MoneyInfo account = getAccountMoney(user);
		if (account == null) {
			return null;
		}
		double remain = account.getMonMoney() - money;
		if (remain < 0) {
			return null;
		}
		// 更新账户余额
		account.setMonMoney(remain);
		moneyMapper.updateByPrimaryKey(account);
		// 记录当前操作
		MoneyOpInfo moneyOpInfo = new MoneyOpInfo();
		moneyOpInfo.setMoneyopMoney(money);
		moneyOpInfo.setMoneyopTime(new Date());
		moneyOpInfo.setRemainMoney(remain);
		moneyOpInfo.setMoneyopType(AccountMoneyEnumeration.SEND_PACKET.getType());
		moneyOperator.insert(moneyOpInfo);
		Packet packet = new Packet();
		packet.setPacketTotalMoney(money);
		packet.setPacketRemainMoney(money);
		packet.setPacketFrom(user.getUserId());
		return packet;
	}

	/**
	 * 账户充值
	 * 
	 * @param user
	 * @param money
	 * @param type
	 *            用户充值 或者 退款
	 * @return
	 */
	@Override
	public boolean addMoney(UserInfo user, double money, AccountMoneyEnumeration type) {
		MoneyInfo moneyInfo = getAccountMoney(user);
		double newMoney = moneyInfo.getMonMoney() + money;

		MoneyInfoExample moneyInfoExample = new MoneyInfoExample();
		MoneyInfoExample.Criteria criteria = moneyInfoExample.createCriteria();

		criteria.andUserIdEqualTo(moneyInfo.getUserId());
		criteria.andMonMoneyEqualTo(moneyInfo.getMonMoney());
		moneyInfo.setMonMoney(newMoney);
		moneyMapper.updateByExample(moneyInfo, moneyInfoExample);
		// 插入金额变化记录
		MoneyOpInfo moneyOpInfo = new MoneyOpInfo();
		moneyOpInfo.setMoneyopMoney(money);
		moneyOpInfo.setMoneyopType(type.getType());
		moneyOpInfo.setMoneyopTime(new Date());
		moneyOpInfo.setMoneyId(moneyInfo.getMonId());
		moneyOpInfo.setRemainMoney(moneyInfo.getMonMoney());
		moneyOperator.insert(moneyOpInfo);
		return false;
	}

	/**
	 * 根据时间段获取用户账户资金变化明细表，默认每页10条
	 *
	 * @param user
	 *            用户
	 * @param page
	 *            第几页
	 * @param condition
	 *            查询的时间段
	 * @return
	 */
	@Override
	public PageInfo getMoneyCostList(UserInfo user, int page, TimeEnumeration condition) {
		MoneyInfo accountMoney = getAccountMoney(user);
		if (accountMoney != null) {
			MoneyOpInfoExample moneyOpInfoExample = new MoneyOpInfoExample();
			Date end = new Date();
			Date begin = new Date();
			switch (condition) {
			case TODAY:
				begin.setHours(0);
				begin.setMinutes(0);
				begin.setSeconds(0);
				break;
			case ONE_MONTH:
				begin.setMonth(end.getMonth() - 1);
				break;
			case SEVEN_DAYS:
				begin.setDate(end.getDate() - 7);
				break;
			case THREE_MONTHS:
				begin.setMonth(end.getMonth() - 3);
				break;
			}
			moneyOpInfoExample.createCriteria().andMoneyIdEqualTo(accountMoney.getMonId()).andMoneyopTimeBetween(begin,
					end);
			moneyOpInfoExample.setOrderByClause("MONEYOP_TIME DESC");
			PageHelper.startPage(page, 10, true);
			List<MoneyOpInfo> moneyOpInfos = moneyOperator.selectByExample(moneyOpInfoExample);
			PageInfo info = new PageInfo<MoneyOpInfo>(moneyOpInfos);
			return info;
		}
		return null;
	}
}
