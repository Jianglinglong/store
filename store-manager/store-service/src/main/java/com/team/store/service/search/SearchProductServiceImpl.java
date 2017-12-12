package com.team.store.service.search;


import java.util.HashMap;
import java.util.List;
import java.util.Map;

import javax.annotation.Resource;

import com.alibaba.fastjson.JSON;
import com.github.pagehelper.PageHelper;
import com.github.pagehelper.PageInfo;
import com.team.store.consts.FootConstant;
import com.team.store.mapper.AppraiseInfoMapper;
import com.team.store.mapper.ProTotalSalesMapper;
import com.team.store.mapper.ProductClassMapper;
import com.team.store.mapper.ProductInfoMapper;
import com.team.store.po.*;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.team.store.po.ProductInfoExample.Criteria;
import com.team.store.utils.CollectionUtils;
import com.team.store.vo.LsyListProduct;

import redis.clients.jedis.Jedis;


@Service("lsyProductService")
public class SearchProductServiceImpl implements SearchProductService{
	@Resource(name="jedis")
	private Jedis jedis;
	@Autowired
	private ProductInfoMapper lsyProductMapper;
	
	@Autowired
	private ProTotalSalesMapper listSalesMapper;
	
	@Autowired
	private ProductClassMapper lsyProductClassMapper;
	
	@Autowired
	private ProductClassMapper lsyClassMapper;
	
	@Autowired
	private AppraiseInfoMapper lsyAppraiseMapper;
	
	@Override
	public ProductInfo searchProduct(String productName) {
		ProductInfoExample example = new ProductInfoExample();
		Criteria crt = example.createCriteria();
		crt.andProNameLike("%"+productName+"%");
		List<ProductInfo> selectByExample = lsyProductMapper.selectByExample(example);
		return  CollectionUtils.isNotEmpty(selectByExample)?selectByExample.get(0):null;
	}

	@Override
	public ProductClass getProductClassType(int id) {
		return lsyClassMapper.selectByPrimaryKey(id);
	}


	@Override
	public List<ProductInfo> searchProductlist(String productName) {
		ProductInfoExample example = new ProductInfoExample();
		Criteria crt = example.createCriteria();
		crt.andProNameLike(productName);
		return  lsyProductMapper.selectByExample(example);
	}


	@Override
	public List<LsyListProduct> searchVoProductList(String value,String orderByProperty,String sort) {
		return lsyProductMapper.getProductListBylsy(value,orderByProperty,sort);
	}


	@Override
	public ProductInfo searchProduct(int proId) {
		ProductInfo pro = null;
		String key = FootConstant._GOODS.getValue()+proId;
		String proJson = jedis.get(key);
		if (proJson!=null) {
			pro = JSON.parseObject(proJson, ProductInfo.class);
		}else {
			pro = lsyProductMapper.selectByPrimaryKey(proId);
			jedis.set(key, JSON.toJSONString(pro));
		}
		return pro;
	}

	@Override
	public ProductClass searchProductClassByClassName(String value) {
		ProductClassExample example = new ProductClassExample();
		com.team.store.po.ProductClassExample.Criteria crt = example.createCriteria();
		crt.andPcNameEqualTo(value);
		return lsyProductClassMapper.selectByExample(example).get(0);
	}

	@Override
	public List<ProductInfo> listName(String proName) {
		ProductInfoExample example = new ProductInfoExample();
		Criteria crt = example.createCriteria();
		crt.andProNameLike(proName+"%");
		return lsyProductMapper.selectByExample(example);
	}
	@Override
	public Map<String,Object> typeGood(int proId) {
		AppraiseInfoExample example = new AppraiseInfoExample();
		int countA=0;
		int countB=0;
		int countC=0;
		com.team.store.po.AppraiseInfoExample.Criteria crt = example.createCriteria();
		crt.andProIdEqualTo(proId);
		List<AppraiseInfo> list = lsyAppraiseMapper.selectByExample(example);
		for(AppraiseInfo appr : list) {
			if(appr.getApprType()==1) {
				countA++;
			}
			if(appr.getApprType()==2) {
				countB++;
			}
			if(appr.getApprType()==3) {
				countC++;
			}
		}
		Map<String,Object> typeMap = new HashMap<String,Object>();
		typeMap.put("A", countA);
		typeMap.put("B", countB);
		typeMap.put("C", countC);
		typeMap.put("D", countA+countB+countC);
		return typeMap;
	}

	@Override
	public PageInfo<LsyListProduct> searchVoProductList(String name, String orderByProperty, String sort, int pageNum,
			int pageSize) {
		PageHelper.startPage(pageNum, pageSize);
		
		List<LsyListProduct> listBylsy = lsyProductMapper.getProductListBylsy(name, orderByProperty, sort);
		PageInfo page = new PageInfo<>(listBylsy);
		
		
		//搜索到的商品数量
				int size = searchProductlist("%"+name+"%").size();
				
				
				//MAP将所有要传入页面的装入在内
				Map<String,Object> map = new HashMap<String,Object>();
				map.put("productNum", size);
		return page;
	}

	@Override
	public List<ProductInfo> listProduct() {
		return lsyProductMapper.selectByExample(null);
	}

	@Override
	public List<ProTotalSales> listSales() {
		List<ProTotalSales> proTotalSales = listSalesMapper.selectByExample(null);
		return proTotalSales;
	}

	
}
