package com.team.store.controller.person;

import java.text.ParseException;
import java.util.Collection;
import java.util.Date;
import java.util.List;
import java.util.TreeMap;

import javax.annotation.Resource;
import javax.servlet.http.HttpSession;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.servlet.ModelAndView;

import com.alibaba.fastjson.JSON;
import com.team.store.po.History;
import com.team.store.po.ProductInfo;
import com.team.store.po.UserInfo;
import com.team.store.pojo.ProImgBean;
import com.team.store.service.foot.FootService;
import com.team.store.service.foot.FootServicewhl;
import com.team.store.service.product.ProductService;
import com.team.store.vo.lsy.LsyListFootVO;

@Controller
@RequestMapping("foot")
public class FootController {

	@Resource
	private ProductService proService;
	@Resource
	private FootService footService;

	@Resource(name = "footServicewhl")
	private FootServicewhl footServicewhl;

	@RequestMapping("show")
	public ModelAndView get(HttpSession session) {
		ModelAndView mv = new ModelAndView();
		TreeMap<Date, List<ProductInfo>> foot = null;
		UserInfo user = (UserInfo) session.getAttribute("user");
		if (user != null) {
			try {
				foot = footServicewhl.getFoot(user.getUserId());
				mv.addObject("foot", foot);
				mv.setViewName("person/foot");
			} catch (ParseException e) {
				e.printStackTrace();
			}
		} else {
			mv.setViewName("redirect:/login.jsp");
		}
		return mv;
	}
	@RequestMapping("whlDelete")
	@ResponseBody
	public void delete(int proId,String time,HttpSession session) {
		UserInfo user = (UserInfo) session.getAttribute("user");
		if(user!=null) {
		footServicewhl.deleteFoot(proId,time,user.getUserId());
		}
	}
	
	//***********************************过时
//	@RequestMapping("personalFoot")
//	public ModelAndView personFoot(History his, HttpSession session) {
//		ModelAndView mv = new ModelAndView();
//		UserInfo user = (UserInfo) session.getAttribute("user");
//		if (user != null) {
//			Date date = new Date();
//			int month = date.getMonth() + 1;
//			int day = date.getDate();
//
//			Collection<LsyListFootVO> foot = footService.getFoot(user.getUserId());
//			for (LsyListFootVO history : foot) {
//				String proImg = history.getProImg();
//				ProImgBean proImgBean = JSON.parseArray(proImg, ProImgBean.class).get(0);
//				history.setPromg(proImgBean.getM());
//			}
//
//			mv.addObject("foot", foot);
//			mv.addObject("month", month);
//			mv.addObject("day", day);
//			mv.setViewName("person/foot");
//		} else {
//			mv.setViewName("redirect:/login.jsp");
//		}
//		return mv;
//	}
//
//	@RequestMapping("delete")
//	@ResponseBody
//	public int delete(Integer historyId) {
//		return footService.deleteFoot(historyId);
//	}
}
