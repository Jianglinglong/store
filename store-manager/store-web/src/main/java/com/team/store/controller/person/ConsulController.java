package com.team.store.controller.person;


import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;




@Controller
@RequestMapping("consul")
public class ConsulController {
   


@RequestMapping("consul")
public ModelAndView initconsultatuon(){
	ModelAndView mv = new ModelAndView();
	
	mv.setViewName("/person/consultatuon");
	return mv;
}
}
