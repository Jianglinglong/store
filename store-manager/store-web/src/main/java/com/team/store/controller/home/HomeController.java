package com.team.store.controller.home;

import java.util.List;

import javax.annotation.Resource;
import javax.servlet.http.HttpSession;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

import com.alibaba.fastjson.JSON;
import com.team.store.po.ProBrand;
import com.team.store.po.ProductClass;
import com.team.store.po.ProductInfo;
import com.team.store.po.ShopCart;
import com.team.store.po.UserInfo;
import com.team.store.pojo.ProImgBean;
import com.team.store.service.ShopCartService;
import com.team.store.service.home.HomeService;
import com.team.store.service.rl.OrderService;
import com.team.store.vo.rl.OrderAndProduct;


@Controller
@RequestMapping("/home")
public class HomeController {
    @Autowired
    @Qualifier("homeService")
    private HomeService homeService;
    @Resource
    private ShopCartService shopCartService;

//    @RequestMapping("/list")
//    public ModelAndView getProduct() {
//        ModelAndView mv = new ModelAndView();
//        List<ProductClass> listClass = homeService.listClass();
//        List<ProBrand> listBrand = homeService.listBrand();
//        List<ProductInfo> listProduct = homeService.listProduct();
//        mv.addObject("listClass", listClass);
//        mv.addObject("listBrand", listBrand);
//        mv.addObject("listProduct", listProduct);
//        for (ProductInfo pro : listProduct) {
//            String proImg = pro.getProImg();
//            ProImgBean proImgBean = JSON.parseArray(proImg, ProImgBean.class).get(0);
//            pro.setProImg(proImgBean.getM());
//        }
//        mv.setViewName("home/home2");
//        return mv;
//    }

    @RequestMapping("/list")
    public ModelAndView list(HttpSession session) {
        ModelAndView mv = new ModelAndView();
        List<ProductClass> listClass = homeService.listClass();
        List<ProBrand> listBrand = homeService.listBrand();
        List<ProductInfo> listProduct = homeService.listProduct();
        mv.addObject("listClass", listClass);
        mv.addObject("listBrand", listBrand);
        mv.addObject("listProduct", listProduct);
        for (ProductInfo pro : listProduct) {
            String proImg = pro.getProImg();
            ProImgBean proImgBean = JSON.parseArray(proImg, ProImgBean.class).get(0);
            pro.setProImg(proImgBean.getM());
        }
        UserInfo user = (UserInfo) session.getAttribute("user");
        //徐帆 添加显示购物车数量
        List<ShopCart> listShopCart = null;
        if (user != null) {
            listShopCart = shopCartService.listShopCart(user.getUserId());
        }
        int shopCartSize = 0;
        if (listShopCart != null) {
            shopCartSize = listShopCart.size();
        }
        mv.addObject("shopCartSize", shopCartSize);
        mv.setViewName("home/home2");
        return mv;
    }
}
