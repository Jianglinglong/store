package com.team.store.controller.person;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

@Controller
@RequestMapping("suggest")
public class SuggestController {

	
	@RequestMapping("suggest")
	public ModelAndView initsuggest(){
		ModelAndView mv = new ModelAndView();
		
		mv.setViewName("/person/suggest");
		return mv;
	}
}
