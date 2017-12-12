package com.team.store.controller.register;


import java.util.List;

import javax.annotation.Resource;

import com.team.store.po.SendsmsInfo;
import com.team.store.po.UserInfo;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.servlet.ModelAndView;

import com.team.store.service.register.RegisterService;

@Controller
@RequestMapping("/register")
public class RegisterController {
	@Autowired
	@Resource(name = "registerService")
	private RegisterService registerService;

/*初始化注册页面*/
	@RequestMapping("/list")
	public ModelAndView list() {
		ModelAndView mv = new ModelAndView();
		mv.setViewName("home/register");
		return mv;
	}
	
/*	获取验证码*/
	@RequestMapping("/sendsms")//register/sendsms
	public @ResponseBody SendsmsInfo json2(String userAccount) {
		
		SendsmsInfo sendsms = new SendsmsInfo();
		System.out.println("------------------fsdfsdf");
		
		
		List<UserInfo> userList = registerService.selectByAccount(userAccount);
		
		boolean flag = userList!=null&&userList.size()>0 ? true : false;
		
		if(!flag){
			sendsms.setSendsmsNum(registerService.getSendsms(userAccount));
		}
		sendsms.setTrueOrFalse(flag);
		System.out.println(sendsms.isTrueOrFalse()+"*********************************");
		
		return sendsms;
	}
	
	/*	查询用户是否存在*/
	@RequestMapping("/sendUser")//register/sendsms
	public @ResponseBody SendsmsInfo json3(String userAccount) {
		
		SendsmsInfo sendsms = new SendsmsInfo();
		List<UserInfo> userList = registerService.selectByAccount(userAccount);
		sendsms.setTrueOrFalse(userList!=null&&userList.size()>0 ? true : false);
		System.out.println(sendsms.isTrueOrFalse()+"*********************************");
		return sendsms;
	}

/*	添加用户*/
	@RequestMapping("/addUser")
	public ModelAndView addUser(UserInfo record) {
		ModelAndView mv = new ModelAndView();
		System.out.println(record.getUserAccount()+"4444444444444444444444444");
		int row = registerService.insert(record);
		
		if(row > 0){
			mv.setViewName("home/home2");
			System.out.println("成功");
		}else{
			mv.setViewName("home/register");
			System.out.println("失败");
		}
		return mv;
	}

}
