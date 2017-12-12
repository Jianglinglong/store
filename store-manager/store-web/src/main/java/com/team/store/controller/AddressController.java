package com.team.store.controller;

import java.io.IOException;
import java.util.HashMap;
import java.util.Map;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import com.team.store.po.AddressInfo;
import com.team.store.po.UserInfo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.servlet.ModelAndView;

import com.alibaba.fastjson.JSON;
import com.team.store.service.AddressService;

@Controller
@RequestMapping("addr")
public class AddressController {
	@Autowired
	private AddressService addressService;
	@RequestMapping("add")
	public ModelAndView add(HttpSession session,HttpServletRequest request,HttpServletResponse response) {
		ModelAndView mv  = new ModelAndView();
		AddressInfo addr = new AddressInfo(); 
		String p=request.getParameter("p");
		String c=request.getParameter("c");
		String a=request.getParameter("a");
		String detial=request.getParameter("detial");
		String addrPeople=request.getParameter("addrPeople");
		String addrPhone=request.getParameter("addrPhone");
		String def="0";
		addr.setAddrPeople(addrPeople);
		addr.setAddrPhone(addrPhone);
		//把省  时  区  详细地址转化为一个json字符串
		Map<String, String> map = new HashMap<>();
		map.put("p", p);
		map.put("c", c);
		map.put("a", a);
		map.put("detial", detial);
		map.put("def", "0");
		addr.setAddrAddress(JSON.toJSONString(map));
		//获取地址栏的部分
		String dz = (String) session.getAttribute("dz");
		//获取用户
		UserInfo user = (UserInfo) session.getAttribute("user");
		addr.setUserId(user.getUserId());
		/*String productId = (String) session.getAttribute("productId");
		String type1= (String) session.getAttribute("type1");
		String type2 = (String) session.getAttribute("type2");*/
		if("".equals(addr.getAddrPeople())||"".equals(addr.getAddrPhone())||"".equals(addr.getAddrAddress())) {
			mv.setViewName("redirect:/user/pay.do?"+dz);
		}else {
			addressService.add(addr);
			mv.setViewName("redirect:/user/pay.do?"+dz);
		}
		
		return mv;
	}
	
	
	@RequestMapping("delete")
	public void delete(HttpSession session,HttpServletRequest request, HttpServletResponse response) {
		String addrId = request.getParameter("addrId");
		int row = addressService.delete(Integer.parseInt(addrId));
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
	@RequestMapping("initUpdate")
	public  @ResponseBody Map<String,Object> initUpdate(int addrId) {
		//ModelAndView mv = new ModelAndView();
		Map<String,Object> map = new HashMap<String,Object>();
		AddressInfo address = addressService.getAddressById(addrId);
		//把地址json变成字符串
		String jsonString = address.getAddrAddress().toString();
		//截取字符串 通过"截取
		String reg = "\"";
		String[] split = jsonString.split(reg);
		//创建存取省市区详细 是否默认5个属性的数组
		//以冒号后的为值
		//{"def":"撒旦法撒旦法手动","c":"0","a":"4","p":"4","detial":"4"}
		for(int i=1;i<split.length;i++) {
			map.put(split[i],split[i+2]);
			i+=3;
			
		}
		//添加到对应属性  到页面去取值
		map.put("addr",address);
		return map;
	}
	@RequestMapping("update")
	public void update(HttpSession session,HttpServletRequest request,HttpServletResponse response) {
		//ModelAndView mv  = new ModelAndView();
		AddressInfo addr = new AddressInfo(); 
		String p=request.getParameter("p");
		String c=request.getParameter("c");
		String a=request.getParameter("a");
		String addrId=request.getParameter("addrId");
		String detial=request.getParameter("detial");
		String addrPeople=request.getParameter("addrPeople");
		String addrPhone=request.getParameter("addrPhone");
		String def="0";
		addr.setAddrId(Integer.parseInt(addrId));
		addr.setAddrPeople(addrPeople);
		addr.setAddrPhone(addrPhone);
		//把省  时  区  详细地址转化为一个json字符串
		Map<String, String> map = new HashMap<>();
		map.put("p", p);
		map.put("c", c);
		map.put("a", a);
		map.put("detial", detial);
		map.put("def", def);
		addr.setAddrAddress(JSON.toJSONString(map));
		UserInfo user = (UserInfo) session.getAttribute("user");
		addr.setUserId(user.getUserId());
		addressService.update(addr);
		//获取地址栏的部分
		String dz = (String) session.getAttribute("dz");
		//mv.setViewName("redirect:/user/pay.do"+dz);
	}
/*	@RequestMapping("update")
	public ModelAndView update(HttpSession session,HttpServletRequest request,HttpServletResponse response) {
		ModelAndView mv  = new ModelAndView();
		AddressInfo addr = new AddressInfo(); 
		String p=request.getParameter("p");
		String c=request.getParameter("c");
		String a=request.getParameter("a");
		String addrId=request.getParameter("addrId");
		String detial=request.getParameter("detial");
		String addrPeople=request.getParameter("addrPeople");
		String addrPhone=request.getParameter("addrPhone");
		String def="0";
		addr.setAddrId(Integer.parseInt(addrId));
		addr.setAddrPeople(addrPeople);
		addr.setAddrPhone(addrPhone);
		//把省  时  区  详细地址转化为一个json字符串
		Map<String, String> map = new HashMap<>();
		map.put("p", p);
		map.put("c", c);
		map.put("a", a);
		map.put("detial", detial);
		map.put("def", def);
		addr.setAddrAddress(JSON.toJSONString(map));
		UserInfo user = (UserInfo) session.getAttribute("user");
		addr.setUserId(user.getUserId());
		addressService.update(addr);
		//获取地址栏的部分
		String dz = (String) session.getAttribute("dz");
		System.out.println(dz);
		mv.setViewName("redirect:/user/pay.do"+dz);
		return mv;
	}
*/}
