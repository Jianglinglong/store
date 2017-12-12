package com.team.store.service.home;

import java.util.List;

import com.team.store.mapper.ProductInfoMapper;
import com.team.store.po.ProductInfo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.team.store.mapper.ProBrandMapper;
import com.team.store.mapper.ProductClassMapper;
import com.team.store.po.ProBrand;
import com.team.store.po.ProductClass;



@Service("homeService")
public class HomeServiceImpl implements HomeService {

    @Autowired
	private ProductClassMapper mapper;	
    @Autowired
    private ProBrandMapper brandMapper;
    @Autowired
    private ProductInfoMapper proMapper;
	
	@Override
	public List<ProductClass> listClass() {
		return mapper.selectByExample(null);
	}

	@Override
	public List<ProBrand> listBrand() {
		return brandMapper.selectByExample(null);
	}

	@Override
	public List<ProductInfo> listProduct() {
		return proMapper.selectByExample(null);
	}
}
