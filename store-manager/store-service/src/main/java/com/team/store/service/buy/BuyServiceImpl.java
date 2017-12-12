package com.team.store.service.buy;

import java.util.List;

import com.team.store.mapper.ProductInfoMapper;
import com.team.store.po.ProductInfo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service("buyService")
public class BuyServiceImpl implements BuyService {

    @Autowired
    private ProductInfoMapper mapper;

    @Override
    public List<ProductInfo> getProducts() {
        return mapper.selectByExample(null);
    }

}
