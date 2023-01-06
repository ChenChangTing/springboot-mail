package com.chendanny.springbootmail.dto;

import com.chendanny.springbootmail.constant.ProductCategory;
import lombok.Data;

@Data
public class ProductQueryParams {

    ProductCategory category;
    private String search;
    private String orderBy;
    private String sort;
    private Integer limit;
    private Integer Ooffset;

}
