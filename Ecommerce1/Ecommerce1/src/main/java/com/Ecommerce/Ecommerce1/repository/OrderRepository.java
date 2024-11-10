package com.Ecommerce.Ecommerce1.repository;

import com.Ecommerce.Ecommerce1.model.Order;
import org.springframework.data.jpa.repository.JpaRepository;

public interface OrderRepository extends JpaRepository<Order, Long> {
}
