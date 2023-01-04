package com.chendanny.springbootmail.dao;

import com.chendanny.springbootmail.dto.ProductRequest;
import com.chendanny.springbootmail.model.Product;

public interface ProductDao {

    Product getProductById(Integer productId);

    Integer createProduct(ProductRequest productRequest);
}
