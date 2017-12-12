package com.team.store.controller.rl;

import java.io.File;
import java.io.IOException;
import java.io.UnsupportedEncodingException;
import java.lang.ProcessBuilder.Redirect;
import java.net.URLDecoder;
import java.text.ParsePosition;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Calendar;
import java.util.Date;
import java.util.List;
import java.util.Random;
import java.util.Set;

import javax.annotation.Resource;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.SessionAttribute;
import org.springframework.web.multipart.MultipartFile;
import org.springframework.web.servlet.ModelAndView;

import com.alibaba.fastjson.JSON;
import com.team.store.po.AppraiseInfo;
import com.team.store.po.OrderInfo;
import com.team.store.po.OrderProInfo;
import com.team.store.po.ProductInfo;
import com.team.store.po.UserInfo;
import com.team.store.pojo.ProImgBean;
import com.team.store.service.search.SearchProductService;
import com.team.store.service.rl.OrderService;
import com.team.store.vo.rl.AppraiseAndProduct;
import com.team.store.vo.rl.OrderAndProduct;

import net.sf.jsqlparser.statement.alter.Alter;


@Controller(value="a")
@RequestMapping("/orderInfo")
public class OrderController {
	@Resource(name="orderService1")
	private OrderService orderSercive; 
	
	@Autowired
	private SearchProductService searchProductSercice;

