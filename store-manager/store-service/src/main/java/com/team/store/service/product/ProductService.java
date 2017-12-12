package com.team.store.service.product;

import java.util.List;


import com.github.pagehelper.PageInfo;
import com.team.store.po.ProductInfo;
import com.team.store.vo.LsyListVOAppraise;

public interface ProductService {

	//根据商品id查询评价表
	List<LsyListVOAppraise> getAppraise(int proId);
	
	 PageInfo getAppraise(int proId,int pageNum,int pageSize);
	 
	 //Id查询商品信息
	 ProductInfo getProduct(int proId);
	 
	 //添加商品()
	 int addProduct(ProductInfo prod);
	 
	 //删除商品
	 int deleteProductById(int proId);
	 
	 //修改商品
	 int updateProductById(ProductInfo prod);
	 
	 //根据商品ID修改销量表
	 int updateSaleNum(int proId,int psNum);
	 
	 //根据影响行数决定增减库存
	 int updateProNum(int psNum,int proId);
}