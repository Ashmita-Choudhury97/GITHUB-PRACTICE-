package com.Ecommerce.Ecommerce1.controller;

import com.Ecommerce.Ecommerce1.dto.ProductDto;
import com.Ecommerce.Ecommerce1.service.ProductService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/products")
public class ProductController {

    @Autowired
   private  ProductService productService;

    @PostMapping
    public ProductDto createProduct(@RequestBody ProductDto productDto)
    {
        return productService.createProduct(productDto);
    }

    @PutMapping("/{id}")
    public ProductDto updateProduct(@PathVariable Long id, @RequestBody ProductDto productDto){
        return productService.updateProduct(id,productDto);
    }

   @GetMapping
  public List<ProductDto> getAllProduct(){
        return productService.getAllProducts();
    }


    @GetMapping("/{id}")
    public ProductDto getProductById(@PathVariable Long id) {
        return productService.getProductById(id);
    }

    @DeleteMapping("/{id}")
    public void deleteProduct(@PathVariable Long id) {
        productService.deleteProduct(id);
    }

}

