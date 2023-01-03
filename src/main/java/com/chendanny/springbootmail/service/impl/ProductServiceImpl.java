package com.chendanny.springbootmail.service.impl;

import com.chendanny.springbootmail.dao.ProductDao;
import com.chendanny.springbootmail.model.Product;
import com.chendanny.springbootmail.service.ProductService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
public class ProductServiceImpl implements ProductService {

    @Autowired
    private ProductDao productDao;
    @Override
    public Product getProductById(Integer productId) {
        return productDao.getProductById(productId);
    }
}
