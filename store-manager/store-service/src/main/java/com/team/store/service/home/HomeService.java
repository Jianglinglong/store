package com.team.store.service.home;

import java.util.List;
import com.team.store.po.ProBrand;
import com.team.store.po.ProductClass;
import com.team.store.po.ProductInfo;

public interface HomeService {
    
	//查询所有商品分类
	List<ProductClass> listClass();
	
	//查询所有商品品牌
	List<ProBrand> listBrand();
	
	//查询所有商品（和分类品牌相关）
	List<ProductInfo> listProduct();
}
