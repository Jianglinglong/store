package com.team.store.controller.shopcart;

import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

import javax.annotation.Resource;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import com.team.store.po.AddressInfo;
import com.team.store.po.CouponInfo;
import com.team.store.po.Packet;
import com.team.store.po.ProductInfo;
import com.team.store.po.UserInfo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

import com.alibaba.fastjson.JSON;
import com.team.store.po.ShopCart;
import com.team.store.pojo.ProImgBean;
import com.team.store.pojo.ProductLevelBean;
import com.team.store.service.AddressService;
import com.team.store.service.ShopCartService;
import com.team.store.service.person.CouponService;
import com.team.store.service.person.UserPacketService;
import com.team.store.service.search.SearchProductService;

@Controller
@RequestMapping("/shopCart")
public class ShopCartController {
	@Autowired
	private ShopCartService shopCartService;
	@Autowired
	@Qualifier("lsyProductService")
	private SearchProductService searchService;
	@Autowired
	private AddressService addressService;
	//优惠卷
	@Resource(name="couponService")
	private CouponService couponService;
	//红包
	@Resource(name="packetService")
	private UserPacketService userPacketService;
	@RequestMapping("/addShopCart")
	public void addShopCart(HttpSession session,HttpServletRequest request, HttpServletResponse response) throws IOException {
		//得到用户
		UserInfo user = (UserInfo) session.getAttribute("user");
		if(user!=null) {
			//创建订单对象
			ShopCart shopcart = new ShopCart();
			shopcart.setUserId(user.getUserId());
			//设置商品ID
			String proId = request.getParameter("proId");
			shopcart.setProId(Integer.parseInt(proId));
			//口味
			String type1 = request.getParameter("type1");
			//包装
			String type2 = request.getParameter("type2");
			//什么口味
			String level1 = request.getParameter("level1");
			//什么包装
			String level2 = request.getParameter("level2");
			shopcart.setProType1(type1);
			shopcart.setProType2(type2);
			shopcart.setProLevel1(level1);
			shopcart.setProLevel2(level2);
			//商品单价
			double price = Double.parseDouble(request.getParameter("proPrice"));
			shopcart.setProPrice(price);
			//数量
			int number = Integer.parseInt(request.getParameter("number"));
			shopcart.setProNum(number);
			//总价
			double money = number*price;
			shopcart.setProMoney(money);
			//数量  
			int row = shopCartService.addShopCart(shopcart);
			if(row>0){
				try {
					response.getWriter().print(row > 0 ? "OK" : "NO");
				} catch (IOException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}
			}else{
				System.out.println("修改失败");
			}
		}else{
			response.sendRedirect("/login.jsp");

		}
	}
	@RequestMapping("/listShopCart")
	public ModelAndView listShopCart(HttpSession session) {
		ModelAndView mv  = new ModelAndView();
		UserInfo user = (UserInfo) session.getAttribute("user");
		if(user!=null) {
			//得到所有的购物车信息
			List<ShopCart> shopCart = shopCartService.listShopCart(user.getUserId());
			//List<ShopCart> shopCart = shopCartService.listShopCart(1003);
			//定义一个商品集合
			List<ProductInfo> product = new ArrayList<ProductInfo>();
			//定义一个商品原价集合
			List<Double> proYJ = new ArrayList<Double>();
			double yj = 0;
			//定义一个中图集合
			List<String> proImgM = new ArrayList<String>();
			//定义一个商品详情集合
			/*List<String> proType1 = new ArrayList<String>();
			List<String> proType2 = new ArrayList<String>();*/
			List<Integer> number1 = new ArrayList<Integer>();
			List<Integer> number2 = new ArrayList<Integer>();
			List<List<ProductLevelBean>> kou = new ArrayList<>();
			List<List<ProductLevelBean>> bao = new ArrayList<>();
			//循环得到对应的商品的信息 加入集合 去页面获取商品信息
			for(ShopCart shop : shopCart) {
				ProductInfo pro = searchService.searchProduct(shop.getProId());
				String imgs = pro.getProImg();
				ProImgBean imgBean = JSON.parseArray(imgs, ProImgBean.class).get(0);
				pro.setProImg(imgBean.getS());
				//中图
				proImgM.add(imgBean.getM());
				product.add(pro);
				yj = shop.getProPrice()*1.4;
				yj = Double.parseDouble(String.format("%.2f", yj).toString());
				proYJ.add(yj);
				
				//拿到两个商品描述
				String proLevel = pro.getProLevel1();
				String proLeve2 = pro.getProLevel2();
				List<ProductLevelBean> Type1 = JSON.parseArray(proLevel, ProductLevelBean.class);
				kou.add(Type1);
				List<ProductLevelBean> Type2 = JSON.parseArray(proLeve2, ProductLevelBean.class);
				bao.add(Type2);
				//记录口味的数量
				number1.add(Type1.size());
				number2.add(Type2.size());
			}
			//设置原价
			mv.addObject("proYJ",proYJ);
			mv.addObject("shopCart",shopCart);
			mv.addObject("product",product);
			mv.addObject("proImgM",proImgM);
			mv.addObject("proType1",kou);
			mv.addObject("proType2",bao);
			mv.addObject("number1",number1);
			mv.addObject("number2",number2);
			mv.setViewName("xufan/shopcart");
		}else{
			mv.setViewName("redirect:/login.jsp");
		}
		
		return mv;
	}
	

