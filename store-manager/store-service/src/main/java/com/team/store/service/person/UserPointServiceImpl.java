package com.team.store.service.person;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.team.store.consts.PointNum;
import com.team.store.consts.PointTypeEnumeration;
import com.team.store.mapper.PointInfoMapper;
import com.team.store.mapper.PointOperatorMapper;
import com.team.store.po.PointInfo;
import com.team.store.po.PointInfoExample;
import com.team.store.po.PointOperator;
import com.team.store.po.PointOperatorExample;
import com.team.store.po.UserInfo;
import com.team.store.utils.CollectionUtils;

@Service("pointService")
public class UserPointServiceImpl implements UserPointService {

    @Autowired
    private PointInfoMapper pointMapper;
    @Autowired
    private PointOperatorMapper pointOperatorMapper;

    /**
     * 根据用户获取积分
     *
     * @param user
     * @return
     */
    @Override
    public PointInfo getPoint(UserInfo user) {
        if (user == null) {
            return null;
        }
        PointInfoExample example = new PointInfoExample();
        PointInfoExample.Criteria criteria = example.createCriteria();
        criteria.andUserIdEqualTo(user.getUserId());
        List<PointInfo> points = pointMapper.selectByExample(example);
        return CollectionUtils.isNotEmpty(points) ? points.get(0) : null;
    }

    /**
     * 签到
     *
     * @param user
     * @param signedTime
     * @return
     */
    @Override
    public int addPointBySigned(UserInfo user, Date signedTime) {
        PointInfo point = getPoint(user);
        if (point == null) {
            PointInfo pointInfo = new PointInfo();
            pointInfo.setPointNum(0);
            pointInfo.setUserId(user.getUserId());
            pointMapper.insert(pointInfo);
            point = getPoint(user);
        }

        PointOperatorExample example = new PointOperatorExample();
        PointOperatorExample.Criteria criteria = example.createCriteria();
        criteria.andPointIdEqualTo(point.getPointId());
        SimpleDateFormat simpleDateFormat = new SimpleDateFormat("yyyy-MM-dd");
        Date date = new Date(signedTime.getTime());
        String format = simpleDateFormat.format(date);
        try {
            date = simpleDateFormat.parse(format);
        } catch (ParseException e) {
            e.printStackTrace();
        }
        criteria.andPointopTimeGreaterThanOrEqualTo(date);
        criteria.andPointopTypeEqualTo(PointTypeEnumeration.SINGED.getType());
        List<PointOperator> pointOperators = pointOperatorMapper.selectByExample(example);
        if (!CollectionUtils.isNotEmpty(pointOperators)) {
            // 创建签到记录
            PointOperator pointOperator = new PointOperator();
            pointOperator.setPointId(point.getPointId());
            pointOperator.setPointNum(PointNum.SIGNED);
            pointOperator.setPointopTime(signedTime);
            pointOperator.setPointopType(PointTypeEnumeration.SINGED.getType());
            pointOperatorMapper.insert(pointOperator);
            // 更新用户积分
            point.setPointNum(point.getPointNum() + PointNum.SIGNED);
            pointMapper.updateByPrimaryKeySelective(point);
            return pointOperator.getPointopId();
        }
        return 0;
    }

    /**
     * 评论订单
     *
     * @param user
     * @param orderId
     * @return
     */
    @Override
    public int addPointByCommentOrder(UserInfo user, int orderId) {
        PointInfo point = getPoint(user);
        PointOperator pointOperator = getPointOperator(point, PointTypeEnumeration.COMMENT.getType() + orderId);
        pointOperator.setPointNum(PointNum.COMMENT);
        pointOperatorMapper.insert(pointOperator);
        point.setPointNum(point.getPointNum() + PointNum.COMMENT);
        pointMapper.updateByPrimaryKey(point);
        return 0;
    }

    /**
     * 验证邮箱
     *
     * @param user
     * @return
     */
    @Override
    public int addPointByEmail(UserInfo user) {
        PointInfo point = getPoint(user);
        PointOperator pointOperator = getPointOperator(point, PointTypeEnumeration.EMAIL.getType());
        pointOperator.setPointNum(PointNum.EMAIL);
        pointOperatorMapper.insert(pointOperator);
        point.setPointNum(point.getPointNum() + PointNum.EMAIL);
        pointMapper.updateByPrimaryKey(point);
        return 0;
    }

    /**
     * 验证手机
     *
     * @param user
     * @return
     */
    @Override
    public int addPointByPhone(UserInfo user) {
        PointInfo point = getPoint(user);
        PointOperator pointOperator = getPointOperator(point, PointTypeEnumeration.PHONE.getType());
        pointOperator.setPointNum(PointNum.PHONE);
        pointOperatorMapper.insert(pointOperator);
        point.setPointNum(point.getPointNum() + PointNum.PHONE);
        pointMapper.updateByPrimaryKey(point);
        return 0;
    }

    /**
     * 兑换商品
     *
     * @param user
     * @param points
     * @return
     */
    public int reducePointByExchange(UserInfo user, int points) {
        PointInfo point = getPoint(user);
        if (point.getPointNum() < points) {
            return -1;
        }
        // 积分兑换记录
        PointOperator pointOperator = getPointOperator(point, PointTypeEnumeration.EXCHANGE.getType());
        pointOperator.setPointNum(points);
        pointOperatorMapper.insert(pointOperator);
        // 更新积分
        point.setPointNum(point.getPointNum() - points);
        pointMapper.updateByPrimaryKeySelective(point);

        return pointOperator.getPointopId();
    }

    @Override
    public List<PointOperator> getALlOperator(UserInfo user, int type) {
        PointInfo points = getPoint(user);
        List<PointOperator> pointOperators = new ArrayList<PointOperator>();
        if (points != null) {
            // 查询积分增加操作记录
            PointOperatorExample pointOperatorExample = new PointOperatorExample();
            PointOperatorExample.Criteria criteria = pointOperatorExample.createCriteria();
            criteria.andPointIdEqualTo(points.getPointId());
            switch (type) {
                case 1:
                    criteria.andPointNumGreaterThan(0);
                    break;
                case -1:
                    criteria.andPointNumLessThan(0);
                    break;
                default:
            }
            // 设置查询结果按照操作时间进行降序排列
            pointOperatorExample.setOrderByClause("POINTOP_TIME DESC");
            pointOperators = pointOperatorMapper.selectByExample(pointOperatorExample);
        }
        return pointOperators;
    }

    /**
     * 构建积分变化对象 需要设置变化的积分
     *
     * @param point
     * @param type
     * @return
     */
    private PointOperator getPointOperator(PointInfo point, String type) {
        PointOperator pointOperator = new PointOperator();
        pointOperator.setPointId(point.getPointId());
        pointOperator.setPointopType(type);
        pointOperator.setPointopTime(new Date());
        return pointOperator;
    }
}
