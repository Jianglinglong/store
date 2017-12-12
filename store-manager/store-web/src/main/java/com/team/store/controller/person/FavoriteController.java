package com.team.store.controller.person;

import java.util.List;
import java.util.TreeMap;

import javax.annotation.Resource;
import javax.servlet.http.HttpSession;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.servlet.ModelAndView;

import com.team.store.po.ProductInfo;
import com.team.store.po.UserInfo;
import com.team.store.service.person.FavoriteService;

@Controller
@RequestMapping("favorite")
public class FavoriteController {

	@Resource
	private FavoriteService favoriteService;
	
	@RequestMapping("show")
	public ModelAndView showFavorite(HttpSession session) {
		ModelAndView view = new ModelAndView();
		UserInfo user = (UserInfo) session.getAttribute("user");
		if(user!=null) {
			TreeMap<String,ProductInfo> favorites = favoriteService.getFavorites(user.getUserId());
			view.addObject("favorite", favorites);
			view.setViewName("person/favorite");
		}else {
			view.setViewName("redirect:/login.jsp");
		}
		return view;
	}
	@RequestMapping("delete")
	@ResponseBody
	public String deleteFavorite(HttpSession session , int proId) {
		UserInfo user = (UserInfo) session.getAttribute("user");
		favoriteService.deleteFavorite(user.getUserId(), proId);
		return "true";
	}
	@RequestMapping("add")
	@ResponseBody
	public boolean addFavorite(HttpSession session,int proId) {
		UserInfo user = (UserInfo) session.getAttribute("user");
		return favoriteService.addToFavorite(user.getUserId(), proId);
	}
}
