package com.team.store.controller.buy;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

import com.team.store.service.buy.BuyService;



@Controller
@RequestMapping("/buy")
public class BuyController {
    
	@Autowired
	@Qualifier("buyService")
	private BuyService buyService;
	@RequestMapping("/list")
	public ModelAndView list() {
	ModelAndView mv = new ModelAndView();
	mv.addObject("list", buyService.getProducts());
	mv.setViewName("home/introduction");
	return mv;
	}
}