	private HttpSession session;



//	查询交易成功的订单；
//	订单状态码：未交易0；代发货1；待收货2；待评价3；
//	商品状态码：未评价1；已评价2；已退款3；未退款4；
	@RequestMapping("/listSucceed")
	public ModelAndView listOrderSucceed(HttpSession session) {
		ModelAndView mv = new ModelAndView();
		mv.setViewName("/rl/order");
		if ((UserInfo) session.getAttribute("user")!=null) {
			UserInfo user = (UserInfo) session.getAttribute("user");
			Integer userId = user.getUserId();
			System.out.println(userId);
		
		
		
		
	List<OrderAndProduct> list5 = orderSercive.getOrderAndProductList(27);
	for(OrderAndProduct ord : list5) {
		String proImg = ord.getProImg();
		ProImgBean imgBean = JSON.parseArray(proImg, ProImgBean.class).get(0);
		ord.setProImg(imgBean.getS());
		
		
	}

//	查询订单信息；
	List<OrderInfo> list = orderSercive.getOrder(27);
	
	
	mv.addObject("order0", list5);
	mv.addObject("orders", list);
		}
	
	return mv;
		
	}
	
	
//	跳转到退款售后界面；
	@RequestMapping("/change")
	public ModelAndView ListToChange() {
		ModelAndView mv = new ModelAndView();
		mv.setViewName("/rl/change");
		List<OrderAndProduct> list5 = orderSercive.getOrderAndProductList(27);
		for(OrderAndProduct ord : list5) {
			String proImg = ord.getProImg();
			ProImgBean imgBean = JSON.parseArray(proImg, ProImgBean.class).get(0);
			ord.setProImg(imgBean.getS());
			
			
		}
		mv.addObject("orderInfo", list5);
		
		return mv;
	}
//	确认支付；
	@RequestMapping("/rightPye")
	public ModelAndView RightPye() {
		return listOrderSucceed(session);
		
	}

//	跳转到评价商品界面；
	@RequestMapping("/comment")
	public ModelAndView ListToComment(HttpSession session) {
		UserInfo user = (UserInfo) session.getAttribute("user");
		Integer userId = user.getUserId();
		ModelAndView mv = new ModelAndView();
		mv.setViewName("/rl/comment");
		Set<AppraiseAndProduct> list = orderSercive.getAppraise2(userId);
		for(AppraiseAndProduct obj:list) {
			String proImg =  obj.getProImg();
			ProImgBean imgBean = JSON.parseArray(proImg, ProImgBean.class).get(0);
			 obj.setProImg(imgBean.getS());
		}
		mv.addObject("appraise",list);
		return mv;
		
		
	}
	
//	删除订单；
	@RequestMapping("/deleteOrder")
	public ModelAndView DeleteOrder(Integer orderId ,HttpSession session) {
		orderSercive.deleteOrder(orderId);
		orderSercive.deleteOrderProduct(orderId);
		return listOrderSucceed(session);
	}
//	查看物流；
	@RequestMapping("/logistics")
	public ModelAndView ListTologistics(Integer orderId) {
		ModelAndView mv = new ModelAndView();
		mv.setViewName("/rl/logistics");
		List<OrderAndProduct> list = orderSercive.getOrderAndProductListById(orderId);
		mv.addObject("orderInfo", list);
		return mv;
		
		
		
	}
//	订单详情；
	@RequestMapping("/orderInfo")
	public ModelAndView ListToOrderInfo(Integer orderId) {
		ModelAndView mv = new ModelAndView();
		mv.setViewName("/rl/orderinfo");
//		查询对应的订单信息；
		List<OrderAndProduct> list = orderSercive.getOrderAndProductListById(orderId);
		for(OrderAndProduct ord:list) {
			String proImg = ord.getProImg();
			ProImgBean proImgBean = JSON.parseArray(proImg, ProImgBean.class).get(0);
			ord.setProImg(proImgBean.getS());
			
		}
			OrderAndProduct orderInfoList = orderSercive.getOrderAndProductListById(orderId).get(0);
		System.out.println(orderInfoList.getOrderAddr());
		System.out.println(orderInfoList);
		System.out.println(orderInfoList.getOrderId());
		mv.addObject("orderInfo", list);
		mv.addObject("order",orderInfoList);
		
		return mv;
		
		
		
	}
//	评价商品；
	@RequestMapping("/commentList")
	public ModelAndView ListToCommentList(Integer orderId) {
		ModelAndView mv = new ModelAndView();
		mv.setViewName("/rl/commentlist");
		List<OrderAndProduct> list = orderSercive.getOrderAndProductListById(orderId);
		for( OrderAndProduct op:list) {
			String proImg=op.getProImg();
			ProImgBean imgBean = JSON.parseArray(proImg, ProImgBean.class).get(0);
			op.setProImg(imgBean.getS());
			}
		
		mv.addObject("orderInfo", list);
		
		return mv;
		
		
	}
//	钱款去向；
	@RequestMapping("/record")
	public String ListToRecord() {
		return "rl/record";
		
	}
//	退款的方法；
	@RequestMapping("/payBack")
	public ModelAndView payBack(Integer proId,Integer orderId) {
		OrderProInfo allById = orderSercive.getAllById(proId, orderId);
		allById.setAppraisStatus("3");
		orderSercive.updateStatus(allById);
		return ListToChange();
		
	}
//	一键支付；
	@RequestMapping("/payOneKey")
	public String PayOneKey(Integer orderId) {
		return null;

		
	}
//	退款；
	@RequestMapping("/refund")
	public ModelAndView PayBack(Integer proId ,Integer orderId) {
		ModelAndView mv = new ModelAndView();
		mv.setViewName("rl/refund");
		ProductInfo productInfo = orderSercive.getProductInfoById(proId);
		String proImg = productInfo.getProImg();
		ProImgBean imgBean = JSON.parseArray(proImg, ProImgBean.class).get(0);
		productInfo.setProImg(imgBean.getS());
		mv.addObject("productRl",productInfo);
		OrderProInfo all = orderSercive.getAllById(proId, orderId);
		mv.addObject("allRl",all);
		OrderInfo orderInfoById = orderSercive.getOrderInfoById(orderId);
		mv.addObject("orderInfo", orderInfoById);
		
		return mv;
		
		
	}
//	确认收货；
	@RequestMapping("/receipt")
	public ModelAndView Receipt(Integer orderId,HttpSession session) {
		ModelAndView mv = new ModelAndView();
		mv.setViewName("rl/order");
//		點擊确认把订单状态改为3（待评价）；
		OrderInfo orderInfo = orderSercive.getOrderInfoById(orderId);
		orderInfo.setOrderState(3);
		orderSercive.updateOrderInfo(orderInfo);
		return listOrderSucceed(session);
		
	}

