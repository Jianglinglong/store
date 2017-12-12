package com.team.store.controller;

import java.io.UnsupportedEncodingException;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Map;
import java.util.Set;

import javax.annotation.Resource;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpSession;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.servlet.ModelAndView;

import com.alibaba.fastjson.JSON;
import com.team.store.po.ProTotalSales;
import com.team.store.po.ProductInfo;
import com.team.store.po.ShopCart;
import com.team.store.po.UserInfo;
import com.team.store.pojo.ProBigImgBean;
import com.team.store.pojo.ProImgBean;
import com.team.store.pojo.ProductLevelBean;
import com.team.store.service.ShopCartService;
import com.team.store.service.foot.FootServicewhl;
import com.team.store.service.search.SearchProductService;
import com.team.store.vo.LsyListProduct;

@Controller
@RequestMapping("searchProduct")
public class SearchController {

	@Autowired
	@Qualifier("lsyProductService")
	private SearchProductService searchService;
	@Resource(name = "footServicewhl")
	private FootServicewhl footService;
	@Resource
	private ShopCartService shopCartService;
	@RequestMapping("search")
	public ModelAndView searchByName(ProductInfo prod, HttpSession session) throws Exception {
		ModelAndView mv = new ModelAndView();
		if (prod.getProId() != null) {
			ProductInfo idProduct = searchService.searchProduct(prod.getProId());
			String proName2 = idProduct.getProName();
			prod.setProName(proName2);
		}
		if (prod.getProName() == null) {
			prod.setProName("");
		}
		List<LsyListProduct> list1 = searchService.searchVoProductList("%" + prod.getProName().trim() + "%",
				"p.pro_price", "desc");
		// 查询到的商品数量
		mv.addObject("productNum", list1.size());
		// 通过名字模糊查询到vo集合
		if (list1.size() > 0 && list1 != null) {
			mv.addObject("list1", list1);
			Set<String> pbNameSet = new HashSet<>();
			Set<String> ptNameSet = new HashSet<>();
			for (LsyListProduct pro1 : list1) {
				String img = pro1.getProImg();
				ProImgBean imgBean = JSON.parseArray(img, ProImgBean.class).get(0);
				pro1.setProImg(imgBean.getM());
				pbNameSet.add(pro1.getPbName());
				ptNameSet.add(pro1.getPtName());
			}

			// 拿到品牌名称
			mv.addObject("pbNames", pbNameSet);
			// 拿到种类名称
			mv.addObject("ptNames", ptNameSet);
			// 模糊拿到搜索商品的id用于查找商品的分类
			ProductInfo product = searchService.searchProduct(prod.getProName());
			mv.addObject("productClass", searchService.getProductClassType(product.getPcId()));
		}
		UserInfo user = (UserInfo) session.getAttribute("user");
		if(user!=null) {
			List<ShopCart> listShopCart = shopCartService.listShopCart(user.getUserId());
			int shopCartSize = listShopCart.size();
			mv.addObject("shopCartSize",shopCartSize);
		}
		mv.addObject("shopCartSize",0);
		mv.addObject("searchName", prod.getProName());
		mv.setViewName("searchproduct");

		return mv;
	}

	@RequestMapping("product")
	public ModelAndView getProduct(int proId,HttpSession session) {
		ModelAndView mv = new ModelAndView();
		ProductInfo product = searchService.searchProduct(proId);
		List<ProductInfo> listProduct = searchService.listProduct();
		List<ProTotalSales> listSales = searchService.listSales();
		String type1 = product.getProLevel1();
		String level2 = product.getProLevel2();
		int pbId = product.getPbId(); 
		String proImg = product.getProImg();
		String proBigImg = product.getProBigImg();
		
		List<ProBigImgBean> bigImgs = JSON.parseArray(proBigImg, ProBigImgBean.class);
		List<ProImgBean> imgs = JSON.parseArray(proImg, ProImgBean.class);
		List<ProductLevelBean> list = JSON.parseArray(type1, ProductLevelBean.class);
		List<ProductLevelBean> level = JSON.parseArray(level2, ProductLevelBean.class);
		Map<String, Object> typeGood = searchService.typeGood(proId);
		
		
		String proListImg = null;
		for(ProductInfo pro : listProduct){
			proListImg = pro.getProImg();
			ProImgBean proImgBean = JSON.parseArray(proListImg, ProImgBean.class).get(0);
			pro.setProImg(proImgBean.getM());
		}

		mv.addObject("listProduct", listProduct);
		mv.addObject("listSize", listSales.size());
		mv.addObject("typeGood", typeGood);
		mv.addObject("product", product);
		mv.addObject("type1", list);
		mv.addObject("type2", level);
		mv.addObject("imgs", imgs);
		mv.addObject("bigImgs", bigImgs);
		mv.setViewName("home/introduction");

		/********************* 添加入足迹 ******************************/
		UserInfo user = (UserInfo) session.getAttribute("user");
		if(user!=null) {
			List<ShopCart> listShopCart = shopCartService.listShopCart(user.getUserId());
			int shopCartSize = listShopCart.size();
			mv.addObject("shopCartSize",shopCartSize);
			footService.addFoot(user.getUserId(), proId);
		}else {
			mv.addObject("shopCartSize",0);
		}
//		History his = new History();
//		his.setHistoryTime(new Date());
//		his.setUserId(user.getUserId());
//		his.setProId(proId);
//		footService.addFoot(his);
		
		return mv;
	}

	//自动提示框
	@SuppressWarnings("unused")
	@ResponseBody
	@RequestMapping("listName")
	public List<ProductInfo> listName(ProductInfo prod) throws UnsupportedEncodingException {
		// String name = new
		// String(request.getParameter("proName").getBytes("ISO-8859-1"), "UTF-8");
		String name = prod.getProName();
		List<ProductInfo> listName = searchService.listName(prod.getProName());
		return listName;
	}

