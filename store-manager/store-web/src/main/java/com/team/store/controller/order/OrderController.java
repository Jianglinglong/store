
package com.team.store.controller.order;


import java.io.IOException;
import java.io.UnsupportedEncodingException;
import java.util.Date;
import java.util.List;

import javax.annotation.Resource;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import com.team.store.po.CouponInfo;
import com.team.store.po.OrderInfo;
import com.team.store.po.UserInfo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

import com.team.store.po.OrderProInfo;
import com.team.store.po.Packet;
import com.team.store.service.AddressService;
import com.team.store.service.OrderService;
import com.team.store.service.person.CouponService;
import com.team.store.service.person.UserPacketService;
import com.team.store.service.product.ProductService;


@Controller
@RequestMapping("/order")
public class OrderController {
    @Autowired
    private OrderService orderSercive;
    @Autowired
    private AddressService addressService;
    //优惠卷
    @Resource(name = "couponService")
    private CouponService couponService;
    //红包
    @Resource(name = "packetService")
    private UserPacketService userPacketService;
    //
    @Resource
    private ProductService productService;

    //立即支付时的添加订单 添加订单商品关系表
    @RequestMapping("/addOrder")
    public void addOrder(HttpSession session, HttpServletRequest request, HttpServletResponse response) {
        //得到用户
        UserInfo user = (UserInfo) session.getAttribute("user");
        //创建订单对象
        OrderInfo order = new OrderInfo();

        order.setUserId(user.getUserId());
        order.setOrderTime(new Date());

        String addrPeople = request.getParameter("addrPeople");
        String addrPhone = request.getParameter("addrPhone");
        String addrDetail = request.getParameter("addrDetail");
        String addrStats = request.getParameter("addrStats");
        String address = "收货人： " + addrPeople + " 联系电话：" + addrPhone + " 收货地址:" + addrDetail;
        String price = request.getParameter("price");

        order.setOrderPrice(Double.parseDouble(price));
        order.setOrderState(Integer.parseInt(addrStats));
        order.setOrderAddr(address);
        //物流
        String wl = request.getParameter("wl");
        //物流码
        String wlm = null;
        long currentTimeMillis = System.currentTimeMillis();
        String ss = currentTimeMillis + "";
        int orderLogisics = 0;
        if ("圆通".equals(wl)) {
            wlm = "1" + ss.substring(ss.length() - 8);
        } else if ("申通".equals(wl)) {
            wlm = "2" + ss.substring(ss.length() - 8);
        } else if ("韵达".equals(wl)) {
            wlm = "3" + ss.substring(ss.length() - 8);
        } else if ("中通".equals(wl)) {
            wlm = "4" + ss.substring(ss.length() - 8);
        } else if ("顺丰".equals(wl)) {
            wlm = "5" + ss.substring(ss.length() - 8);
        } else {
            //未选中物流  随机发货
            wlm = "0";
        }
        orderLogisics = Integer.parseInt(wlm);
        order.setOrderLogistics(orderLogisics);
        orderSercive.addOrder(order);

        OrderProInfo orp = new OrderProInfo();
        String level1 = request.getParameter("level1");
        String level2 = request.getParameter("level2");
        orp.setOrderLevle1(level1);
        orp.setOrderLevle2(level2);
        orp.setUserId(user.getUserId());
        String proId = request.getParameter("proId");
        //数量
        String number = request.getParameter("number");
        //减少库存
        //添加商品销量
        productService.updateSaleNum(Integer.parseInt(proId), Integer.parseInt(number));
        orp.setProId(Integer.parseInt(proId));
        orp.setProPrice(Double.parseDouble(price));
        //查询订单id
        List<OrderInfo> list = orderSercive.getOrder(user.getUserId());
        for (OrderInfo or : list) {
            if (or.getOrderState() == 1) {
                orp.setOrderId(or.getOrderId());
            }
        }
        orp.setProNum(Integer.parseInt(number));
        int row = orderSercive.addOrderPro(orp);
        if (row > 0) {
            try {
                response.getWriter().print(row > 0 ? "OK" : "NO");
            } catch (IOException e) {
                e.printStackTrace();
            }
        } else {
            System.out.println("修改失败");
        }

    }

