package com.chendanny.springbootmail.dto;

import com.chendanny.springbootmail.constant.ProductCategory;
import lombok.Data;

@Data
public class ProductQueryParams {

    ProductCategory category;
    String search;

}
