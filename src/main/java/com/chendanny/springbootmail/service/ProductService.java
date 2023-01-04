package com.chendanny.springbootmail.service;


import com.chendanny.springbootmail.constant.ProductCategory;
import com.chendanny.springbootmail.dto.ProductRequest;
import com.chendanny.springbootmail.model.Product;

import java.util.List;

public interface ProductService {

    List<Product> getProducts(ProductCategory category,String search);
    Product getProductById(Integer productId);
    Integer createProduct(ProductRequest productRequset);

    void updateProduct(Integer productId,ProductRequest productRequest);

    void deleteProductById(Integer productId);
}
