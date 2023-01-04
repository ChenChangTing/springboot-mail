package com.chendanny.springbootmail.dao;

import com.chendanny.springbootmail.dto.ProductRequest;
import com.chendanny.springbootmail.model.Product;

import java.util.List;

public interface ProductDao {

    List<Product> getProducts();

    Product getProductById(Integer productId);

    Integer createProduct(ProductRequest productRequest);

    void updateProduct(Integer productId,ProductRequest productRequest);

    void deleteProductById(Integer productId);
}