	/**
	 * @RequestParam: name: 表单文件域元素的名称的值 required： 默认为true, 可以设置也可以不设置
	 * 
	 * @return
	 * @throws UnsupportedEncodingException 
	 */
	@RequestMapping("/upload")
	public ModelAndView upload(@RequestParam(name = "uploadimg", required = false) MultipartFile uploadFile,
			HttpServletRequest request,AppraiseInfo app,HttpServletResponse response) throws UnsupportedEncodingException {
		
		int num = uploadFile.getOriginalFilename().lastIndexOf(".");
		String name = uploadFile.getOriginalFilename().substring(num);
		
		String realPath = request.getSession().getServletContext().getRealPath("/uploadimg");
		// 获取文件上传到服务器端的路径
		File savePath = new File(realPath);
		
		if (!savePath.exists()) {
			savePath.mkdirs();
		}
		 Calendar calendar = Calendar.getInstance();
         // 获取年
        int year = calendar.get(Calendar.YEAR);

         // 获取月，这里需要需要月份的范围为0~11，因此获取月份的时候需要+1才是当前月份值
        int month = calendar.get(Calendar.MONTH) + 1;

         // 获取日
        int day = calendar.get(Calendar.DAY_OF_MONTH);
 
         // 获取时
         int hour = calendar.get(Calendar.HOUR);
         // int hour = calendar.get(Calendar.HOUR_OF_DAY); // 24小时表示
 
         // 获取分
         int minute = calendar.get(Calendar.MINUTE);
 
         // 获取秒
         int second = calendar.get(Calendar.SECOND);
		// 创建目标文件
		String fileName = "store"+year+"store"+month+"shop"+day+"a"+hour+"b"+minute+"c"+second+"d"+second+"e"+new Random().nextInt(10000)+name;
		File targetFile = new File(savePath, fileName);
		
		// 把源文件的文件拷贝到目标文件
		try {
			uploadFile.transferTo(targetFile);
		} catch (Exception e) {
			throw new RuntimeException("文件上传失败");
		} 
		//app.setApprPicture("images/"+uploadFile.getOriginalFilename());
		
		try {
			response.getWriter().print(1);
		} catch (IOException e) {
			e.printStackTrace();
		}
		
		
//		数据类型转化；
		int orderId = Integer.parseInt(request.getParameter("orderId" ));
		int proId = Integer.parseInt(request.getParameter("proId" ));
		
		orderSercive.getOrderPro(orderId);
		String text = request.getParameter("text");
		 text = new String(text.getBytes("ISO-8859-1"),"UTF-8");
//		 判断好中差评；
		String html = request.getParameter("html");
		if (html.equals("op1 active")) {
			app.setApprType(1);
		}else if (html.equals("op2 active")) {
			app.setApprType(2);
		}else {
			app.setApprType(3);
		}
		
//		if (html.equalsIgnoreCase("")) {
//			
//		}
		
//		获取时间；
		Date time = new Date();
//		通过订单Id查询订单信息；(取出orderId);
		OrderInfo odf = orderSercive.getOrderInfoById(orderId);
		int userId = odf.getUserId();
		
		app.setApprContents(text);
		app.setApprPicture("uploadimg/"+fileName);
		app.setApprTime(time);
		app.setOrderId(orderId);
		app.setProId(proId);
		app.setUserId(userId);
		orderSercive.addAprraise(app);
//		修改对应商品的orderId，并且设置状态码为5（已评价）；
		
//	评价的商品把商品评价码改为1（评价完成）
		OrderProInfo orderProInfo = orderSercive.getAllById(proId, orderId);
		orderProInfo.setAppraisStatus("1");
		orderSercive.updateStatus(orderProInfo);
		
		return ListToCommentList(orderId);

	}
	
}
