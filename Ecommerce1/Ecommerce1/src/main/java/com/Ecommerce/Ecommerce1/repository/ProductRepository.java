package com.Ecommerce.Ecommerce1.repository;

import com.Ecommerce.Ecommerce1.model.Product;
import org.springframework.data.jpa.repository.JpaRepository;

public interface ProductRepository extends JpaRepository<Product,Long> {
}
