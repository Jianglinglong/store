package com.team.store.controller.person;

import java.io.File;
import java.io.UnsupportedEncodingException;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Calendar;
import java.util.Date;
import java.util.List;
import java.util.Random;

import javax.annotation.Resource;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpSession;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.beans.propertyeditors.CustomDateEditor;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.WebDataBinder;
import org.springframework.web.bind.annotation.InitBinder;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.multipart.MultipartFile;
import org.springframework.web.servlet.ModelAndView;

import com.team.store.po.AddressInfo;
import com.team.store.po.SecurityQuestion;
import com.team.store.po.SendsmsInfo;
import com.team.store.po.UserInfo;
import com.team.store.service.person.PersonalDataService;
import com.team.store.service.register.RegisterService;



@Controller
@RequestMapping("personalData")
public class PersonalDataController {
    @Autowired
	@Resource(name = "personalDataService")
	private PersonalDataService personalDataService;
    
	@Autowired
	@Resource(name = "registerService")
	private RegisterService registerService;

/*	自动转换日期格式*/
	@InitBinder  
	public void initBinder(WebDataBinder binder) {  
	    SimpleDateFormat dateFormat = new SimpleDateFormat("yyyy-MM-dd");  
	    dateFormat.setLenient(false);  
	    binder.registerCustomEditor(Date.class, new CustomDateEditor(dateFormat, true));  
	}
	
	/*	初始化个人信息页面*/
	@RequestMapping("listIndex")
	public ModelAndView initIndex(HttpSession session){
		ModelAndView mv = new ModelAndView();
		UserInfo user = (UserInfo) session.getAttribute("user");
		if(user != null){
			mv.addObject("user", user);
			mv.setViewName("/person/data/index");
		}else{
			mv.setViewName("redirect:/login.jsp");
		}
		
		return mv;
	}
	
/*	初始化个人信息页面*/
	@RequestMapping("list")
	public ModelAndView initInformation(HttpSession session){
		ModelAndView mv = new ModelAndView();
		UserInfo user = (UserInfo) session.getAttribute("user");
		if(user != null){
			mv.addObject("user", user);
			mv.setViewName("/person/data/information");
		}else{
			mv.setViewName("redirect:/login.jsp");
		}
		
		return mv;
	}
	
/*	更新个人信息*/
	@RequestMapping("update")
	public ModelAndView update(HttpSession session,UserInfo record){
		UserInfo user = (UserInfo) session.getAttribute("user");
		record.setUserId(1005);
		record.setUserPhoto(user.getUserPhoto());
		record.setUserAccount(user.getUserAccount());
		record.setUserPassword(user.getUserPassword());
		System.out.println(record.getUserBirth());
		
		int row= personalDataService.updateByPrimaryKey(record);
		
		if(row>0){
			session.setAttribute("user", record);
			ModelAndView mv = new ModelAndView();
			mv.addObject("user", record);
			mv.setViewName("/person/data/information");	
			return mv;
		}else{
			System.out.println("更新失败");
			return null;
		}
	}
	
	
	/*上传头像*/
	@RequestMapping("/upload")
	/**
	 * @RequestParam: name: 表单文件域元素的名称的值 required： 默认为true, 可以设置也可以不设置
	 * 
	 * @return
	 */
	public @ResponseBody UserInfo upload(HttpSession session,@RequestParam(name = "file", required = false) MultipartFile uploadFile,
			HttpServletRequest request,UserInfo us) {
			
		UserInfo user = (UserInfo) session.getAttribute("user");
		    us.setUserId(user.getUserId());
			int row=0;
			System.out.println(us.getUserPhoto());
		if(us.getUserEmaill()!=null){
			us.setUserPhoto(user.getUserPhoto());
			row= personalDataService.updateByPrimaryKey(us);
			System.out.println(row>0?"成功":"失败");
		}
		else{
			System.out.println(uploadFile.getOriginalFilename());
			System.out.println(uploadFile.getName());
			System.out.println(uploadFile.getContentType());
			System.out.println(uploadFile.isEmpty());
			System.out.println(request.getSession().getServletContext().getRealPath("upload"));

			// 获取文件上传到服务器端的路径
			String realPath = request.getSession().getServletContext().getRealPath("upload");
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
			//String fileName = uploadFile.getOriginalFilename();
			int num = uploadFile.getOriginalFilename().lastIndexOf(".");//获取扩展名前面的‘.’的位置
			String name = uploadFile.getOriginalFilename().substring(num);//获取扩展名
			System.out.println(name);
			String fileName = "store"+year+"store"+month+"shop"+day+"a"+hour+"b"+minute+"c"+second+"d"+second+"e"+new Random().nextInt(10000)+name;
			System.out.println(fileName);
			File targetFile = new File(savePath, fileName);
			
			// 把源文件的文件拷贝到目标文件
			try {
				uploadFile.transferTo(targetFile);
			} catch (Exception e) {
				throw new RuntimeException("文件上传失败");
			} 
			
			us.setUserPhoto("upload/"+fileName);
			us.setUserAccount(user.getUserAccount());
			us.setUserPassword(user.getUserPassword());
			us.setUserBirth(user.getUserBirth());
			us.setUserEmaill(user.getUserEmaill());
			us.setUserName(user.getUserName());
			us.setSex(user.getSex());
			us.setUserPhone(user.getUserPhone());
			us.setUserRealname(user.getUserRealname());
			row= personalDataService.updateByPrimaryKey(us);
			System.out.println(row>0?"成功":"失败");
			session.setAttribute("user", us);
		}
        return us;
	}
	
