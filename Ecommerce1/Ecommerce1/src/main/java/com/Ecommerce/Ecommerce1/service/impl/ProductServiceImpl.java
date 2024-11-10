package com.Ecommerce.Ecommerce1.service.impl;

import com.Ecommerce.Ecommerce1.dto.ProductDto;
import com.Ecommerce.Ecommerce1.model.Product;
import com.Ecommerce.Ecommerce1.repository.ProductRepository;
import com.Ecommerce.Ecommerce1.service.ProductService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.stream.Collectors;

@Service
public class ProductServiceImpl implements ProductService {

    @Autowired
    private ProductRepository productRepository;


    @Override
    public ProductDto createProduct(ProductDto productDto) {
        Product product=new Product();
product.setName(productDto.getName());
product.setDescription(productDto.getDescription());
product.setPrice(productDto.getPrice());
product.setQuantity(productDto.getQuantity());
product=productRepository.save(product);

return mapToDto(product);
    }

    @Override
    public ProductDto updateProduct(Long id, ProductDto productDto) {
        Product product=productRepository.findById(id).
                orElseThrow(()->new RuntimeException("product not found"));
        product.setName(productDto.getName());
        product.setDescription(productDto.getDescription());
        product.setPrice(productDto.getPrice());
        product.setQuantity(productDto.getQuantity());
        productRepository.save(product);
        return mapToDto(product);
    }



    @Override
    public List<ProductDto> getAllProducts() {
        return productRepository.findAll().stream().map(this::mapToDto).collect(Collectors.toList());
    }

    @Override
    public ProductDto getProductById(Long id) {
      Product product=  productRepository.findById(id).orElseThrow(()->new RuntimeException("Product not found"));
        return mapToDto(product);
    }

    @Override
    public void deleteProduct(Long id) {
        productRepository.deleteById(id);

    }

    private ProductDto mapToDto(Product product) {
        //The purpose of the mapToDto method is to transform the Product entity into a ProductDto, which is a simplified version of the entity used for communication between the backend and frontend.
        //The Product entity may contain additional fields or relationships (e.g., other objects or sensitive information) that should not be exposed to the frontend.
        ProductDto productDto = new ProductDto();
        productDto.setId(product.getId()); //The id of the Product entity is set in the ProductDto
        productDto.setName(product.getName());//The name of the product (e.g., "Laptop", "Shoes") from the Product entity is copied to the ProductDto.This will be exposed to the frontend so users can see the product name.
        productDto.setDescription(product.getDescription());
        productDto.setPrice(product.getPrice());
        productDto.setQuantity(product.getQuantity());
        return productDto;
    }
}
