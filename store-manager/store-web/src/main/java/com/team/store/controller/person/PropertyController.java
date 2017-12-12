package com.team.store.controller.person;

import com.github.pagehelper.PageInfo;
import com.team.store.consts.TimeEnumeration;
import com.team.store.po.*;
import com.team.store.service.person.CouponService;
import com.team.store.service.person.MoneyService;
import com.team.store.service.person.UserPacketService;
import com.team.store.service.person.UserPointService;
import com.team.store.service.rl.OrderService;
import com.team.store.vo.rl.OrderAndProduct;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.ModelAndView;

import javax.annotation.Resource;
import javax.servlet.http.HttpSession;
import java.util.Date;
import java.util.List;

@Controller
@RequestMapping("property")
public class PropertyController {
    /**
     * 积分
     */
    @Resource(name = "pointService")
    private UserPointService pointService;
    /**
     * 账户资金
     */
    @Resource(name = "moneyService")
    private MoneyService moneyService;
    /**
     * 优惠券
     */
    @Resource(name = "couponService")
    private CouponService couponService;

    /**
     * 红包
     */
    @Resource(name="packetService")
    private UserPacketService packetService;

    /**
     * 已完成订单
     */
    @Resource(name = "orderService1")
    private OrderService orderService;
    /**********************************************初始化个人中心，我的资产*****************************************/
    @RequestMapping("init")
    public ModelAndView inti() {
        ModelAndView view = new ModelAndView();
        view.setViewName("person/personal");
        return view;
    }
    /**********************************************积分*****************************************/
    @RequestMapping("points")
    public ModelAndView showPoint(HttpSession session) {
        ModelAndView view = new ModelAndView();
        UserInfo user = (UserInfo) session.getAttribute("user");
        PointInfo points = pointService.getPoint(user);
        if(points == null) {
        	points = new PointInfo();
        }
        List<PointOperator> pointOperatorList = pointService.getALlOperator(user, 0);
        view.setViewName("person/context/point");
        view.addObject("points", points.getPointNum());
        view.addObject("records", pointOperatorList);
        return view;
    }
    //签到
    @RequestMapping("sign")
    public ModelAndView singed(Date now, HttpSession session) {
        PointInfo pointInfo = new PointInfo();
        UserInfo user = (UserInfo) session.getAttribute("user");
        Date date = new Date();
        if (date.getDate() == now.getDate()) {
            pointService.addPointBySigned(user, now);
        }
        return showPoint(session);
    }

    /**********************************************优惠券*****************************************/
    //获取优惠券
    @RequestMapping("coupon")
    public ModelAndView showCoupon(HttpSession session) {
        ModelAndView view = new ModelAndView();
        UserInfo user = (UserInfo) session.getAttribute("user");
        List<CouponInfo> couponList = couponService.getCoupon(user);
        view.setViewName("person/context/coupon");
        view.addObject("couponList",couponList);
        view.addObject("now",new Date().getTime());
        return view;
    }
    //删除优惠券
    @RequestMapping("deleteCoupon")
    public ModelAndView deleteCouponById( HttpSession session,Integer id){
        ModelAndView view = new ModelAndView();
        UserInfo user = (UserInfo) session.getAttribute("user");
        couponService.deleteCoupon(user,id);
       return showCoupon(session);
    }
    public ModelAndView getCouponById(HttpSession session ,Integer id){
        UserInfo user = (UserInfo) session.getAttribute("user");
       // couponService.addCoupon(user,id);
        return showCoupon(session);
    }

    /**********************************************账户余额*****************************************/
    @RequestMapping("walletlist")
    public ModelAndView showWalletList(HttpSession session, Integer page, Integer time) {
        ModelAndView view = new ModelAndView();
        UserInfo user = (UserInfo) session.getAttribute("user");
        MoneyInfo accountMoney = moneyService.getAccountMoney(user);
        TimeEnumeration condition;
        if (time == null) {
            condition = TimeEnumeration.SEVEN_DAYS;
        } else if (time == 1) {
            condition = TimeEnumeration.TODAY;
        } else if (time == 2) {
            condition = TimeEnumeration.ONE_MONTH;
        } else if (time == 3) {
            condition = TimeEnumeration.THREE_MONTHS;
        } else {
            condition = TimeEnumeration.SEVEN_DAYS;
        }
        PageInfo<?> pageInfo = moneyService.getMoneyCostList(user, page == null ? 1 : page, condition);
        view.setViewName("person/context/walletlist");
        view.addObject("money", accountMoney);
        view.addObject("costList", pageInfo);
        view.addObject("select", time == null ? 4 : time);
        return view;
    }


    /**********************************************红包*****************************************/
    @RequestMapping("bonus")
    public ModelAndView showBonus(HttpSession session) {
        ModelAndView view = new ModelAndView();
        UserInfo user = (UserInfo) session.getAttribute("user");
        List<Packet> packets = packetService.getPackets(user);
        view.addObject("packets",packets);
        view.setViewName("person/context/bonus");
        return view;
    }
    /**********************************************账单明细*****************************************/
    @RequestMapping("bill")
    //账单
    public ModelAndView showBill(HttpSession session) {
        ModelAndView view = new ModelAndView();
        UserInfo user = (UserInfo) session.getAttribute("user");
        List<OrderAndProduct> orderAndProducts = orderService.getOrderAndProductList(user.getUserId());
        view.addObject("cost",orderAndProducts);
        view.setViewName("person/context/bill");
        return view;
    }
    @RequestMapping("billList")
    //账单明细
    public ModelAndView showBillList(@RequestParam(name = "condition", required = false) String condition) {
        ModelAndView view = new ModelAndView();
        view.setViewName("person/context/billList");
        return view;
    }
}