	/*验证手机邮箱是否绑定*/
	public SendsmsInfo sends(){
		return null;
	}
	
	
	
	/*	初始化安全设置页面safety*/
	@RequestMapping("initSafety")
	public ModelAndView initSafety(HttpSession session){
		UserInfo user = (UserInfo) session.getAttribute("user");
		ModelAndView mv = new ModelAndView();
		if(user != null){
			mv.addObject("user",user);
			mv.setViewName("/person/data/safety");
		}else{
			mv.setViewName("redirect:/login.jsp");
		}

		return mv;
	}
	
	/*初始化修改密码页面*/
	@RequestMapping("initPassword")
	public ModelAndView initPassword(HttpSession session){
		UserInfo user = (UserInfo) session.getAttribute("user");
		ModelAndView mv = new ModelAndView();
		if(user != null){
			mv.setViewName("/person/data/password");
		}else{
			mv.setViewName("redirect:/login.jsp");
		}
		
		return mv;
	}
	/*判断原始密码输入是否正确*/
	@RequestMapping("password")
	public @ResponseBody SendsmsInfo password(HttpSession session,String oldPassword){
		UserInfo user = (UserInfo) session.getAttribute("user");
		SendsmsInfo sendsms = new SendsmsInfo();
		if(oldPassword.equals(user.getUserPassword())){
			sendsms.setTrueOrFalse(true);
		}
		else{
			sendsms.setTrueOrFalse(false);
		}
		return sendsms;
	}
	/*修改密码*/
	@RequestMapping("updatePassword")
	public @ResponseBody SendsmsInfo updatePassword(HttpSession session,String oldPassword,String newPassword){
		
		UserInfo user = (UserInfo) session.getAttribute("user");
		/*System.out.println(oldPassword+"+==+"+user.getUserPassword()+":"+newPassword);*/
		
		SendsmsInfo sendsms = new SendsmsInfo();
		if(oldPassword.equals(user.getUserPassword())){
			
			user.setUserPassword(newPassword);
			int row = personalDataService.updateByPrimaryKey(user);
			if(row > 0){
				session.setAttribute("user", user);
				sendsms.setTrueOrFalse(true);
			}
			else{
				sendsms.setTrueOrFalse(false);
			}
		}
		
		return sendsms;
	}
	