	@RequestMapping("secondsearch")
	public ModelAndView search2(HttpServletRequest request) {

		ModelAndView mv = new ModelAndView();
		String parameter = request.getParameter("flag");
		String order = "s.ps_Num";
		String sort = "desc";
		if (parameter != null) {
			switch (parameter) {
			case "1":
				order = "p.pro_price";
				break;
			case "2":
				order = "p.pro_price";
				sort = "asc";
				break;
			case "3":

				break;
			default:
				break;
			}
		}
		// value : 品牌名|type:种类 | name:搜索字段名
		String name = request.getParameter("name");
		String value = request.getParameter("name0");
		String type = request.getParameter("name1");
		// 请求方式
		String method = request.getMethod();
		if ("全部".equals(name)) {
			name = "";
		}
		// 通过名字模糊查询到vo集合
		List<LsyListProduct> list1 = searchService.searchVoProductList("%" + name + "%", order + " " + sort, "");
		parse(list1, mv);
		if (list1.size() > 0 && list1 != null) {
			List<LsyListProduct> list = new ArrayList<LsyListProduct>();
			mv.addObject("list1", list1);
			if (null == value || "全部".equals(value) || "".equals(value)) {
				// 无品牌无种类
				if (null == type || "全部".equals(type) || "".equals(type)) {
					list.addAll(list1);
				} else {
					// 无品牌有种类
					for (LsyListProduct pro1 : list1) {
						if (pro1.getPtName().equals(type)) {
							list.add(pro1);
						}
					}
				}
			} else {
				// 有品牌无种类
				if (null == type || "全部".equals(type) || "".equals(type)) {
					for (LsyListProduct pro1 : list1) {
						if (value.equals(pro1.getPbName())) {
							list.add(pro1);
						}
					}
				} else {
					// 有品牌有种类
					for (LsyListProduct pro1 : list1) {
						if (pro1.getPtName().equals(type) && value.equals(pro1.getPbName())) {
							list.add(pro1);
						}
					}
				}
			}

			mv.addObject("list1", list);
			// 查询到的商品数量
			mv.addObject("productNum", list.size());
		}

		mv.setViewName("search/productList");
		return mv;
	}

	@RequestMapping("pageSearch")
	public ModelAndView search3(HttpServletRequest request, Integer pageNum) {
		ModelAndView mv = new ModelAndView();

		String parameter = request.getParameter("flag");
		String order = "s.ps_Num";
		String sort = "desc";
		if (parameter != null) {
			switch (parameter) {
			case "1":
				order = "p.pro_price";
				break;
			case "2":
				order = "p.pro_price";
				sort = "asc";
				break;
			case "3":

				break;
			default:
				break;
			}
		}
		int flag = 0;
		try {
			// value : 品牌名|type:种类 | name:搜索字段名
			String name = new String(request.getParameter("name").getBytes("ISO8859-1"), "UTF-8").trim();
			String value = new String(request.getParameter("name0").getBytes("ISO8859-1"), "UTF-8");
			String type = new String(request.getParameter("name1").getBytes("ISO8859-1"), "UTF-8");

			if ("全部".equals(name.trim())) {
				name = "";
			}
			// 查询到的商品数量
			mv.addObject("productNum", searchService.searchProductlist("%" + name + "%").size());
			// 通过名字模糊查询到vo集合
			List<LsyListProduct> list1 = searchService.searchVoProductList("%" + name + "%", order + " " + sort, "");
			parse(list1, mv);
			if (list1.size() > 0 && list1 != null) {
				List<LsyListProduct> list = new ArrayList<LsyListProduct>();
				mv.addObject("list1", list1);
				if ("null".equals(value) || "全部".equals(value) || "".equals(value)) {
					// 无品牌无种类
					if ("null".equals(type) || "全部".equals(type) || "".equals(type)) {
						for (LsyListProduct pro1 : list1) {
							list.add(pro1);
						}
					} else {
						// 无品牌有种类
						for (LsyListProduct pro1 : list1) {
							if (pro1.getPtName().equals(type)) {
								list.add(pro1);
							}
						}
					}
				} else {
					// 有品牌无种类
					if ("null".equals(type) || "全部".equals(type) || "".equals(type)) {
						for (LsyListProduct pro1 : list1) {
							if (value.equals(pro1.getPbName())) {
								list.add(pro1);
							}
						}
					} else {
						// 有品牌有种类
						for (LsyListProduct pro1 : list1) {
							if (pro1.getPtName().equals(type) && value.equals(pro1.getPbName())) {
								list.add(pro1);
							}
						}
					}
				}

				mv.addObject("list1", list);
				mv.setViewName("search/productList");
			}
		} catch (UnsupportedEncodingException e) {
			e.printStackTrace();
		}
		return null;
	}

	private void parse(List<LsyListProduct> list1, ModelAndView mv) {
		if (list1.size() > 0 && list1 != null) {
			mv.addObject("list1", list1);
			Set<String> pbNameSet = new HashSet<>();
			Set<String> ptNameSet = new HashSet<>();
			for (LsyListProduct pro1 : list1) {
				String img = pro1.getProImg();
				ProImgBean imgBean = JSON.parseArray(img, ProImgBean.class).get(0);
				pro1.setProImg(imgBean.getM());
				pbNameSet.add(pro1.getPbName());
				ptNameSet.add(pro1.getPtName());
			}

			// 拿到品牌名称
			mv.addObject("pbNames", pbNameSet);
			// 拿到种类名称
			mv.addObject("ptNames", ptNameSet);
		}
	}

}