	@RequestMapping("/deleteShopCart")
	public void deleteShopCart(HttpSession session,HttpServletRequest request, HttpServletResponse response) {
		//得到购物车ID
		String shopcartId = request.getParameter("shopcartId");
		//数量  
		int row = shopCartService.deleteShopCart(Integer.parseInt(shopcartId));
		if(row>0){
			try {
				response.getWriter().print(row > 0 ? "OK" : "NO");
			} catch (IOException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}else{
			System.out.println("删除失败");
		}
		
	}
	@RequestMapping("/updateShopCart")
	public void updateShopCart(HttpSession session,HttpServletRequest request, HttpServletResponse response) {
		//得到购物车ID
		String shopcartId = request.getParameter("shopcartId");
		//得到口味
		String kouwei = request.getParameter("kouwei");
		//得到包装
		String baozhuang = request.getParameter("baozhuang");
		//得到数量
		String number = request.getParameter("number");
		//得到价格
		String money = request.getParameter("money");
		ShopCart shopcart = new ShopCart();
		shopcart.setShopcartId(Integer.parseInt(shopcartId));
		shopcart.setProLevel1(kouwei);
		shopcart.setProLevel2(baozhuang);
		shopcart.setProNum(Integer.parseInt(number));
		shopcart.setProMoney(Double.parseDouble(money));
		//不会变的值  因为为int类型火double类型 会自动修改成0 所以要设置
		ShopCart sc = shopCartService.getShopCartById(Integer.parseInt(shopcartId));
		shopcart.setUserId(sc.getUserId());
		shopcart.setProId(sc.getProId());
		shopcart.setProPrice(sc.getProPrice());
		//数量  
		int row = shopCartService.updateShopCart(shopcart);
		if(row>0){
			try {
				response.getWriter().print(row > 0 ? "OK" : "NO");
			} catch (IOException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}else{
			System.out.println("删除失败");
		}
		
	}
	
	@RequestMapping("/shopCartpay")
	public ModelAndView shopCartpay(HttpSession session,HttpServletRequest request, HttpServletResponse response) {
		ModelAndView mv  = new ModelAndView();
		//得到传过来的购物车Id 数组（以字符串的形式）
		String scId= request.getParameter("sc");
		//得到传过来的购物车number 数组（以字符串的形式）
		String number= request.getParameter("number");
		//得到传过来的购物车money 数组（以字符串的形式）
		String money= request.getParameter("money");
		UserInfo user = (UserInfo)session.getAttribute("user");
		//通过，拆分成 id
		String[] split = scId.split(",");
		//通过，拆分成 number
		String[] n = number.split(",");
		//通过，拆分成 money
		String[] m = money.split(",");
		//创建购物车集合
		List<ShopCart> shopcart = new ArrayList<ShopCart>();
		ShopCart sc = new ShopCart();
		//定义商品集合
		List<ProductInfo> product = new ArrayList<ProductInfo>();
		ProductInfo pro= new ProductInfo();
		for(int i = 0 ; i < split.length ; i++) {
			sc = shopCartService.getShopCartById(Integer.parseInt(split[i]));
			sc.setProNum(Integer.parseInt(n[i]));
			sc.setProMoney(Double.parseDouble(m[i]));
			shopcart.add(sc);
			pro = searchService.searchProduct(sc.getProId());
			String imgs = pro.getProImg();
			ProImgBean imgBean = JSON.parseArray(imgs, ProImgBean.class).get(0);
			pro.setProImg(imgBean.getS());
			product.add(pro);
		}
		int userId = sc.getUserId();
		//优惠卷
		List<CouponInfo> coupon = couponService.getAvailableCoupon(userId);
		//红包
		List<Packet> packets = userPacketService.getPackets(user);
		mv.addObject("coupon", coupon);
		mv.addObject("packets", packets);
		//得到地址列表
		List<AddressInfo> addrList = addressService.getAddrByUserId(userId);
		mv.addObject("addr",addrList);
		mv.addObject("shopcart",shopcart);
		mv.addObject("product",product);
		mv.setViewName("xufan/shopCartPay");
		return mv;
	}
}