	/*初始化支付密码页面*/
	@RequestMapping("initSetpay")//HttpSession session
	public ModelAndView initSetpay(HttpSession session){
		ModelAndView mv = new ModelAndView();
		UserInfo user = (UserInfo) session.getAttribute("user");
		if(user != null){
			String phone = user.getUserPhone().substring(0,3)+"XXXX"+user.getUserPhone().substring(7);
			mv.addObject("phoneShow", phone);
			mv.setViewName("/person/data/setpay");
		}else{
			mv.setViewName("redirect:/login.jsp");
		}
		
		return mv;
	}
	/*发送验证码*/
	@RequestMapping("setpay")
	public @ResponseBody SendsmsInfo setpay(HttpSession session){
		UserInfo user = (UserInfo) session.getAttribute("user");
		SendsmsInfo sendsms = new SendsmsInfo();
		if(user != null){
			sendsms.setSendsmsNum(registerService.getSendsms(user.getUserPhone()));
			sendsms.setTrueOrFalse(true);
		}else{
			sendsms.setTrueOrFalse(false);
		}
		return sendsms;
	}
	/*设置支付密码*/
	@RequestMapping("addSetpay")
	public @ResponseBody SendsmsInfo addSetpay(HttpSession session,String payCode){
		UserInfo user = (UserInfo) session.getAttribute("user");
		user.setUserPay(payCode);
		int row = personalDataService.updateByPrimaryKey(user);
		SendsmsInfo sendsms = new SendsmsInfo();
		if(row > 0){
			session.setAttribute("user", user);
			sendsms.setTrueOrFalse(true);
		}else{
			sendsms.setTrueOrFalse(false);
		}
		return sendsms;
	}
	
	
	
	
	/*初始化换绑手机页面*/
	@RequestMapping("initBindphone")
	public ModelAndView initBindphone(HttpSession session){
		
		UserInfo user = (UserInfo) session.getAttribute("user");
		ModelAndView mv = new ModelAndView();
		if(user != null){
			String phone = user.getUserPhone().substring(0,3)+"XXXX"+user.getUserPhone().substring(7);
			mv.addObject("phoneShow", phone);
			mv.addObject("user", user);
			mv.setViewName("/person/data/bindphone");
		}else{
			mv.setViewName("redirect:/login.jsp");
		}
		
		
		return mv;
	}
	/*发送验证码old*/
	@RequestMapping("phoneCodeOld")
	public @ResponseBody SendsmsInfo phoneCode(HttpSession session){
		UserInfo user = (UserInfo) session.getAttribute("user");
		SendsmsInfo sendsms = new SendsmsInfo();
		if(user != null){
			sendsms.setSendsmsNum(registerService.getSendsms(user.getUserPhone()));
			sendsms.setTrueOrFalse(true);
		}else{
			sendsms.setTrueOrFalse(false);
		}
		return sendsms;
	}
	/*发送验证码new*/
	@RequestMapping("phoneCodeNew")
	public @ResponseBody SendsmsInfo phoneCodeNew(HttpSession session,String newPhone){
		UserInfo user = (UserInfo) session.getAttribute("user");
		SendsmsInfo sendsms = new SendsmsInfo();
		if(!newPhone.equals(user.getUserPhone())){
			sendsms.setSendsmsNum(registerService.getSendsms(newPhone));
			sendsms.setTrueOrFalse(true);
		}else{
			sendsms.setTrueOrFalse(false);
		}
		return sendsms;
	}
	/*修改手机号码*/
	@RequestMapping("updatePhone")
	public @ResponseBody SendsmsInfo updatePhone(HttpSession session,String newPhone){
		UserInfo user = (UserInfo) session.getAttribute("user");
		
		String showPhone = newPhone.substring(0,3)+"XXXX"+newPhone.substring(7);
		
		user.setUserPhone(newPhone);
		
		SendsmsInfo sendsms = new SendsmsInfo();
		
		int row = personalDataService.updateByPrimaryKey(user);
		if(row > 0){
			session.setAttribute("user", user);
			sendsms.setSendsmsNum(registerService.getSendsms(newPhone));
			sendsms.setUserPhone(showPhone);
			sendsms.setTrueOrFalse(true);
		}else{
			sendsms.setTrueOrFalse(false);
		}
		return sendsms;
	}
	
	
	
	
	/*初始化换绑邮箱页面*/
	@RequestMapping("initEmail")
	public ModelAndView initEmail(HttpSession session){
		UserInfo user = (UserInfo) session.getAttribute("user");
		ModelAndView mv = new ModelAndView();
		if(user != null){
			mv.setViewName("/person/data/email");
		}else{
			mv.setViewName("redirect:/login.jsp");
		}
		return mv;
	}
	/*发送验证码new*/
	@RequestMapping("emailCodeNew")
	public @ResponseBody SendsmsInfo emailCode(HttpSession session){
		UserInfo user = (UserInfo) session.getAttribute("user");
		SendsmsInfo sendsms = new SendsmsInfo();
		if(user.getUserPhone()!=null){
			sendsms.setSendsmsNum(registerService.getSendsms(user.getUserPhone()));
			sendsms.setTrueOrFalse(true);
		}else{
			sendsms.setTrueOrFalse(false);
		}
		return sendsms;
	}
	/*绑定邮箱*/
	@RequestMapping("addEmail")
	public @ResponseBody SendsmsInfo addEmail(HttpSession session,String email){
		UserInfo user = (UserInfo) session.getAttribute("user");
		SendsmsInfo sendsms = new SendsmsInfo();
		user.setUserEmaill(email);
		System.out.println(email);
		int row = personalDataService.updateByPrimaryKey(user);
		if(row > 0){
			session.setAttribute("user", user);
			sendsms.setTrueOrFalse(true);
		}else{
			sendsms.setTrueOrFalse(false);
		}
		return sendsms;
	}
	
	
	
	
	
