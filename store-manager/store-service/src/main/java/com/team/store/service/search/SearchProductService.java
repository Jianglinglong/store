package com.team.store.service.search;

import com.github.pagehelper.PageInfo;
import com.team.store.po.ProTotalSales;
import com.team.store.po.ProductClass;
import com.team.store.po.ProductInfo;
import com.team.store.vo.LsyListProduct;

import java.util.List;
import java.util.Map;

public interface SearchProductService {


    ProductInfo searchProduct(String value);

    List<ProductInfo> searchProductlist(String value);
    
    //查询所有商品集合
    List<ProductInfo> listProduct();
    
    List<ProTotalSales> listSales();
    //根据商品id查询商品详情
    ProductInfo searchProduct(int proId);
    //根据商品name模糊查询名字集合
    List<ProductInfo> listName(String proName);
    //查询商品分类
	ProductClass getProductClassType(int id);
	//模糊查询商品list呈现
	List<LsyListProduct> searchVoProductList(String value,String orderByProperty, String sort);
	//根据品牌名称查询品牌对象
	ProductClass searchProductClassByClassName(String value);
	//根据商品ID查询好评中评差评
	Map<String, Object> typeGood(int proId);

	PageInfo<LsyListProduct> searchVoProductList(String name, String orderByProperty, String sort, int pageNum,
			int pageSize); 
}
