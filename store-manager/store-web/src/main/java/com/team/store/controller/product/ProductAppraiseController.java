package com.team.store.controller.product;

import java.text.ParseException;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import com.github.pagehelper.PageInfo;
import com.team.store.po.ProductInfo;
import com.team.store.service.product.ProductService;
import com.team.store.service.rl.OrderService;
import com.team.store.vo.LsyListVOAppraise;
import com.team.store.vo.rl.OrderAndProduct;

@Controller
@RequestMapping("/product")
public class ProductAppraiseController {

	@Autowired
	private ProductService service;

	@RequestMapping("/appraise")
	@ResponseBody
	public List<LsyListVOAppraise> listAppr(ProductInfo prod) throws ParseException {
		List<LsyListVOAppraise> appraise = service.getAppraise(prod.getProId());
		for(LsyListVOAppraise appr : appraise) {
			if("1".equals(appr.getApprNoname())) {
				String userName = appr.getUserName();
				String userNewName = "";
				userNewName = userName.charAt(0)+"***"+userName.charAt(userName.length()-1);
				appr.setUserName(userNewName);
			}
		}
//		mv.addObject("listAppr",service.getAppraise(prod.getProId()));
		return appraise;
	}
	
	@RequestMapping("/test")
	@ResponseBody
	public PageInfo listAppr1(ProductInfo prod,int pageNum) throws ParseException {
		int pageNum2 = pageNum;
		return service.getAppraise(prod.getProId(), pageNum, 8);
	}
	
}