	/*初始化实名认证页面*/
	@RequestMapping("initIdcard")
	public ModelAndView initIdcard(HttpSession session){
		UserInfo user = (UserInfo) session.getAttribute("user");
		ModelAndView mv = new ModelAndView();
		
		if(user != null){
			mv.setViewName("/person/data/idcard");
		}else{
			mv.setViewName("redirect:/login.jsp");
		}
		
		return mv;
	}
	
	
	/*初始化安全问题认证页面*/
	@RequestMapping("initQuestion")
	public ModelAndView initQuestion(HttpSession session){
		UserInfo user = (UserInfo) session.getAttribute("user");

		ModelAndView mv = new ModelAndView();
		if(user != null){
			List<SecurityQuestion> selectByUserIdList = personalDataService.selectByUserId(user.getUserId());
			String contextOne = personalDataService.selectByQuesId(selectByUserIdList.get(0).getQuesId()).getQuesContextone();
			String contextTwo = personalDataService.selectByQuesId(selectByUserIdList.get(1).getQuesId()).getQuesContextone();
			mv.addObject("questionOne",contextOne);
			mv.addObject("questionTwo",contextTwo);
			mv.setViewName("/person/data/question");
		}else{
			mv.setViewName("redirect:/login.jsp");
		}
		
		
		return mv;
	}

	/*设置安全问题*/
	@RequestMapping("setQuestion")
	/*以数组方式接收表单数据*/
	public @ResponseBody SendsmsInfo setQuestion(HttpSession session,String quesOne,String answerOne,String quesTwo,String answerTwo){
		UserInfo user = (UserInfo) session.getAttribute("user");
		String answerOne1 = "";
		String answerTwo1 = "";
		//处理乱码
		try {
			answerOne1 = new String(answerOne.getBytes("iso8859-1"),"utf-8");
			answerTwo1 = new String(answerTwo.getBytes("iso8859-1"),"utf-8");
		} catch (UnsupportedEncodingException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} 
		List<SecurityQuestion> selectByUserIdList = personalDataService.selectByUserId(user.getUserId());
		
		/*创建第一个问题对象*/
		SecurityQuestion oneSecurity = new SecurityQuestion();
		/*创建第二个问题对象*/
		SecurityQuestion twoSecurity = new SecurityQuestion();
		
		/*给第一个对象属性赋值*/
		int quesIdOne = personalDataService.selectQuestionByContext(quesOne).getQuesId();
		oneSecurity.setQuesId(quesIdOne);
		oneSecurity.setUserId(user.getUserId());
		oneSecurity.setSecuriryAnswer(answerOne1);
		
		/*给第二个对象属性赋值*/
		int quesIdTwo = personalDataService.selectQuestionByContext(quesTwo).getQuesId();
		twoSecurity.setUserId(user.getUserId());
		twoSecurity.setQuesId(quesIdTwo);
		twoSecurity.setSecuriryAnswer(answerTwo1);
		 
		SendsmsInfo sendsms = new SendsmsInfo();
		int rowOne ;
		int rowTwo ;
		
		/*已经设置过安全问题*/
		if(selectByUserIdList != null){
			oneSecurity.setSecurityId(selectByUserIdList.get(0).getSecurityId());
			twoSecurity.setSecurityId(selectByUserIdList.get(1).getSecurityId());
			rowOne = personalDataService.updateByPrimaryKey(oneSecurity);
			rowTwo = personalDataService.updateByPrimaryKey(twoSecurity);
		}else{
			rowOne = personalDataService.insertSelective(oneSecurity);
			rowTwo = personalDataService.insertSelective(twoSecurity);
		}
		
		
		if(rowOne > 0 && rowTwo > 0){
			sendsms.setTrueOrFalse(true);
		}else{
			sendsms.setTrueOrFalse(false);
		}
		return sendsms;
	}
/*----------------------------------------------------------------------------------------------------*/
	
