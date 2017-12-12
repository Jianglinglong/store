package com.team.store.controller;

import java.util.List;

import javax.annotation.Resource;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpSession;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

import com.team.store.po.AddressInfo;
import com.team.store.po.CouponInfo;
import com.team.store.po.Packet;
import com.team.store.po.ProductInfo;
import com.team.store.po.ShopCart;
import com.team.store.po.UserInfo;
import com.team.store.service.AddressService;
import com.team.store.service.OrderService;
import com.team.store.service.ShopCartService;
import com.team.store.service.UserService;
import com.team.store.service.person.CouponService;
import com.team.store.service.person.UserPacketService;
import com.team.store.service.search.SearchProductService;

@Controller
@RequestMapping("user")
public class UserController {
	@Autowired
	@Qualifier("userService")
	private UserService userService;
	@Autowired
	@Qualifier("orderService")
	private OrderService orderService;
	@Autowired
	private AddressService addressService;
	@Autowired
	@Qualifier("shopCartService")
	private ShopCartService shopCartService;
	@Autowired
	private SearchProductService searchService;
	//优惠卷
	@Resource(name="couponService")
	private CouponService couponService;
	//红包
	@Resource(name="packetService")
	private UserPacketService userPacketService;
	@RequestMapping("login")
	public ModelAndView login(String account,HttpSession session,HttpServletRequest request) {
		ModelAndView mv = new ModelAndView();
		UserInfo user=new UserInfo();
		//String userAccount = request.getParameter("userAccount");
		String userPassword = request.getParameter("password");
		user.setUserAccount(account);
		user.setUserPassword(userPassword);
		UserInfo userInfo=userService.login(user);
		if(userInfo==null) {
			mv.addObject("message","账号或密码有误");
			mv.setViewName("forward:/login.jsp");
			
		}else {
			mv.setViewName("redirect:/home/list.do");
			session.setAttribute("user", userInfo);
			mv.addObject("userInfo",userInfo);
		}
		return mv;
	}
	
	@RequestMapping("pay")
	public ModelAndView pay(HttpSession session,HttpServletRequest request,int proId,String type1,String type2,String img) throws Exception {
		
		ModelAndView mv = new ModelAndView();
		//得到用户ID
		UserInfo user = (UserInfo) session.getAttribute("user");
		if(user!=null) {
			//优惠卷
			List<CouponInfo> coupon = couponService.getAvailableCoupon(user.getUserId());
			//红包
			List<Packet> packets = userPacketService.getPackets(user);
			//添加物流信息
			List<AddressInfo> addrList = addressService.getAddrByUserId(user.getUserId());
			//把地址栏上的值存储到session
			String dz = "proId="+proId+"&type1="+type1+"&type2="+type2+"&img="+img;
			session.setAttribute("dz", dz);
			String probz = request.getParameter("probz");
			String prokw = request.getParameter("prokw");
			String proNumber = request.getParameter("proNumber");
			String proPrice = request.getParameter("proPrice");
			//得到商品信息 放进mv里 让页面得到
			ProductInfo pro = searchService.searchProduct(proId);
			type1 = new String(type1.getBytes("ISO8859-1"),"UTF-8");
			type2 = new String(type2.getBytes("ISO8859-1"),"UTF-8");
			//得到购物车的记录数
			List<ShopCart> shopCart = shopCartService.listShopCart(user.getUserId());
			//设置购物车记录数
			mv.addObject("shopCartSize",shopCart.size());
			mv.addObject("proId",proId);
			mv.addObject("type1",type1);
			mv.addObject("type2",type2);
			mv.addObject("img",img);
			mv.addObject("pro",pro);
			mv.addObject("addr",addrList);
			mv.addObject("probz",probz);
			mv.addObject("prokw",prokw);
			mv.addObject("proNumber",proNumber);
			mv.addObject("proPrice",proPrice);
			mv.addObject("coupon", coupon);
			mv.addObject("packets", packets);
			mv.setViewName("xufan/pay");
		}else{
			mv.setViewName("redirect:/login.jsp");
		}
		
		return mv;
	}
}
