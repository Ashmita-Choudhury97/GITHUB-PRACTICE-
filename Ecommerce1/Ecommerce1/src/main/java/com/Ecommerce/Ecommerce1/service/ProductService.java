package com.Ecommerce.Ecommerce1.service;

import com.Ecommerce.Ecommerce1.dto.ProductDto;

import java.util.List;

public interface ProductService {
    ProductDto createProduct(ProductDto productDto);
    ProductDto updateProduct(Long id,ProductDto productDto);
    List<ProductDto> getAllProducts();
    ProductDto getProductById(Long id);
    void  deleteProduct(Long id);


}