	/*	初始化地址管理页面initAddress*/
	@RequestMapping("initAddress")
	public ModelAndView initAddress(HttpSession session){
		UserInfo user = (UserInfo) session.getAttribute("user");
		ModelAndView mv = new ModelAndView();
		if(user != null){
			List<AddressInfo> addressList = personalDataService.selectAddressByUserKey(user.getUserId());
			mv.addObject("addressList", addressList);
			mv.setViewName("/person/data/address");
		}else{
			mv.setViewName("redirect:/login.jsp");
		}

		return mv;
	}
	/*	添加地址addAddress*/
	@RequestMapping("addAddress")
	public ModelAndView addAddress(HttpSession session,AddressInfo addr){
		ModelAndView mv = new ModelAndView();
		UserInfo user = (UserInfo) session.getAttribute("user");
		if(user != null){
			addr.setUserId(user.getUserId());
			int row = personalDataService.insert(addr);

			if(row > 0){
				return initAddress(session);
			}else{
				
			}
		}else{
			mv.setViewName("redirect:/login.jsp");
		}
		return mv;
	}
	
/*	@RequestMapping("addAddress")
	public @ResponseBody SendsmsInfo  addAddress(HttpSession session,AddressInfo addr){
		
		UserInfo user = (UserInfo) session.getAttribute("user");
		addr.setUserId(user.getUserId());
		int row = personalDataService.insert(addr);
		
		SendsmsInfo sendsms = new SendsmsInfo();
		if(row > 0){
			sendsms.setTrueOrFalse(true);
		}else{
			sendsms.setTrueOrFalse(false);
		}
		return sendsms;
	}*/
	
	/*	初始化修改地址initUpdateAddress*/
	@RequestMapping("initUpdateAddress")
	public ModelAndView initUpdateAddress(HttpSession session,int addrId){
		UserInfo user = (UserInfo) session.getAttribute("user");
		ModelAndView mv = new ModelAndView();
		if(user != null){
			AddressInfo address = personalDataService.selectAddressByPrimaryKey(addrId);
			mv.addObject("address", address);
			mv.setViewName("person/data/updateAddress");
		}else{
			mv.setViewName("redirect:/login.jsp");
		}
		return mv;
	}
	
	/*	修改地址updateAddress*/
	@RequestMapping("updateAddress")
	public ModelAndView updateAddress(HttpSession session,AddressInfo addr,int addrId){

		UserInfo user = (UserInfo) session.getAttribute("user");
		ModelAndView mv = new ModelAndView();
		if(user != null){
			System.out.println(addrId);
			addr.setAddrId(addrId);
			addr.setUserId(user.getUserId());
			int row = personalDataService.updateByPrimaryKeySelective(addr);	
			System.out.println(row);
			if(row > 0){
				return initAddress(session);
			}
		}else{
			mv.setViewName("redirect:/login.jsp");
		}
		
		return null;
	}
	
	/*	删除地址deleteAddress*/
	@RequestMapping("deleteAddress")
	public ModelAndView deleteAddress(HttpSession session,int addrId){
		ModelAndView mv = new ModelAndView();
		UserInfo user = (UserInfo) session.getAttribute("user");
		if(user != null){
			int row = personalDataService.deleteByPrimaryKey(addrId);
			if(row > 0){
				return initAddress(session);
			}else{
				
			}
		}else{
			mv.setViewName("redirect:/login.jsp");
		}
		
		return mv;
	}
	
	
/*----------------------------------------------------------------------------------------------------*/	
	
	/*	初始化快捷支付页面safety*/
	@RequestMapping("initCardlist")
	public ModelAndView initCardlist(HttpSession session){
		UserInfo user = (UserInfo) session.getAttribute("user");
		ModelAndView mv = new ModelAndView();
		if(user != null){
			mv.setViewName("/person/data/cardlist");
		}else{
			mv.setViewName("redirect:/login.jsp");
		}
		
		
		return mv;
	}
	/*	初始化绑定银行卡页面cardmethod*/
	@RequestMapping("initCardmethod")
	public ModelAndView initCardmethod(HttpSession session){
		UserInfo user = (UserInfo) session.getAttribute("user");
		ModelAndView mv = new ModelAndView();
		if(user != null){
			mv.setViewName("/person/data/cardmethod");
		}else{
			mv.setViewName("redirect:/login.jsp");
		}
		
		
		return mv;
	}
/*----------------------------------------------------------------------------------------------------*/
	
}
