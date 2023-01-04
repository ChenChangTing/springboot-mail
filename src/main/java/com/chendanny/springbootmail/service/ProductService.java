package com.chendanny.springbootmail.service;


import com.chendanny.springbootmail.dto.ProductRequest;
import com.chendanny.springbootmail.model.Product;

public interface ProductService {
    Product getProductById(Integer productId);
    Integer createProduct(ProductRequest productRequset);
}