    @RequestMapping("/shopcartaddOrder")
    public void shopcartaddOrder(HttpSession session, HttpServletRequest request, HttpServletResponse response) {
        //得到用户
        UserInfo user = (UserInfo) session.getAttribute("user");
        //创建订单对象
        OrderInfo order = new OrderInfo();

        order.setUserId(user.getUserId());
        order.setOrderTime(new Date());
        String addrPeople = request.getParameter("addrPeople");
        String addrPhone = request.getParameter("addrPhone");
        String addrDetail = request.getParameter("addrDetail");
        String addrStats = request.getParameter("addrStats");
        String address = "收货人： " + addrPeople + " 联系电话：" + addrPhone + " 收货地址:" + addrDetail;
        String totalprice = request.getParameter("totalprice");
        order.setOrderPrice(Double.parseDouble(totalprice));

        order.setOrderState(Integer.parseInt(addrStats));
        order.setOrderAddr(address);
        //物流
        String wl = request.getParameter("wl");
        //物流码
        String wlm = null;
        long currentTimeMillis = System.currentTimeMillis();
        String ss = currentTimeMillis + "";
        int orderLogisics = 0;
        if ("圆通".equals(wl)) {
            wlm = "1" + ss.substring(ss.length() - 8);
        } else if ("申通".equals(wl)) {
            wlm = "2" + ss.substring(ss.length() - 8);
        } else if ("韵达".equals(wl)) {
            wlm = "3" + ss.substring(ss.length() - 8);
        } else if ("中通".equals(wl)) {
            wlm = "4" + ss.substring(ss.length() - 8);
        } else if ("顺丰".equals(wl)) {
            wlm = "5" + ss.substring(ss.length() - 8);
        } else {
            //未选中物流  随机发货
            wlm = "0";
        }
        orderLogisics = Integer.parseInt(wlm);
        order.setOrderLogistics(orderLogisics);

        //可查询订单id order.getOrderId()
        orderSercive.addOrder(order);
        //定义订单商品关系表
        OrderProInfo orp = new OrderProInfo();


        String adlevel1 = request.getParameter("level1");
        String adlevel2 = request.getParameter("level2");
        String adproId = request.getParameter("proId");
        //数量
        String adnumber = request.getParameter("number");
        String adprice = request.getParameter("price");
        String[] level1 = adlevel1.split(",");
        String[] level2 = adlevel2.split(",");
        String[] proId = adproId.split(",");
        String[] number = adnumber.split(",");
        String[] price = adprice.split(",");

        for (int i = 0; i < number.length; i++) {

            orp.setOrderLevle1(level1[i]);
            orp.setOrderLevle2(level2[i]);
            orp.setProId(Integer.parseInt(proId[i]));
            orp.setProPrice(Double.parseDouble(price[i]));
            orp.setProNum(Integer.parseInt(number[i]));
            //减少库存
            //添加商品销量
            productService.updateSaleNum(Integer.parseInt(proId[i]), Integer.parseInt(number[i]));
            orp.setUserId(user.getUserId());
            orp.setOrderId(order.getOrderId());
            orderSercive.addOrderPro(orp);
        }
    }

    @RequestMapping("success")
    public ModelAndView success(HttpServletRequest request) throws UnsupportedEncodingException {
        ModelAndView mv = new ModelAndView();
        mv.setViewName("xufan/success");
        String addrPeople = request.getParameter("addrPeople");
        addrPeople = new String(addrPeople.getBytes("ISO8859-1"), "UTF-8");
        String addrPhone = request.getParameter("addrPhone");
        String price = request.getParameter("price");
        String addrDetail = request.getParameter("addrDetail");
        addrDetail = new String(addrDetail.getBytes("ISO8859-1"), "UTF-8");
        mv.addObject("addrPeople", addrPeople);
        mv.addObject("addrPhone", addrPhone);
        mv.addObject("price", price);
        mv.addObject("addrDetail", addrDetail);
        return mv;
    }
}
