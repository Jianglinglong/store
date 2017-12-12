package com.team.store.service.product;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.github.pagehelper.PageHelper;
import com.github.pagehelper.PageInfo;
import com.team.store.mapper.AppraiseInfoMapper;
import com.team.store.mapper.ProTotalSalesMapper;
import com.team.store.mapper.ProductInfoMapper;
import com.team.store.po.ProTotalSales;
import com.team.store.po.ProTotalSalesExample;
import com.team.store.po.ProTotalSalesExample.Criteria;
import com.team.store.po.ProductInfo;
import com.team.store.vo.LsyListVOAppraise;

@Service
public class ProductServiceImpl implements ProductService {

	@Autowired
	private AppraiseInfoMapper mapper;
	@Autowired
	private ProductInfoMapper proMapper;
	@Autowired
	private ProTotalSalesMapper proSaleMapper;
	@Override
	public List<LsyListVOAppraise> getAppraise(int proId) {
		PageHelper.startPage(1, 1);
		 List<LsyListVOAppraise> appraise = mapper.getAppraise(proId);
		 PageInfo page = new PageInfo<>(appraise);
		 mapper.getAppraise(proId);
//		return mapper.getAppraise(proId);
		return mapper.getAppraise(proId);
	}
	public PageInfo getAppraise(int proId,int pageNum,int pageSize) {
		PageHelper.startPage(pageNum, pageSize);
		 List<LsyListVOAppraise> appraise = mapper.getAppraise(proId);
			for(LsyListVOAppraise appr : appraise) {
				if("1".equals(appr.getApprNoname())) {
					String userName = appr.getUserName();
					String userNewName = "";
					userNewName = userName.charAt(0)+"***"+userName.charAt(userName.length()-1);
					appr.setUserName(userNewName);
				}
			}
		 PageInfo page = new PageInfo<>(appraise);
//		return mapper.getAppraise(proId);
		return page;
	}
	@Override
	public ProductInfo getProduct(int proId) {
		return proMapper.selectByPrimaryKey(proId);
	}
	@Override
	public int addProduct(ProductInfo prod) {
		proMapper.insert(prod);
		return prod.getProId();
	}
	@Override
	public int deleteProductById(int proId) {
		return proMapper.deleteByPrimaryKey(proId);
	}
	@Override
	public int updateProductById(ProductInfo prod) {
		return proMapper.updateByPrimaryKeySelective(prod);
	}
	@Override
	public int updateSaleNum(int proId,int psNum) {
		int row = 0;
		ProTotalSalesExample example = new ProTotalSalesExample();
		Criteria crt = example.createCriteria();
		crt.andProIdEqualTo(proId);
		List<ProTotalSales> saleList = proSaleMapper.selectByExample(example);
		if(saleList!=null&&saleList.size()>0) {
			ProTotalSales proSale = saleList.get(0);
			//商品销量加原销量 = 新销量
			proSale.setPsNum(psNum+proSale.getPsNum());
			 row = proSaleMapper.updateByPrimaryKey(proSale);
		}else {
			ProTotalSales proSale = new ProTotalSales();
			proSale.setPsNum(1);
			proSale.setProId(proId);
			 row = proSaleMapper.insert(proSale);
		}
		
		if(row>0) {
			row = updateProNum(psNum,proId);
		}
		
		return row;
	}
	@Override
	public int updateProNum(int psNum,int proId) {
		ProductInfo product = getProduct(proId);
		if(product.getProNum()-psNum>=0) {
		product.setProNum(product.getProNum()-psNum);
		}else {
			return 0;
		}
		return proMapper.updateByPrimaryKeySelective(product);
	}
}
